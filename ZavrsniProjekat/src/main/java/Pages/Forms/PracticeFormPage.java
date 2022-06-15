package Pages.Forms;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class PracticeFormPage extends BasePage {
    private By submitButton = By.id("submit");

    public PracticeFormPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getSubmitButton(){
        return getDriver().findElement(submitButton);
    }

    public void automationPracticeFormPageUrl(){
        getDriver().navigate().to("https://demoqa.com/automation-practice-form");
    }

    public void clickSubmitButton(){
        automationPracticeFormPageUrl();
        getSubmitButton().click();
    }
}
