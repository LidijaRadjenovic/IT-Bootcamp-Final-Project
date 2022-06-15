package Tests.ElementsPageTests;

import Tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class RadioButtonTests extends BaseTest {
    @Test(priority = 1)
    public void verifyIfClicksOnRadioButtonsReturnValidMessages(){
        getRadioButtonPage().radioButtonUrl();
        getRadioButtonPage().clickYesRadioButton();
        Assert.assertTrue(getRadioButtonPage().getYesMessage().getText().contains("Yes"));
        getRadioButtonPage().clickImpressiveRadioButton();
        Assert.assertTrue(getRadioButtonPage().getImpressiveMessage().getText().contains("Impressive"));
    }
}
