package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.Map;

public class BrowserSetup {

    WebDriver driver;

    Map<String, String> configrationData = FileReader.readProperties("./src/main/resources/Configration.properties");
    String browser =configrationData.get("browser");


    public WebDriver launchDriver() {

        if(browser.equals("chrome")){
            driver=new ChromeDriver();

        }
        else if(browser.equals("ie")){
            driver=new InternetExplorerDriver();
        }

        else if(browser.equals("firefox")){
            driver=new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;

    }

}
