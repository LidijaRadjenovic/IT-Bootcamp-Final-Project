package tests.alertsFrameWindowsPageTests;

import tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class AlertsTests extends BaseTest {


    @Test(priority = 1)
    public void verifyFirstAlertButton(){
        getAlertsPage().clickAlertButton();
        Assert.assertTrue(getAlertsPage().isAlertMessageDisplayed());
        getAlertsPage().acceptAlert();
    }
    @Test(priority = 2)
    public void verifyTimerAlertButton() throws InterruptedException {
        getAlertsPage().clickTimerAlertButton();
        Thread.sleep(5500);
        Assert.assertTrue(getAlertsPage().isAlertMessageDisplayed());
        getAlertsPage().acceptAlert();
    }
    @Test(priority = 3)
    public void verifyConfirmAlertButtonCancel(){
        getAlertsPage().clickConfirmAlertButton();
        Assert.assertTrue(getAlertsPage().isAlertMessageDisplayed());
        getAlertsPage().dismissAlert();
        Assert.assertTrue(getAlertsPage().getSelectedMessage().getText().contains("You selected Cancel"));
    }
    @Test(priority = 4)
    public void verifyConfirmAlertButtonOk(){
        getAlertsPage().clickConfirmAlertButton();
        Assert.assertTrue(getAlertsPage().isAlertMessageDisplayed());
        getAlertsPage().acceptAlert();
        Assert.assertTrue(getAlertsPage().getSelectedMessage().getText().contains("You selected Ok"));
    }
    @Test(priority = 5)
    public void verifyPromptAlert(){
        getAlertsPage().clickPromptAlertButton();
        Assert.assertTrue(getAlertsPage().isAlertMessageDisplayed());
        getAlertsPage().sendValueToAlert("Adam");
        getAlertsPage().acceptAlert();
        Assert.assertTrue(getAlertsPage().getEnteredNameMessage().getText().contains("You entered Adam"));
    }


}
