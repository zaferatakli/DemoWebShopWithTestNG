package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(WebDriver driver) {
        // All elements on this (this) page are associated with PageFactory via the driver.
        PageFactory.initElements(driver, this);
    }
    // Elements are defined here.
    @FindBy(className = "ico-logout")
    public WebElement logout;

    @FindBy(className = "ico-register")
    public WebElement checkLogout;
}
