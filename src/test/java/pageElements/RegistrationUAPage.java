package pageElements;

import Utility.BaseClass;
import Utility.CommonUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationUAPage {

    public RegistrationUAPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div/input")
    WebElement firstName;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[2]/input")
    WebElement lastName;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[4]/input")
    WebElement email;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[5]/input")
    WebElement password;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[6]/input")
    WebElement confirmPassword;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[7]/input")
    WebElement birthDay;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[8]/input")
    WebElement phoneNumber;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[9]/input")
    WebElement address;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[10]/input")
    WebElement city;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[11]/input")
    WebElement zipCode;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[12]/input")
    WebElement country;

    @FindBy(xpath = "/html/body/div/section[2]/div/form/div[13]/button")
    public WebElement submitButton;

    public void enterFirstName() throws InterruptedException {
        firstName.sendKeys("Ashraf");
    }

    public void enterLastName() {

        lastName.sendKeys("Siddique");
    }

    public void enterUserName() {
        userName.sendKeys("ashraf7464");
    }

    public void enterEmail() {

        email.sendKeys("connect.ashraf7464@gmail.com");
    }

    public void enterPassword() {

        password.sendKeys("Yellow1082");
    }

    public void confirmPassword() {

        confirmPassword.sendKeys("Yellow108");
    }

    public void enterBirthday() {

        birthDay.sendKeys("10-01");
    }

    public void enterPhoneNumber() {

        phoneNumber.sendKeys("9292658570");
    }

    public void enterAddress() {

        address.sendKeys("1234 Main St");
    }

    public void enterCity() {

        city.sendKeys("Jamaica");
    }

    public void enterZipCode() {

        zipCode.sendKeys("11435");
    }

    public void enterCountry() throws IOException {

        country.sendKeys("USA");
    }

    public void clickSubmitButton() throws InterruptedException {

        submitButton.click();
    }
}