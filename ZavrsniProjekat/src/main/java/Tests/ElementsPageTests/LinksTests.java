package Tests.ElementsPageTests;

import Tests.BaseTest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.Assert;
import org.testng.annotations.Test;

@Data
@NoArgsConstructor
public class LinksTests extends BaseTest {

    @Test(priority = 1)
    public void verifyIfClickOnHomeLinkOpensNewTab(){
        getLinksPage().clickHomeLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
        getDriver().close();
    }
    @Test(priority = 2)
    public void verifyIfClickOnCreatedLinkReturnsValidMessage(){
        getLinksPage().clickCreatedLink();
        Assert.assertTrue(getLinksPage().getCreatedLinkMessage().getText().contains("Link has responded with staus 201 and status text Created"));
    }
}
