package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveyResponsePage {
    public SurveyResponsePage(WebDriver driver) {
        // All elements on this (this) page are associated with PageFactory via the driver.
        PageFactory.initElements(driver, this);
    }

    // Elements are defined here.
    @FindBy(css = "[id='pollanswers-1']")
    public WebElement communityPoll;

    @FindBy(xpath = "//*[@id='poll-block-1'] /div /input")
    public WebElement errorVote;

    @FindBy(xpath = "//*[@id='poll-block-1'] /div /following::div")
    public WebElement errorMessage;

    @FindBy(css = "[id='pollanswers-1']")
    public WebElement community;

    @FindBy(xpath = "//*[@id='poll-block-1'] /div /input")
    public WebElement vote;

    @FindBy(xpath = "//ul[@class='poll-results']")
    public WebElement communityResults;

    @FindBy(xpath = "//span[@class='poll-total-votes']")
    public WebElement results;

}
