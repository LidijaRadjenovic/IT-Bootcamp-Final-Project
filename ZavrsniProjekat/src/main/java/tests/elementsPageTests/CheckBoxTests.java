package tests.elementsPageTests;

import org.testng.Assert;
import tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class CheckBoxTests extends BaseTest {

    @Test(priority = 1)
    public void verifyCheckboxSelection(){
        getCheckBoxPage().selectCheckboxes();
        Assert.assertEquals(getCheckBoxPage().getCheckBoxNotes().getAttribute("class"), "rct-icon rct-icon-check");
    }

}
