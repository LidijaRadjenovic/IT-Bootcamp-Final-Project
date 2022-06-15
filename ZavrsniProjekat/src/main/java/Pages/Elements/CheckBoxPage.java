package Pages.Elements;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@NoArgsConstructor
public class CheckBoxPage extends BasePage {

    private By plusButton = By.xpath("//*[@id=\"tree-node\"]/div/button[1]");
    private By notesCheckbox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[3]");
    private By reactCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]/svg");
    private By privateCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]/svg");
    private By expandArrow = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button/svg");
    private By homeCheckbox = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]");
    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public WebElement getPlusButton(){
        return getDriver().findElement(plusButton);
    }
    public WebElement getNotesCheckbox(){
        return getDriver().findElement(notesCheckbox);
    }
    public WebElement getReactCheckbox(){
        return getDriver().findElement(reactCheckBox);
    }
    public WebElement getPrivateCheckbox(){
        return getDriver().findElement(privateCheckBox);
    }
    public WebElement getExpandArrow(){
        return getDriver().findElement(expandArrow);
    }
    public WebElement getHomeCheckbox(){
        return getDriver().findElement(homeCheckbox);
    }

    public void checkboxPageUrl(){
        getDriver().navigate().to("https://demoqa.com/checkbox");
    }
    public void clickPlusButton(){
        getPlusButton().click();
    }
    public void clickExpandArrow(){
        getExpandArrow().click();
    }
    public void clickHomeCheckbox(){
        getHomeCheckbox().click();
    }
    public void clickNotesCheckbox(){
        getNotesCheckbox().click();
    }
    public void clickReactCheckbox(){
        getReactCheckbox().click();
    }
    public void clickPrivateCheckbox(){
        getPrivateCheckbox().click();
    }

    public void selectCheckboxes(){
        checkboxPageUrl();
        clickPlusButton();
        clickHomeCheckbox();
        clickHomeCheckbox();
        clickNotesCheckbox();
    }


    //*[@id="tree-node"]/ol/li/ol/li
}
