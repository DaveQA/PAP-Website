package footertestcases;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Footer {

    private boolean debug = false;
    private WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    @Test

    public void footerMainTest(WebDriver driver1) {
        footerAbout(driver1);
        footerCareers();
        footerPricing();
        footerInventory();
        footerLocations();
        footerContact();
        footerSellMyCar();
        footerPrivacyPolicy();
        footerSiteMap();
        returnHome(driver1);
    }

    private void footerAbout(WebDriver driver1) {
        driver = driver1;

        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:first-child > a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("About link in the Footer");
            System.out.println("Expected:  Do-It-Yourself Salvage Yard | We Buy Junk Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Do-It-Yourself Salvage Yard | We Buy Junk Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "About link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerCareers() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(2)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Careers link in the Footer");
            System.out.println("Expected:  Careers");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Careers", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Careers link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerPricing() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(3)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Pricing link in the Footer");
            System.out.println("Expected:  Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Price List: Low Prices for Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Pricing link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerInventory() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(4)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Inventory link in the Footer");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerLocations() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(5)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Locations link in the Footer");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Locations link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerContact() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(6)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Contact link in the Footer");
            System.out.println("Expected:  SellMyCarFAQ Category");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("SellMyCarFAQ Category", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Contact link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerSellMyCar() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(7)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car link in the Footer");
            System.out.println("Expected:  Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerPrivacyPolicy() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(8)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Privacy Policy link in the Footer");
            System.out.println("Expected:  Privacy Policy");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Privacy Policy", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Privacy Policy link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void footerSiteMap() {
        WebElement elem = driver.findElement(By.cssSelector(".footer-nav > div:nth-child(9)"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        elem.click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("SiteMap link in the Footer");
            System.out.println("Expected:  Sitemap");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sitemap", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "SiteMap link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void returnHome(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.className("logo")).click();
    }
}
