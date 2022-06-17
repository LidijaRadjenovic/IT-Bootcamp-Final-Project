package tests.bookStoreApplicationTests;

import tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void verifyRegisterNewUser() throws InterruptedException {
        getLoginPage().registerNewUser("vvphvhgocv", "vcgvvophv", "Abvohhgcv", "aavghpvohvcvabbbAB18823$+++");
        //Assert.assertTrue(getLoginPage().isAlertMessageDisplayed());
        Assert.assertEquals(getLoginPage().alert(), "User Register Successfully.");
        //getLoginPage().acceptAlert();
    }
}
