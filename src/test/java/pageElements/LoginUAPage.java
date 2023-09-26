package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginUAPage {

    //Constructor
    public LoginUAPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //Page Elements
    @FindBy(linkText = "Account")
    WebElement accountLocator;

    @FindBy(linkText = "Login")
    WebElement loginLocator;

    @FindBy(xpath = "//input[@id='loginusername']")
    static WebElement userNamePath;

    @FindBy(xpath = "//input[@id='loginemail']")
    WebElement emailPath;

    @FindBy(xpath = "//input[@id='loginPassword4']")
    WebElement passwordPath;

    @FindBy(xpath = "//button[contains (@class, 'btn-primary')]")
    WebElement loginButton;

    @FindBy(xpath = "//h3[@class='text-center text-primary mb-4']")
    WebElement loginTextPath;

    //Method according to action
    public void clickOnAccount() throws InterruptedException, IOException {
        accountLocator.click();

    }

    public void clickOnLogin() throws IOException, InterruptedException {
        Thread.sleep(3000);
        loginLocator.click();
    }

    public String getLoginText(){

        String loginText = loginTextPath.getText();
        return loginText;
    }

    public boolean loginTextDisplay(){
        boolean loginTextBoolean = loginTextPath.isDisplayed();
        return loginTextBoolean;
    }


    public void enterUserName(String userName){
        userNamePath.clear();
        userNamePath.sendKeys(userName);
    }

    public void enterEmail(String email){
        emailPath.clear();
        emailPath.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordPath.clear();
        passwordPath.sendKeys(password);
    }

    public void clickLoginButton (){
        loginButton.click();
    }
}
