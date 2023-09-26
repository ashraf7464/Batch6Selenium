package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AppInIt {


    WebDriver driver;
    public void appLunch() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
       //System.setProperty("webdriver.chrome.driver", "/Users/ashraf/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://uprightautomation.online/registration/");

        //driver.navigate().to("https://uprightforum.tech/");
        //Thread.sleep(3000);
        //driver.navigate().back();
        //Thread.sleep(3000);
        //driver.navigate().forward();
        //Thread.sleep(3000);
        //driver.navigate().back();
        //driver.navigate().refresh();

        String myURL = driver.getCurrentUrl();

        if (myURL.equalsIgnoreCase("https://uprightautomation.online/registration/")
        ){
            System.out.println("URL is correct");
        } else{
            System.out.println("Check URL again");
        }

        /*
        There are two types of Assert, Hard and Soft
         */
        SoftAssert obj = new SoftAssert();
        obj.assertEquals(myURL, "https://uprightautomation.online/registratio/");
        //Assert.assertEquals(myURL, "https://uprightautomation.online/registration/");
        String myTitle = driver.getTitle();
        obj.assertEquals(myTitle,"Registration – Upright Automatio");
        //Assert.assertEquals(myTitle,"Registration – Upright Automation");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.close();
        System.out.println("hello");
        obj.assertAll(); // Will show the Errors

        
    }

    public static void main(String[] args) throws InterruptedException {

        AppInIt obj = new AppInIt();

        obj.appLunch();
    }
}
