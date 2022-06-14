package Tests;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data @NoArgsConstructor

public class Tests extends BaseTest{
    @Test(priority = 1)
    public void verifySubmittingFormWithValidDataReturnsEnteredData(){
        getTextBoxPage().fillTextForm("Adam Smith", "adamsmith@gmail.com", "83 Main Street", "83 Main Street");
        Assert.assertTrue(getTextBoxPage().getEnteredName().getText().contains("Adam Smith"));
        Assert.assertTrue(getTextBoxPage().getEnteredEmail().getText().contains("adamsmith@gmail.com"));
        Assert.assertTrue(getTextBoxPage().getEnteredCurrentAddress().getText().contains("83 Main Street"));
        Assert.assertTrue(getTextBoxPage().getEnteredPermanentAddress().getText().contains("83 Main Street"));
    }
    @Test(priority = 2)
    public void verifyIfClicksOnRadioButtonsReturnValidMessages(){
        getRadioButtonPage().radioButtonUrl();
        getRadioButtonPage().clickYesRadioButton();
        Assert.assertTrue(getRadioButtonPage().getYesMessage().getText().contains("Yes"));
        getRadioButtonPage().clickImpressiveRadioButton();
        Assert.assertTrue(getRadioButtonPage().getImpressiveMessage().getText().contains("Impressive"));
    }
    @Test(priority = 3)
    public void verifyIfClickingOnButtonsReturnValidMessages(){
        getButtonsPage().performClicksOnButtons();
        Assert.assertTrue(getButtonsPage().getDoubleClickMessage().getText().contains("You have done a double click"));
        Assert.assertTrue(getButtonsPage().getRightClickMessage().getText().contains("You have done a right click"));
        Assert.assertTrue(getButtonsPage().getDynamicClickMessage().getText().contains("You have done a dynamic click"));
    }
    @Test(priority = 4)
    public void verifyIfClickOnHomeLinkOpensNewTab(){
        getLinksPage().clickHomeLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
        getDriver().close();
    }
    @Test(priority = 5)
    public void verifyIfClickOnCreatedLinkReturnsValidMessage(){
        getLinksPage().clickCreatedLink();
        Assert.assertTrue(getLinksPage().getCreatedLinkMessage().getText().contains("Link has responded with staus 201 and status text Created"));
    }
    @Test(priority = 6)
    public void verifyRegisterNewUser(){
        getLoginPage().registerNewUser("Adam", "Smith", "AS", "aaAA123$$++");
    }
//#recaptcha-anchor > div.recaptcha-checkbox-border

}
