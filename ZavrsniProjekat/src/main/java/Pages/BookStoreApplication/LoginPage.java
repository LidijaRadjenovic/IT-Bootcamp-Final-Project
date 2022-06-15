package Pages.BookStoreApplication;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class LoginPage extends BasePage {
    private By newUserButton = By.id("newUser");
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By userName = By.id("userName");
    private By password = By.id("password");
    private By captcha = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]");
    private By registerButton = By.id("register");
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    Actions actions = new Actions(getDriver());

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getNewUserButton(){
        return getDriver().findElement(newUserButton);
    }
    public WebElement getFirstName(){
        return getDriver().findElement(firstName);
    }
    public WebElement getLastName(){
        return getDriver().findElement(lastName);
    }
    public WebElement getUserName(){
        return getDriver().findElement(userName);
    }
    public WebElement getPassword(){
        return getDriver().findElement(password);
    }

    public WebElement getRegisterButton(){
        return getDriver().findElement(registerButton);
    }

    public void clickNewUserButton(){
        getNewUserButton().click();
    }

    public void enterFirstName(String firstName){
        getFirstName().sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        getLastName().sendKeys(lastName);
    }
    public void enterUserName(String userName){
        getUserName().sendKeys(userName);
    }
    public void enterPassword(String password){
        getPassword().sendKeys(password);
    }
    public void clickCaptcha(){
        getDriverWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"g-recaptcha\"]/div/div/iframe")));
        getDriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"))).click();
    }

    public void clickRegisterButton(){
//        //*[@id="google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0__container__"]
//        getDriverWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/iframe")));
//        getDriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"register\"]"))).click();
        getRegisterButton().click();
    }

    public void loginPageUrl(){
        getDriver().navigate().to("https://demoqa.com/register");
    }

    public void registerNewUser(String firstName, String lastName, String userName, String password) throws InterruptedException {
        loginPageUrl();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterUserName(userName);
        js.executeScript("arguments[0].scrollIntoView();", getPassword());
        enterPassword(password);
        clickCaptcha();
        Thread.sleep(5000);
        getDriver().switchTo().parentFrame();
        //actions.moveToElement(getRegisterButton());
        clickRegisterButton();

    }

    public boolean isAlertMessageDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        try {
            getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }

    public void alertMessage() throws InterruptedException {
        Thread.sleep(5000);
        getDriver().switchTo().alert().accept();
    }
}
