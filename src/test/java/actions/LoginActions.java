package test.java.actions;

import org.openqa.selenium.WebDriver;
import test.java.pages.LoginPage;

public class LoginActions {
    WebDriver driver;
    LoginPage loginPage;
    public LoginActions(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }
    public void login(String email, String password) {
        loginPage.emailField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        loginPage.submitLoginButton.click();
    }
}
