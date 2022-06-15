package Pages.AlertsFrameWindows;

import Pages.BasePage;
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

    public AlertsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getAlertButton(){
        return getDriver().findElement(alertButton);
    }

    public void alertsPageUrl(){
        getDriver().navigate().to("https://demoqa.com/alerts");
    }

    public void clickAlertButton(){
        alertsPageUrl();
        getAlertButton().click();
    }

    public boolean isAlertMessageDisplayed(){
        try {
            getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }

    public void alertMessage(){
        getDriver().switchTo().alert().accept();
    }
}