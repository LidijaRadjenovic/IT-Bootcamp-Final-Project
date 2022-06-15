package Pages.Elements;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class ButtonsPage extends BasePage {

    private By doubleClickMeButton = By.id("doubleClickBtn");
    private By rightClickButton = By.id("rightClickBtn");
    private By clickMeButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickMessage = By.id("rightClickMessage");
    private By dynamicClickMessage = By.id("dynamicClickMessage");
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    Actions actions = new Actions(getDriver());
    public ButtonsPage (WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getDoubleClickMeButton(){
        return getDriver().findElement(doubleClickMeButton);
    }
    public WebElement getRightClickButton(){
        return getDriver().findElement(rightClickButton);
    }
    public WebElement getClickMeButton(){
        return getDriver().findElement(clickMeButton);
    }

    public void doubleClick(){
        actions.doubleClick(getDoubleClickMeButton()).perform();
    }

    public void rightClick(){
        actions.contextClick(getRightClickButton()).perform();
    }

    public void clickMe(){
        getClickMeButton().click();
    }

    public WebElement getDoubleClickMessage(){
        return getDriver().findElement(doubleClickMessage);
    }

    public WebElement getRightClickMessage(){
        return getDriver().findElement(rightClickMessage);
    }

    public WebElement getDynamicClickMessage(){
        return getDriver().findElement(dynamicClickMessage);
    }

    public void buttonsPageUrl(){
        getDriver().navigate().to("https://demoqa.com/buttons");
    }

    public void performClicksOnButtons(){
        buttonsPageUrl();
        doubleClick();
        rightClick();
        clickMe();
    }


}
