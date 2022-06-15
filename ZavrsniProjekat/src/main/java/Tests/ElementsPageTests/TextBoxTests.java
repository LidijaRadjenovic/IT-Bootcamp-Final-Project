package Tests.ElementsPageTests;

import Tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class TextBoxTests extends BaseTest {

    @Test(priority = 1)
    public void verifySubmittingFormWithValidDataReturnsEnteredData(){
        getTextBoxPage().fillTextForm("Adam Smith", "adamsmith@gmail.com", "83 Main Street", "83 Main Street");
        Assert.assertTrue(getTextBoxPage().getEnteredName().getText().contains("Adam Smith"));
        Assert.assertTrue(getTextBoxPage().getEnteredEmail().getText().contains("adamsmith@gmail.com"));
        Assert.assertTrue(getTextBoxPage().getEnteredCurrentAddress().getText().contains("83 Main Street"));
        Assert.assertTrue(getTextBoxPage().getEnteredPermanentAddress().getText().contains("83 Main Street"));
    }
}