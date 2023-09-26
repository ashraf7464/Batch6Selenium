package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BaseClass extends CommonUtility{


    @Parameters ("browser")
    @BeforeClass

    public void appInitialization(String browser) throws InterruptedException, IOException {



        //System.setProperty("webdriver.chrome.driver", "/Users/ashraf/Downloads/chromedriver");

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FileInputStream fs = new FileInputStream("C:\\Users\\conne\\IdeaProjects\\Batch6Selenium\\" +
                "src\\test\\java\\Utility\\env.properties");


        Properties prop = new Properties();
        prop.load(fs);

        String myURL = prop.getProperty("url");

        driver.manage().window().maximize();
        driver.navigate().to(myURL);
    }


    @AfterClass

    public void tearDown() {

        //driver.quit();
    }
}