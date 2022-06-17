package tests.homePageTests;

import tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class HomePageTests extends BaseTest {

    @Test(priority = 1)
    public void verifyClickOnElementsCardOpensElementsPage(){
        getHomePage().clickElementsCard();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/elements");
        Assert.assertEquals(getHomePage().getElementsHeader().getText(), "Elements");
    }
    @Test(priority = 2)
    public void verifyClickOnFormsCardOpensFormsPage(){
        getHomePage().clickFormsCard();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/forms");
        Assert.assertEquals(getHomePage().getFormsHeader().getText(), "Forms");
    }
    @Test(priority = 3)
    public void verifyClickOnAlertsFrameWindowsCardOpensAlertsFrameWindowsPage(){
        getHomePage().clickAlertsFrameWindowsCard();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/alertsWindows");
        Assert.assertEquals(getHomePage().getAlertsFrameWindowsHeader().getText(), "Alerts, Frame & Windows");
    }
    @Test(priority = 4)
    public void verifyClickOnWidgetsCardOpensWidgetsPage(){
        getHomePage().clickWidgetsCard();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/widgets");
        Assert.assertEquals(getHomePage().getWidgetsHeader().getText(), "Widgets");
    }
    @Test(priority = 5)
    public void verifyClickOnInteractionsCardOpensInteractionsPage(){
        getHomePage().clickInteractionsCard();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/interaction");
        Assert.assertEquals(getHomePage().getInteractionsHeader().getText(), "Interactions");
    }
    @Test(priority = 6)
    public void verifyClickOnBookStoreApplicationCardOpensBookStoreApplicationPage(){
        getHomePage().clickBookStoreApplicationCard();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/books");
        Assert.assertEquals(getHomePage().getBookStoreApplicationHeader().getText(), "Book Store");
    }
}

