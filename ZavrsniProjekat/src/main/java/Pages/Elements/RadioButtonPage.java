package Pages.Elements;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class RadioButtonPage extends BasePage {

    private By yesRadioButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impressiveRadioButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By yesMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span");
    private By impressiveMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span");

    public RadioButtonPage (WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getYesRadioButton(){
        return getDriver().findElement(yesRadioButton);
    }

    public WebElement getImpressiveRadioButton(){
        return getDriver().findElement(impressiveRadioButton);
    }

    public WebElement getYesMessage(){
        return getDriver().findElement(yesMessage);
    }

    public WebElement getImpressiveMessage(){
        return getDriver().findElement(impressiveMessage);
    }

    public void radioButtonUrl(){
        getDriver().navigate().to("https://demoqa.com/radio-button");
    }

    public void clickYesRadioButton(){
        getYesRadioButton().click();
    }

    public void clickImpressiveRadioButton(){
        getImpressiveRadioButton().click();
    }




}