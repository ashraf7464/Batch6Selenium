package Utility;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CommonUtility {
    public WebDriver driver;

    public void screenshot(String fileName) throws IOException {

        TakesScreenshot ss = (TakesScreenshot) driver;
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);

       FileHandler.copy(memoryLocation, new File("C:\\Users\\conne\\IdeaProjects\\Batch6Selenium\\src" +
                "\\test\\ScreenshotFolder"+fileName));

    }

    public void ScrollHeight() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
    }
    public void ScrollByNumber() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
    }

    public void ScrollIntoView(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
        Thread.sleep(3000);

        //just to test GitHub

    }

    }

