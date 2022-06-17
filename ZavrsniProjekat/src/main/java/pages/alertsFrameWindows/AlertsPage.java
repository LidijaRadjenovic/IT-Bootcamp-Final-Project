package pages.alertsFrameWindows;

import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class AlertsPage extends BasePage{

    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmAlertButton = By.id("confirmButton");
    private By promptAlertButton = By.id("promtButton");
    private By selectedMessage = By.id("confirmResult");
    private By enteredNameMessage = By.id("promptResult");

    public AlertsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getAlertButton(){
        return getDriver().findElement(alertButton);
    }
    public WebElement getTimerAlertButton(){
        return getDriver().findElement(timerAlertButton);
    }
    public WebElement getConfirmAlertButton(){
        return getDriver().findElement(confirmAlertButton);
    }
    public WebElement getPromptAlertButton(){
        return getDriver().findElement(promptAlertButton);
    }
    public WebElement getSelectedMessage(){
        return getDriver().findElement(selectedMessage);
    }
    public WebElement getEnteredNameMessage(){
        return getDriver().findElement(enteredNameMessage);
    }

    public void alertsPageUrl(){
        getDriver().navigate().to("https://demoqa.com/alerts");
    }

    public void clickAlertButton(){
        alertsPageUrl();
        getAlertButton().click();
    }
    public void clickTimerAlertButton() throws InterruptedException {
        alertsPageUrl();
        getTimerAlertButton().click();
    }

    public void clickConfirmAlertButton(){
        alertsPageUrl();
        getConfirmAlertButton().click();
    }
    public void clickPromptAlertButton(){
        alertsPageUrl();
        getPromptAlertButton().click();
    }

    public boolean isAlertMessageDisplayed(){
        try {
            getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }

    public void acceptAlert(){
        getDriver().switchTo().alert().accept();
    }
    public void dismissAlert(){
        getDriver().switchTo().alert().dismiss();
    }
    public void sendValueToAlert(String name){
        getDriver().switchTo().alert().sendKeys(name);
    }
}