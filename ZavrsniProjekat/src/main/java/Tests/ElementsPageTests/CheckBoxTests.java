package Tests.ElementsPageTests;

import Tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class CheckBoxTests extends BaseTest {
    @Test(priority = 1)
    public void verifyCheckboxSelection(){
        getCheckBoxPage().selectCheckboxes();
    }

}
