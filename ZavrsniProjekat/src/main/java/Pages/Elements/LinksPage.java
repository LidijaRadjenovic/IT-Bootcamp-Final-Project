package Pages.Elements;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class LinksPage extends BasePage {

    private By homeLink = By.id("simpleLink");
    private By homeDynamicLink = By.id("dynamicLink");
    private By createdLink = By.id("created");
    private By noContentLink = By.id("no-content");
    private By movedLink = By.id("moved");
    private By badRequestLink = By.id("bad-request");
    private By unauthorizedLink = By.id("unauthorized");
    private By forbiddenLink = By.id("forbidden");
    private By notFoundLink = By.id("invalid-url");

    private By message = By.id("linkResponse");

    public LinksPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getHomeLink(){
        return getDriver().findElement(homeLink);
    }
    public WebElement getHomeDynamicLink(){
        return getDriver().findElement(homeDynamicLink);
    }
    public WebElement getCreatedLink(){
        return getDriver().findElement(createdLink);
    }
    public WebElement getNoContentLink(){
        return getDriver().findElement(noContentLink);
    }
    public WebElement getMovedLink(){
        return getDriver().findElement(movedLink);
    }
    public WebElement getBadRequestLink(){
        return getDriver().findElement(badRequestLink);
    }
    public WebElement getUnauthorizedLink(){
        return getDriver().findElement(unauthorizedLink);
    }
    public WebElement getForbiddenLink(){
        return getDriver().findElement(forbiddenLink);
    }
    public WebElement getNotFoundLink(){
        return getDriver().findElement(notFoundLink);
    }
    public WebElement getMessage(){
        return getDriver().findElement(message);
    }
    public void linksPageUrl(){
        getDriver().navigate().to("https://demoqa.com/links");
    }
    public void switchWindow(int windowNumber){
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(windowNumber));
    }
    public void clickHomeLink(){
        linksPageUrl();
        getHomeLink().click();
        switchWindow(1);
    }
    public void clickHomeDynamicLink(){
        switchWindow(0);
        getHomeDynamicLink().click();
        switchWindow(1);
    }
    public void clickCreatedLink(){
        switchWindow(0);
        linksPageUrl();
        getCreatedLink().click();
    }
    public void clickNoContentLink(){
        getNoContentLink().click();
        getDriverWait().until(ExpectedConditions.textToBePresentInElement(getMessage(), "Link has responded with staus 204 and status text No Content"));
    }
    public void clickMovedLink(){
        getMovedLink().click();
        getDriverWait().until(ExpectedConditions.textToBePresentInElement(getMessage(), "Link has responded with staus 301 and status text Moved Permanently"));
    }
    public void clickBadRequestLink(){
        getBadRequestLink().click();
        getDriverWait().until(ExpectedConditions.textToBePresentInElement(getMessage(), "Link has responded with staus 400 and status text Bad Request"));
    }
    public void clickUnauthorizedLink(){
        getUnauthorizedLink().click();
        getDriverWait().until(ExpectedConditions.textToBePresentInElement(getMessage(), "Link has responded with staus 401 and status text Unauthorized"));
    }
    public void clickForbiddenLink(){
        getForbiddenLink().click();
        getDriverWait().until(ExpectedConditions.textToBePresentInElement(getMessage(), "Link has responded with staus 403 and status text Forbidden"));
    }
    public void clickNotFoundLink(){
        getNotFoundLink().click();
        getDriverWait().until(ExpectedConditions.textToBePresentInElement(getMessage(), "Link has responded with staus 404 and status text Not Found"));
    }




}

