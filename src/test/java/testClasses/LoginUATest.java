package testClasses;

import Utility.BaseClass;
import dataReader.ExcelLoginDataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageElements.LoginUAPage;

import java.io.IOException;
import java.time.Duration;



public class LoginUATest extends BaseClass {

    LoginUAPage loginUAPage;

    @Test (priority = 1)

    public void clickOnAccount() throws InterruptedException, IOException {

        loginUAPage = new LoginUAPage(driver);

        loginUAPage.clickOnAccount();

        loginUAPage.clickOnLogin();
        ScrollByNumber();
    }

    @Test (priority = 2)
    public void validateLoginPage() throws IOException, InterruptedException {


        //Method 1
        if(loginUAPage.getLoginText().equalsIgnoreCase("Login")){
            System.out.println("I'm on the right page");
        } else{
            System.out.println("I'm not of the right page");
        }

        //Method 2
        Assert.assertEquals(loginUAPage.getLoginText(), "Login");

        //Method 3
        Assert.assertEquals(loginUAPage.loginTextDisplay(), true);
    }

    @Test (priority = 3, dataProvider = "Login Data from Excel", dataProviderClass = ExcelLoginDataReader.class)
    public void enterUserName(String userName, String email, String password) throws InterruptedException {


        loginUAPage.enterUserName(userName);
        Thread.sleep(1000);
        loginUAPage.enterEmail(email);
        Thread.sleep(1000);
        loginUAPage.enterPassword(password);
        Thread.sleep(1000);
        loginUAPage.clickLoginButton();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);


    }

}
