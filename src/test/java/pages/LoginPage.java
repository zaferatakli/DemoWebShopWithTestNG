package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        // All elements on this (this) page are associated with PageFactory via the driver.
        PageFactory.initElements(driver, this);
    }

    // Elements are defined here.
    @FindBy(className = "ico-login")
    public WebElement signInLogin;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(id = "Password")
    public WebElement passwordField;

    @FindBy(css = "input[value='Login']")
    public WebElement submitLoginButton;

    @FindBy(css = "div[class='header-links'] a[class='account']")
    public WebElement loginSuccess;

    @FindBy(xpath = "//input[@id='RememberMe']")
    public WebElement rememberMe;

    @FindBy(xpath = "//*[@class='validation-summary-errors']")
    public WebElement errorMessage;

}

