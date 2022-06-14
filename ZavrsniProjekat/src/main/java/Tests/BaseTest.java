package Tests;

import Pages.HomePage;
import Pages.RadioButtonPage;
import Pages.TextBoxPage;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


@Data
public class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private HomePage homePage;
    private TextBoxPage textBoxPage;
    private RadioButtonPage radioButtonPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        this.textBoxPage = new TextBoxPage(driver, driverWait);
        this.radioButtonPage = new RadioButtonPage(driver, driverWait);
        driver.navigate().to("https://demoqa.com/");
    }

//    @AfterClass
//    public void afterClass(){
//        driver.close();
//    }



}
