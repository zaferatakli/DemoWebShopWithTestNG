package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsingCouponsAndGiftCardsNegativePage {

    public UsingCouponsAndGiftCardsNegativePage(WebDriver driver) {
        // All elements on this (this) page are associated with PageFactory via the driver.
        PageFactory.initElements(driver, this);
    }

    // Elements are defined here.
    @FindBy(xpath = "//a[@href='/computers'][1]")
    public WebElement computersLink;

    @FindBy(xpath = "//a[@href='/notebooks'][1]")
    public WebElement laptopLink;

    @FindBy(xpath = "//input[@value='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='ico-cart']")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//a[@class='product-name']")
    public WebElement laptop;

    @FindBy(xpath = "//input[@name='applydiscountcouponcode']")
    public WebElement applyCouponButton;

    @FindBy(xpath = "//div[contains(text(),\"The coupon code you entered couldn't be applied to your order\")]")
    public WebElement applyCouponMessage;

    @FindBy(xpath = "//input[@name='giftcardcouponcode']")
    public WebElement giftCardCode;

    @FindBy(xpath = "//input[@name='applygiftcardcouponcode']")
    public WebElement applyGiftCardButton;

    @FindBy(xpath = "//div[contains(text(),\"The coupon code you entered couldn't be applied to your order\")]")
    public WebElement applyGiftCardMessage;

}
