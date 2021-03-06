package tests;

import pages.alertsFrameWindows.AlertsPage;
import pages.bookStoreApplication.LoginPage;
import pages.elements.*;
import pages.forms.PracticeFormPage;
import pages.homePage.HomePage;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


@Data
public class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;

    private HomePage homePage;
    private TextBoxPage textBoxPage;
    private RadioButtonPage radioButtonPage;
    private ButtonsPage buttonsPage;
    private LinksPage linksPage;
    private PracticeFormPage automationPracticeFormPage;
    private LoginPage loginPage;
    private AlertsPage alertsPage;
    private CheckBoxPage checkBoxPage;
    private PracticeFormPage practiceFormPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        this.textBoxPage = new TextBoxPage(driver, driverWait);
        this.radioButtonPage = new RadioButtonPage(driver, driverWait);
        this.buttonsPage = new ButtonsPage(driver, driverWait);
        this.linksPage = new LinksPage(driver, driverWait);
        this.automationPracticeFormPage = new PracticeFormPage(driver, driverWait);
        this.loginPage = new LoginPage(driver, driverWait);
        this.alertsPage = new AlertsPage(driver, driverWait);
        this.checkBoxPage = new CheckBoxPage(driver, driverWait);
        this.homePage = new HomePage(driver, driverWait);
        this.practiceFormPage = new PracticeFormPage(driver, driverWait);

        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public void afterClass(){
//        driver.close();
//    }



}
