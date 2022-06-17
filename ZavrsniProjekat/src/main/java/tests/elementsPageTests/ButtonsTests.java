package tests.elementsPageTests;

import tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class ButtonsTests extends BaseTest {

    @Test(priority = 1)
    public void verifyIfClickingOnButtonsReturnValidMessages(){
        getButtonsPage().performClicksOnButtons();
        Assert.assertTrue(getButtonsPage().getDoubleClickMessage().getText().contains("You have done a double click"));
        Assert.assertTrue(getButtonsPage().getRightClickMessage().getText().contains("You have done a right click"));
        Assert.assertTrue(getButtonsPage().getDynamicClickMessage().getText().contains("You have done a dynamic click"));
    }
}