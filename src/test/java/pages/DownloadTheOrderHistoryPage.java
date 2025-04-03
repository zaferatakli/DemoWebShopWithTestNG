package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DownloadTheOrderHistoryPage {

    public DownloadTheOrderHistoryPage(WebDriver driver) {
        // All elements on this (this) page are associated with PageFactory via the driver.
        PageFactory.initElements(driver, this);
    }

    // Elements are defined here.
    @FindBy(css = ".header-links .account")
    public WebElement myAccountEmail;

    @FindBy(css = ".page-title h1")
    public WebElement myAccountHeader;

    @FindBy(css = ".listbox :nth-child(3) a")
    public WebElement ordersLink;

    @FindBy(css = ".page-title h1")
    public WebElement myAccountOrdersHeader;

    @FindBy(css = ".order-list .title>strong")
    public List<WebElement> orders;

    @FindBy(css = ".buttons [value='Details']")
    public List<WebElement> detailsBtn;

    @FindBy(css = ".order-number strong")
    public WebElement orderInfoPage;

    @FindBy(css = ".page-title>:nth-child(3)")
    public WebElement pdfInvoiceBtn;

}
