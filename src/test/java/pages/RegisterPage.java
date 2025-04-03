package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(WebDriver driver) {
        // All elements on this (this) page are associated with PageFactory via the driver.
        PageFactory.initElements(driver, this);
    }

    // Elements are defined here.
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(css = "input[id='gender-female']")
    public WebElement female;

    @FindBy(css = "input[id='gender-male']")
    public WebElement male;

    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement registerEmail;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement registerPassword;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    public WebElement registerConfirmPassword;

    @FindBy(xpath = "//input[@id='register-button']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()='The specified email already exists']")
    public WebElement errorMessage ;

}
