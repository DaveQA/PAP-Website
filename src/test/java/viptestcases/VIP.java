package viptestcases;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.*;

import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VIP {

    private WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    public static String prefix;
    public static String url;
    String actualTitle;
    String cardNumber;
    String loginVIPPassword;

    @Test

    public void vipMainTest(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        landingPageVIP(driver1);
        failedLoginAttempt();
        successfulLoginAttempt();
        vipNavLinks(driver1);
        vipEditProfile();
        changeStoreVIP();
        vipClubLinkActiveFlag();
        vipWalletLinkActiveFlag();
        shoppingListLinkActiveFlag();
        messageCenterLinkActiveFlag();
        signOutVIP();
    }

    private void landingPageVIP(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        driver.findElement(By.cssSelector(".nav > div:nth-child(6)")).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("===================================================================================");
            System.out.println("VIP Link in Top nav");
            System.out.println("===================================================================================");
            System.out.println("===================================================================================");
            System.out.println("Expected:  VIP Club");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("VIP Club", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "VIP link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void failedLoginAttempt(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> inputs = driver.findElements(By.cssSelector(".vip-form .input"));//List of the input fields on the login screen

        System.out.println("Failed Login test");//Title of Test
        inputs.get(0).sendKeys("12345678910");//Card number being used in test
        inputs.get(1).sendKeys("wrongpassword");//Password being used in test
        driver.findElement(By.cssSelector(".vip-form button")).click();//Action which is clicking the submit button

        if(driver.findElements(By.cssSelector(".container")).size() > 0){
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
                System.out.println("===================================================================================");
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".login-overlay .button"))));
                driver.findElement(By.cssSelector(".login-overlay .button")).click();
        }else{
                    System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
                    System.out.println(ANSI_RED + "The failed login attempt did not work, please check the website." + ANSI_RESET);
                    System.out.println("===================================================================================");
        }
    }

    private void successfulLoginAttempt() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        List<WebElement> inputs = driver.findElements(By.cssSelector(".vip-form .input"));//List of the input fields on the login screen
        List<WebElement> yellowButton = driver.findElements(By.cssSelector(".button"));//List of the buttons on the login screen

        if (driver.getCurrentUrl().contains("https://stg")) {
            cardNumber = "1000682351";
            loginVIPPassword = "password";
            System.out.println("===================================================================================");
            inputs.get(0).sendKeys(Keys.chord(Keys.CONTROL, "a"), cardNumber);
            Thread.sleep(1000);
            inputs.get(1).sendKeys(loginVIPPassword);
            wait.until(ExpectedConditions.elementToBeClickable(yellowButton.get(10)));
            yellowButton.get(10).click();
            Thread.sleep(1000);  //The driver.get title was happening on the login page

        } else if (driver.getCurrentUrl().contains("https://uat")) {
            cardNumber = "000412182";
            loginVIPPassword = "password";
            System.out.println("===================================================================================");
            inputs.get(0).sendKeys(Keys.chord(Keys.CONTROL, "a"), cardNumber);
            inputs.get(1).sendKeys(loginVIPPassword);
            yellowButton.get(10).click();
            Thread.sleep(1000);  //Added because the wait was working.  The driver.get title was happening on the login page

        } else if (driver.getCurrentUrl().contains("https://www")) {
            cardNumber = "1000577033";
            loginVIPPassword = "password";
            System.out.println("===================================================================================");
            inputs.get(0).sendKeys(Keys.chord(Keys.CONTROL, "a"), cardNumber);
            inputs.get(1).sendKeys(loginVIPPassword);
            yellowButton.get(10).click();
            Thread.sleep(1000);  //Added because the wait was working.  The driver.get title was happening on the login page
        }

        System.out.println("Successful login attempt test.");
        if (driver.findElement(By.cssSelector(".sub-nav a")).isDisplayed()) {
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "Test failed, please check the website." + ANSI_RESET);
        }

        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sub-nav a")));
            actualTitle = driver.getTitle();
            System.out.println("VIP Club Dashboard page");
            System.out.println("Expected:  VIP Club Dashboard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("VIP Club Dashboard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "VIP Club Dashboard page not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void vipNavLinks(WebDriver driver1) {
        driver = driver1;
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav

        subNavLinks.get(1).click();
        if (driver.findElement(By.cssSelector(".vip-button")).isDisplayed()) { //If the selector is wrong then the test bombs out, this will need to be updated manually
            System.out.println("Wallet sub-nav link working correctly.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Wallet link not working, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1000)", "");
        subNavLinks.get(2).click();

        if (driver.getPageSource().contains("Shopping list coming soon")) {
            System.out.println("Shopping List sub-nav link working correctly.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Shopping List sub-nav link not working, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }

        jse.executeScript("window.scrollBy(0,-1000)", "");
        subNavLinks.get(3).click();

        if (driver.getPageSource().contains("Message Center")) {
            System.out.println("Message Center sub-nav link working correctly.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Message Center sub-nav link not working, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }

        jse.executeScript("window.scrollBy(0,-1000)", "");
        subNavLinks.get(0).click();
    }

    private void vipEditProfile() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        List<WebElement> profileButtons = driver.findElements(By.cssSelector(".mobile-padder-10 a"));
        wait.until(ExpectedConditions.elementToBeClickable(profileButtons.get(0)));
        profileButtons.get(0).click();

        List<WebElement> buttons = driver.findElements(By.cssSelector(".row .button"));//Edit Button before the Profile form is opened
        wait.until(ExpectedConditions.elementToBeClickable(buttons.get(1)));
        buttons.get(1).click();

        List<WebElement> newInput = driver.findElements(By.cssSelector(".input"));//List of input fields on the VIP edit profile form in edit mode
        String vipInfoResult = vipInfo();
        newInput.get(15).sendKeys(Keys.chord(Keys.CONTROL, "a"), vipInfoResult);
        List<WebElement> save = driver.findElements(By.cssSelector(".row .button"));//Edit Button before the Profile form is opened
        wait.until(ExpectedConditions.elementToBeClickable(save.get(2)));
        save.get(2).click();

        List<WebElement> updatedVIPInfo = driver.findElements(By.cssSelector("h5"));//List of input fields on the VIP edit profile form not in edit mode

        try {
            assertEquals(vipInfoResult, updatedVIPInfo.get(2).getAttribute("innerText"));
            System.out.println(vipInfoResult + " was entered.  VIP info was updated.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "VIP info was not update, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void changeStoreVIP() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1000)", "");
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));
        subNavLinks.get(0).click();

        List<WebElement> profileButtons = driver.findElements(By.cssSelector(".mobile-padder-10 a"));
        profileButtons.get(2).click();

        try {
            driver.findElements(By.cssSelector(".container-fluid vip profile"));
            System.out.println("Change Store button is linked as intended.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Link not working, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void vipClubLinkActiveFlag() {
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav

        subNavLinks.get(0).click();
        List<WebElement> vipClubLink = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav
        if (vipClubLink.get(0).getAttribute("class").contains("active")) {
            System.out.println("VIP Club link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "VIP Club link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        scrollUp();
    }

    private void vipWalletLinkActiveFlag() {
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav
        subNavLinks.get(1).click();

        List<WebElement> vipWalletLink = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav
        scrollUp();
        if (vipWalletLink.get(1).getAttribute("class").contains("active")) {
            System.out.println("VIP Wallet link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "VIP Wallet link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        scrollUp();
    }

    private void shoppingListLinkActiveFlag() {
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav
        subNavLinks.get(2).click();
        List<WebElement> shoppingListLink = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav
        if (shoppingListLink.get(2).getAttribute("class").contains("active")) {
            System.out.println("Shopping List link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Shopping List link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        scrollUp();
    }

    private void messageCenterLinkActiveFlag() {
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav
        subNavLinks.get(3).click();
        List<WebElement> messageCentertLink = driver.findElements(By.cssSelector(".sub-nav a"));//List of links in the viptestcases.VIP sub-nav
        if (messageCentertLink.get(3).getAttribute("class").contains("active")) {
            System.out.println("Message Center link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Message Center link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        scrollUp();
    }

    private void signOutVIP() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1000)", "");
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));
        subNavLinks.get(0).click();

        List<WebElement> profileButtons = driver.findElements(By.cssSelector(".mobile-padder-10 a"));
        profileButtons.get(1).click();
    }

    private String vipInfo() {
        String[] randomVIPInfo;
        randomVIPInfo = new String[5];
        randomVIPInfo[0] = "automatedpapwebtest@gmail.com";
        randomVIPInfo[1] = "automatedpapwebtest2@gmail.com";
        randomVIPInfo[2] = "WEBTEST3@PULLAPART.COM";
        randomVIPInfo[3] = "WEBTEST4@PULLAPART.COM";
        randomVIPInfo[4] = "WEBTEST5@PULLAPART.COM";
        int randomInput = (int) (Math.random() * randomVIPInfo.length);
        return randomVIPInfo[randomInput];
    }

    private void scrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1000)", "");
    }
}
