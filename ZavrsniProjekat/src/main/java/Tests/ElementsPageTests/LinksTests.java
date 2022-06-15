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
    public void verifyIfClickOnHomeDynamicLinkOpensNewTab(){
        getLinksPage().clickHomeDynamicLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
        getDriver().close();
    }
    @Test(priority = 3)
    public void verifyIfClickOnCreatedLinkReturnsValidMessage(){
        getLinksPage().clickCreatedLink();
        Assert.assertTrue(getLinksPage().getMessage().getText().contains("Link has responded with staus 201 and status text Created"));
        getLinksPage().clickNoContentLink();
        Assert.assertTrue(getLinksPage().getMessage().getText().contains("Link has responded with staus 204 and status text No Content"));
        getLinksPage().clickMovedLink();
        Assert.assertTrue(getLinksPage().getMessage().getText().contains("Link has responded with staus 301 and status text Moved Permanently"));
        getLinksPage().clickBadRequestLink();
        Assert.assertTrue(getLinksPage().getMessage().getText().contains("Link has responded with staus 400 and status text Bad Request"));
        getLinksPage().clickUnauthorizedLink();
        Assert.assertTrue(getLinksPage().getMessage().getText().contains("Link has responded with staus 401 and status text Unauthorized"));
        getLinksPage().clickForbiddenLink();
        Assert.assertTrue(getLinksPage().getMessage().getText().contains("Link has responded with staus 403 and status text Forbidden"));
        getLinksPage().clickNotFoundLink();
        Assert.assertTrue(getLinksPage().getMessage().getText().contains("Link has responded with staus 404 and status text Not Found"));
    }

}
