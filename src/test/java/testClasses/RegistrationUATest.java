package testClasses;

import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageElements.RegistrationUAPage;

import java.io.IOException;

public class RegistrationUATest extends BaseClass {

    RegistrationUAPage registrationUAPage;

    @Test(priority = 1)
    public void enterAllInfo() throws InterruptedException, IOException {

        registrationUAPage = new RegistrationUAPage(driver);

        registrationUAPage.enterFirstName();
        registrationUAPage.enterLastName();
        registrationUAPage.enterUserName();
        registrationUAPage.enterEmail();
        registrationUAPage.enterPassword();
        registrationUAPage.confirmPassword();
        registrationUAPage.enterBirthday();
        registrationUAPage.enterPhoneNumber();
        registrationUAPage.enterAddress();
        registrationUAPage.enterCity();
        registrationUAPage.enterZipCode();
        registrationUAPage.enterCountry();
        //registrationUAPage.clickSubmitButton();

    }

    @Test(priority = 2)
    public void openAccount() throws InterruptedException, IOException {
        ScrollByNumber();
        Thread.sleep(1000);
        registrationUAPage.clickSubmitButton();
        screenshot(".png");
    }

    @AfterMethod
    public void captureScreenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            try {
                screenshot(result.getName()+".png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}



