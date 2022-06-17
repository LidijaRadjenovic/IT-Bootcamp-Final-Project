package pages.homePage;

import pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data @NoArgsConstructor
public class HomePage extends BasePage{


    private By elementsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div");
    private By formsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]");
    private By alertsFrameWindowsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]");
    private By widgetsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]");
    private By interactionsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[1]");
    private By bookStoreApplicationCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[1]");
    private By elementsHeader = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By formsHeader = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By alertsFrameWindowsHeader = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By widgetsHeader = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By interactionsHeader = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By bookStoreApplicationHeader = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    public WebElement getElementsCard(){
        return getDriver().findElement(elementsCard);
    }
    public WebElement getFormsCard(){
        return getDriver().findElement(formsCard);
    }
    public WebElement getAlertsFrameWindowsCard(){
        return getDriver().findElement(alertsFrameWindowsCard);
    }
    public WebElement getWidgetsCard(){
        return getDriver().findElement(widgetsCard);
    }
    public WebElement getInteractionsCard(){
        return getDriver().findElement(interactionsCard);
    }
    public WebElement getBookStoreApplicationCard(){
        return getDriver().findElement(bookStoreApplicationCard);
    }
    public WebElement getElementsHeader(){
        return getDriver().findElement(elementsHeader);
    }
    public WebElement getFormsHeader(){
        return getDriver().findElement(formsHeader);
    }
    public WebElement getAlertsFrameWindowsHeader(){
        return getDriver().findElement(alertsFrameWindowsHeader);
    }
    public WebElement getWidgetsHeader(){
        return getDriver().findElement(widgetsHeader);
    }
    public WebElement getInteractionsHeader(){
        return getDriver().findElement(interactionsHeader);
    }
    public WebElement getBookStoreApplicationHeader(){
        return getDriver().findElement(bookStoreApplicationHeader);
    }
    public void homePageUrl(){
        getDriver().navigate().to("https://demoqa.com/");
    }
    public void clickElementsCard(){
        js.executeScript("arguments[0].scrollIntoView();", getElementsCard());
        getElementsCard().click();
    }
    public void clickFormsCard(){
        homePageUrl();
        js.executeScript("arguments[0].scrollIntoView();", getFormsCard());
        getFormsCard().click();
    }

    public void clickAlertsFrameWindowsCard(){
        homePageUrl();
        js.executeScript("arguments[0].scrollIntoView();", getAlertsFrameWindowsCard());
        getAlertsFrameWindowsCard().click();
    }
    public void clickWidgetsCard(){
        homePageUrl();
        js.executeScript("arguments[0].scrollIntoView();", getWidgetsCard());
        getWidgetsCard().click();
    }
    public void clickInteractionsCard(){
        homePageUrl();
        js.executeScript("arguments[0].scrollIntoView();", getInteractionsCard());
        getInteractionsCard().click();
    }
    public void clickBookStoreApplicationCard(){
        homePageUrl();
        js.executeScript("arguments[0].scrollIntoView();", getBookStoreApplicationCard());
        getBookStoreApplicationCard().click();
    }



}