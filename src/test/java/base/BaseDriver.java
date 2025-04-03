package test.java.base;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import test.java.utilities.MyFunc;
import java.time.Duration;
import java.util.Random;

public class BaseDriver {
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;
    public String email = "cigeyab754@erapk.com";
    public String password = "BugFathers4!";

    @BeforeClass
    @Parameters("BrowserType")
    public void Setup(String browserType) {
        CloseFaultyWindows(); // Kapatılmamış olan browserları kapatır.
        switch (browserType.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default: driver = new ChromeDriver();
        }
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti

        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 20 sn mühlet: bekleme mühleti
        actions = new Actions(driver); // Action sınıfı için driver'ı tanımladık.
    }
    @AfterClass
    public void TearDown() {
        MyFunc.sleep(6);
        driver.quit();
    }

    public void CloseFaultyWindows() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {
        }
    }

    public static String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "hotmail.com"};
        Random random = new Random();

        StringBuilder username = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            username.append(characters.charAt(random.nextInt(characters.length())));
        }
        String domain = domains[random.nextInt(domains.length)];
        return username.toString() + "@" + domain;
    }

    public static String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random random = new Random();

        StringBuilder password = new StringBuilder();
        while (!password.toString().matches(".*[A-Z].*") || !password.toString().matches(".*[a-z].*") || !password.toString().matches(".*[0-9].*") || !password.toString().matches(".*[!@#$%^&*].*")) {
            password.setLength(0);
            for (int i = 0; i < 8; i++) {
                password.append(characters.charAt(random.nextInt(characters.length())));
            }
        }
        return password.toString();
    }

    public void newAddressInput() {
        WebElement firstName = driver.findElement(By.cssSelector("label[for='BillingNewAddress_FirstName']"));
        if (firstName.isDisplayed()) {
            WebElement billingCountry = driver.findElement(By.cssSelector("#BillingNewAddress_CountryId"));
            actions.moveToElement(billingCountry).click().build().perform();

            Select billingCountrySelect = new Select(billingCountry);
            billingCountrySelect.selectByValue("1");

            WebElement billingState = driver.findElement(By.cssSelector("#BillingNewAddress_StateProvinceId"));
            actions.moveToElement(billingState).click().build().perform();
            Select billingStateSelect = new Select(billingState);
            billingStateSelect.selectByValue("9");

            WebElement billingCity = driver.findElement(By.cssSelector("#BillingNewAddress_City"));
            actions.moveToElement(billingCity).click().sendKeys("Fresno").build().perform();

            WebElement billingAddress = driver.findElement(By.cssSelector("#BillingNewAddress_Address1"));
            actions.moveToElement(billingAddress).click().sendKeys("2823 Fresno St").build().perform();

            WebElement billingZipCode = driver.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode"));
            actions.moveToElement(billingZipCode).click().sendKeys("99999").build().perform();

            WebElement billingPhoneNumber = driver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber"));
            actions.moveToElement(billingPhoneNumber).click().sendKeys("555-555-5555").build().perform();

            WebElement billingContinueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("input[onclick='Billing.save()']")));
            billingContinueButton.click();
            System.out.println("Billing information saved.");
        } else {
            WebElement selectBillingAddress = driver.findElement(By.cssSelector("#billing-address-select"));
            actions.moveToElement(selectBillingAddress).click().build().perform();

            Select newAddress = new Select(selectBillingAddress);
            newAddress.selectByVisibleText("New Address");

            WebElement billingCountry = driver.findElement(By.cssSelector("#BillingNewAddress_CountryId"));
            billingCountry.click();
            Select billingCountrySelect = new Select(billingCountry);
            billingCountrySelect.selectByValue("1");

            WebElement billingState = driver.findElement(By.cssSelector("#BillingNewAddress_StateProvinceId"));
            billingState.click();
            Select billingStateSelect = new Select(billingState);
            billingStateSelect.selectByValue("9");

            WebElement billingCity = driver.findElement(By.cssSelector("#BillingNewAddress_City"));
            billingCity.sendKeys("Fresno");

            WebElement billingAddress = driver.findElement(By.cssSelector("#BillingNewAddress_Address1"));
            billingAddress.sendKeys("2823 Fresno St");

            WebElement billingZipCode = driver.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode"));
            billingZipCode.sendKeys("99999");

            WebElement billingPhoneNumber = driver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber"));
            billingPhoneNumber.sendKeys("555-555-5555");

            WebElement billingContinueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[onclick='Billing.save()']")));
            billingContinueButton.click();
            System.out.println("Billing information saved.");
        }
    }

    public void RegisterWithRandomEmail() {
        String randomEmail = generateRandomEmail();

        WebElement register = driver.findElement(By.xpath("//*[text()='Register']"));
        register.click();

        WebElement female = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='gender-female']")));
        Assert.assertTrue(driver.getTitle().contains("Demo Web Shop. Register"), "Register page could not be accessed.");
        female.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("BugFathers");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Team");

        WebElement registerEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        registerEmail.sendKeys(randomEmail);

        WebElement registerPassword = driver.findElement(By.xpath("//input[@id='Password']"));
        registerPassword.sendKeys(password);

        WebElement registerConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        registerConfirmPassword.sendKeys(password);

        WebElement registerLoginButton = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerLoginButton.click();

        WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Continue']")));
        Assert.assertTrue(continueButton.isDisplayed(), "Registration was not successful.");
        System.out.println("Registration was successful.");
        continueButton.click();
    }

    public void Login() {
        WebElement signInLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-login")));
        actions.moveToElement(signInLogin).click().build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
        Assert.assertTrue(driver.getTitle().contains("Login"), "The login page could not be accessed.");

        WebElement emailField = driver.findElement(By.id("Email"));
        actions.moveToElement(emailField).click().sendKeys(email).build().perform();

        WebElement passwordField = driver.findElement(By.id("Password"));
        actions.moveToElement(passwordField).click().sendKeys(password).build().perform();

        WebElement submitLoginButton = driver.findElement(By.xpath("//*[contains(@class,'button-1 login-button')]"));
        actions.moveToElement(submitLoginButton).click().build().perform();

        WebElement loginSuccess = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='header-links'] a[class='account']")));
        Assert.assertTrue(loginSuccess.isDisplayed(), "The login was not successful.");
        System.out.println("Login successful.");
    }

    public void Logout() {
        WebElement logout = driver.findElement(By.className("ico-logout"));
        actions.moveToElement(logout).click().build().perform();

        WebElement checkLogout = driver.findElement(By.className("ico-register"));
        Assert.assertTrue(checkLogout.isDisplayed());
        System.out.println("Logout successful.");
    }
}

