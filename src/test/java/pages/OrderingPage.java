package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderingPage {

    public OrderingPage(WebDriver driver) {
        // All elements on this (this) page are associated with PageFactory via the driver.
        PageFactory.initElements(driver, this);
    }

    // Elements are defined here.
    @FindBy(css = "div[class='column my-account'] h3")
    public WebElement pageDown;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'14.1-inch Laptop')]")
    public WebElement laptop;

    @FindBy(css = "#add-to-cart-button-31")
    public WebElement addToCartButton;

    @FindBy(css = "li[id='topcartlink'] [class='cart-label']")
    public WebElement shoppingCart;

    @FindBy(css = "#checkout")
    public WebElement checkout;

    @FindBy(xpath = "//select[@id='CountryId']")
    public WebElement country;

    @FindBy(css = "#StateProvinceId")
    public WebElement state;

    @FindBy(css = "#ZipPostalCode")
    public WebElement zipCode;

    @FindBy(css = "#termsofservice")
    public WebElement termsOfService;

    @FindBy(css = "div[class='page-title'] h1")
    public WebElement checkoutSuccess;

    @FindBy(css = "input[id='BillingNewAddress_FirstName']")
    public WebElement firstNameText;

    @FindBy(css = "#BillingNewAddress_CountryId")
    public WebElement billingCountry;

    @FindBy(css = "#BillingNewAddress_StateProvinceId")
    public WebElement billingState;

    @FindBy(css = "#BillingNewAddress_City")
    public WebElement billingCity;

    @FindBy(css = "#BillingNewAddress_Address1")
    public WebElement billingAddress;

    @FindBy(css = "#BillingNewAddress_ZipPostalCode")
    public WebElement billingZipCode;

    @FindBy(css = "#BillingNewAddress_PhoneNumber")
    public WebElement billingPhoneNumber;

    @FindBy(xpath = "input[onclick='Billing.save()']")
    public WebElement billingContinueButton;

    @FindBy(css = "#billing-address-select")
    public WebElement selectBillingAddress;

    @FindBy(css = "p[class='description'] i")
    public WebElement shippingMethodMessage;

    @FindBy(css = "label[for='PickUpInStore']")
    public WebElement inStorePickup;

    @FindBy(css = "input[onclick='Shipping.save()']")
    public WebElement shippingContinueButton;

    @FindBy(css = "div[class='payment-details'] label[for='paymentmethod_2']")
    public WebElement paymentMethodMessage;

    @FindBy(css = "#paymentmethod_2")
    public WebElement creditCard;

    @FindBy(css = "input[class='button-1 payment-method-next-step-button']")
    public WebElement payMethodContBtn;

    @FindBy(css = "label[for='CreditCardTypes']")
    public WebElement paymentOptionCreditCard;

    @FindBy(css = "#CreditCardType")
    public WebElement creditCardType;

    @FindBy(css = "#CardholderName")
    public WebElement cardholderName;

    @FindBy(css = "#CardNumber")
    public WebElement creditCardNumber;

    @FindBy(css = "#ExpireMonth")
    public WebElement expirationMonth;

    @FindBy(css = "#ExpireYear")
    public WebElement expirationYear;

    @FindBy(css = "#CardCode")
    public WebElement cardCode;

    @FindBy(css = "input[class='button-1 payment-info-next-step-button']")
    public WebElement paymentContBtn;

    @FindBy(xpath = "//span[@class='product-price']")
    public WebElement subTotal;

    @FindBy(xpath = "//span[@class='product-price order-total']")
    public WebElement total;

    @FindBy(css = "input[value='Confirm']")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//div[@class='title']/strong")
    public WebElement orderCompletedMessage;

}
