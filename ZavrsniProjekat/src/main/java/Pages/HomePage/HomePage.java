package Pages.HomePage;

import Pages.BasePage;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data @NoArgsConstructor
public class HomePage extends BasePage {


    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]");


    public void clickElements(){
        getDriver().findElement(elements).click();
    }

}
