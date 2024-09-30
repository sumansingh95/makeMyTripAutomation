package script;

import lib.BrowserSetup;
import lib.FileReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.LoginPage;

import java.util.Map;

public class TestScript {

    WebDriver driver;


    @Test
    public void setup() {
        Map<String, String> configrationData = FileReader.readProperties("./src/main/resources/Configration.properties");
        String url = configrationData.get("web.url");
        BrowserSetup browserSetup = new BrowserSetup();
        driver = browserSetup.launchDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void LoginPageTest() throws InterruptedException {
        Map<String, String> configrationData = FileReader.readProperties("./src/main/resources/Configration.properties");
        String url = configrationData.get("web.url");
        BrowserSetup browserSetup = new BrowserSetup();
        driver = browserSetup.launchDriver();
        driver.get(url);
        driver.manage().window().maximize();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.signInMakeMyTrip();


    }
@Test
public void veifyEnterPhoneNumber() throws InterruptedException {

    Map<String, String> configrationData = FileReader.readProperties("./src/main/resources/Configration.properties");
    String url = configrationData.get("web.url");
    BrowserSetup browserSetup = new BrowserSetup();
    driver = browserSetup.launchDriver();
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    LoginPage loginpage = new LoginPage(driver);
  //  loginpage.signInMakeMyTrip();
    Thread.sleep(5000);
    loginpage.enterPhoneNumberInPlaceHolder("8431932713");
    loginpage.clickOnContinueButton();

}

}