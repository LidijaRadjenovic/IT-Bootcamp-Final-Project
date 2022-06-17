package tests.formsPageTests;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
@Data
@NoArgsConstructor
public class PracticeFormTests extends BaseTest {
    @Test(priority = 1)
    public void verifySubmittingFormWithRequiredElements(){
        getPracticeFormPage().submitForm("Adam", "Smith", "0123456789");
        Assert.assertEquals(getPracticeFormPage().submittedFormMessage(), "Thanks for submitting the form");
    }


    @Test(priority = 2)
    public void verifySubmittingFormWithRequiredElementsClickedElementsCard(){
        getPracticeFormPage().submitFormWithElementsCardClicked("Adam", "Smith", "0123456789");
        Assert.assertEquals(getPracticeFormPage().submittedFormMessage(), "Thanks for submitting the form");
    }
}
