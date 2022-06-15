package Tests.BookStoreApplicationTests;

import Tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void verifyRegisterNewUser() throws InterruptedException {
        getLoginPage().registerNewUser("Adammm", "Smithhh", "Asss", "abAB123$++++");
        Assert.assertTrue(getLoginPage().isAlertMessageDisplayed());
        getLoginPage().alertMessage();
    }
}
