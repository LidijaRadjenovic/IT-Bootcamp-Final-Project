package tests.elementsPageTests;

import tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class RadioButtonTests extends BaseTest {
    @Test(priority = 1)
    public void verifyClicksOnRadioButtons(){
        getRadioButtonPage().clickYesRadioButton();
        Assert.assertTrue(getRadioButtonPage().getYesMessage().getText().contains("Yes"));
        Assert.assertFalse(getRadioButtonPage().getImpressiveRadioButton().isSelected());
        getRadioButtonPage().clickImpressiveRadioButton();
        Assert.assertTrue(getRadioButtonPage().getImpressiveMessage().getText().contains("Impressive"));
        Assert.assertFalse(getRadioButtonPage().getYesRadioButton().isSelected());
    }
}
