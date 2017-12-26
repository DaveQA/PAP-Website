package autopartstestcases;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AutoParts {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void autoPartMainTest(WebDriver driver1) {
        autoPartsLandingPage(driver1);
        howItWorksWidget();
        newOnYardWidget();
        searchCarInventoryWidget();
        partPricingWidget();
        notifyMeWidget();
    }

    private void autoPartsLandingPage(WebDriver driver1) {
        driver = driver1;

        System.out.println("===================================================================================");
        System.out.println("Sell My Car Page Tests");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");
        driver.findElement(By.cssSelector(".nav > div:first-child")).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Link in Nav");
            System.out.println("Expected:  Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void howItWorksWidget() {
        List<WebElement> autoPartsButton = driver.findElements(By.cssSelector(".button"));

        autoPartsButton.get(8).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("How It Works Widget Link");
            System.out.println("Expected:  How It Works");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("How It Works", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "How It Works link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void newOnYardWidget() {
        returnToAutoPartPage();

        List<WebElement> newOnYardButton = driver.findElements(By.cssSelector(".button"));
        newOnYardButton.get(9).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("New On Yard Widget Link");
            System.out.println("Expected:  Search Pull-A-Part's New Inventory for New on Yard Cars & Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Search Pull-A-Part's New Inventory for New on Yard Cars & Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New On Yard widget link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void searchCarInventoryWidget() {
        returnToAutoPartPage();
        List<WebElement> autoPartsButton = driver.findElements(By.cssSelector(".button"));
        List<WebElement> findCarsScrollToPoint = driver.findElements(By.cssSelector("img"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findCarsScrollToPoint.get(8));
        wait.until(ExpectedConditions.elementToBeClickable(autoPartsButton.get(10)));
        autoPartsButton.get(10).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Search Car Inventory Widget Link");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Search Car Inventory widget link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void partPricingWidget() {
        returnToAutoPartPage();
        List<WebElement> partPricingButton = driver.findElements(By.cssSelector(".button"));
        List<WebElement> viewPricesScrollToPoint = driver.findElements(By.cssSelector("img"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewPricesScrollToPoint.get(9));
        wait.until(ExpectedConditions.elementToBeClickable(partPricingButton.get(11)));
        partPricingButton.get(11).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Part Pricing Widget Link");
            System.out.println("Expected:  Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Price List: Low Prices for Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Part Pricing widget link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void notifyMeWidget() {
        returnToAutoPartPage();
        List<WebElement> notifyMeButton = driver.findElements(By.cssSelector(".button"));
        List<WebElement> getNotificationsScrollPoint = driver.findElements(By.cssSelector("img"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getNotificationsScrollPoint.get(11));
        wait.until(ExpectedConditions.elementToBeClickable(notifyMeButton.get(12)));
        notifyMeButton.get(12).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Notify Me Widget Link");
            System.out.println("Expected:  Notify Me: Pull-A-Part Car Alert & Notification Service");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Notify Me: Pull-A-Part Car Alert & Notification Service", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Notify Me widget link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void returnToAutoPartPage() {
        List<WebElement> autoPartsSubNavLink = driver.findElements(By.cssSelector(".sub-nav a"));
        autoPartsSubNavLink.get(0).click();
    }
}
