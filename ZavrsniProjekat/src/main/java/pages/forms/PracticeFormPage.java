package pages.forms;

import org.openqa.selenium.JavascriptExecutor;
import pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class PracticeFormPage extends BasePage {
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By genderMale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label");
    private By mobileNumber = By.id("userNumber");
    private By submitButton = By.id("submit");
    private By submittedFormMessage = By.id("example-modal-sizes-title-lg");
    private By elementsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div");
    private By formsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div");
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    public PracticeFormPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public WebElement getFirstName(){
        return getDriver().findElement(firstName);
    }
    public WebElement getLastName(){
        return getDriver().findElement(lastName);
    }
    public WebElement getGenderMale(){
        return getDriver().findElement(genderMale);
    }
    public WebElement getMobileNumber(){
        return getDriver().findElement(mobileNumber);
    }
    public WebElement getSubmitButton(){
        return getDriver().findElement(submitButton);
    }
    public WebElement getSubmittedFormMessage(){
        return getDriver().findElement(submittedFormMessage);
    }
    public WebElement getElementsCard(){
        return getDriver().findElement(elementsCard);
    }
    public WebElement getFormsCard(){
        return getDriver().findElement(formsCard);
    }

    public void automationPracticeFormPageUrl(){
        getDriver().navigate().to("https://demoqa.com/automation-practice-form");
    }
    public void enterFirstName(String firstName){
        getFirstName().sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        getLastName().sendKeys(lastName);
    }
    public void chooseGenderMale(){
        getGenderMale().click();
    }
    public void enterMobileNumber(String mobile){
        getMobileNumber().sendKeys(mobile);
    }
    public void clickSubmitButton(){
        getSubmitButton().click();
    }
    public void clickElementsCard(){
        getElementsCard().click();
    }
    public void submitForm(String firstName, String lastName, String mobile){
        automationPracticeFormPageUrl();
        enterFirstName(firstName);
        enterLastName(lastName);
        chooseGenderMale();
        enterMobileNumber(mobile);
        clickSubmitButton();
    }
    public void submitFormWithElementsCardClicked(String firstName, String lastName, String mobile){
        automationPracticeFormPageUrl();
        enterFirstName(firstName);
        enterLastName(lastName);
        chooseGenderMale();
        enterMobileNumber(mobile);
        clickElementsCard();
        js.executeScript("arguments[0].scrollIntoView();", getFormsCard());
        clickSubmitButton();
    }
    public String submittedFormMessage(){
        return getSubmittedFormMessage().getText();
    }
}
