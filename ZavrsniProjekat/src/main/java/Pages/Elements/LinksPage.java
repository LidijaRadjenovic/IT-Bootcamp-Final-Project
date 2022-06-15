package Pages.Elements;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class LinksPage extends BasePage {

    private By homeLink = By.id("simpleLink");
    private By createdLink = By.id("created");
    private By noContentLink = By.id("no-content");
    private By createdLinkMessage = By.id("linkResponse");

    public LinksPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getHomeLink(){
        return getDriver().findElement(homeLink);
    }

    public WebElement getCreatedLink(){
        return getDriver().findElement(createdLink);
    }

    public WebElement getNoContentLink(){
        return getDriver().findElement(noContentLink);
    }

    public WebElement getCreatedLinkMessage(){
        return getDriver().findElement(createdLinkMessage);
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

    public void clickCreatedLink(){
        switchWindow(0);
        linksPageUrl();
        getCreatedLink().click();
    }


}

