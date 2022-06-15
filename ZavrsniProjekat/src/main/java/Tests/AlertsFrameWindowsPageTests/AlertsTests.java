package Tests.AlertsFrameWindowsPageTests;

import Tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class AlertsTests extends BaseTest {

    @Test
    public void verifyAlert(){
        getAlertsPage().clickAlertButton();
        Assert.assertTrue(getAlertsPage().isAlertMessageDisplayed());
        getAlertsPage().alertMessage();
    }

}
