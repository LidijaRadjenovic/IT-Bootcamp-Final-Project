package pages.elements;

import pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class TextBoxPage extends BasePage {

    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By enteredName = By.id("name");
    private By enteredEmail = By.id("email");
    private By enteredCurrentAddress = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]");
    private By enteredPermanentAddress = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[4]");

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    public WebElement getFullName(){
        return getDriver().findElement(fullName);
    }
    public WebElement getEmail(){
        return getDriver().findElement(email);
    }
    public WebElement getCurrentAddress(){
        return getDriver().findElement(currentAddress);
    }
    public WebElement getPermanentAddress(){
        return getDriver().findElement(permanentAddress);
    }
    public WebElement getEnteredName(){
        return getDriver().findElement(enteredName);
    }

    public WebElement getEnteredEmail(){
        return getDriver().findElement(enteredEmail);
    }
    public WebElement getEnteredCurrentAddress(){
        return getDriver().findElement(enteredCurrentAddress);
    }
    public WebElement getEnteredPermanentAddress(){
        return getDriver().findElement(enteredPermanentAddress);
    }
    public WebElement getSubmitButton(){
        return getDriver().findElement(submitButton);
    }

    public void enterFullName(String name){
        getFullName().sendKeys(name);
    }
    public void enterEmail(String email){
        getEmail().sendKeys(email);
    }
    public void enterCurrentAddress(String currentAddress){
        getCurrentAddress().sendKeys(currentAddress);
    }
    public void enterPermanentAddress(String permanentAddress){
        getPermanentAddress().sendKeys(permanentAddress);
    }

    public void clickSubmitButton(){
        js.executeScript("arguments[0].scrollIntoView();", getSubmitButton());
        getSubmitButton().click();
    }
    public void textBoxUrl(){
        getDriver().navigate().to("https://demoqa.com/text-box");
    }

    public void fillTextForm(String name, String email, String currentAddress, String permanentAddress){
        textBoxUrl();
        enterFullName(name);
        enterEmail(email);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);
        clickSubmitButton();
    }

    public void enterInvalidEmail(String email){
        //textBoxUrl();
        enterEmail(email);
        clickSubmitButton();
    }

}
