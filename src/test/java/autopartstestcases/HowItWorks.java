package autopartstestcases;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HowItWorks {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void howItWorksMainTest(WebDriver driver1) {
        howItWorksLandingPage(driver1);
        autoPartsWidget();
        newOnYardWidget();
        searchCarInventoryWidget();
        partPricingWidget();
        notifyMeWidget();
    }

    private void howItWorksLandingPage(WebDriver driver1) {
        driver = driver1;
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(2)).click().build().perform();
        System.out.println("===================================================================================");
        System.out.println("How It Works Page Tests");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");
        try {
            actualTitle = driver.getTitle();
            System.out.println("How It Works Link in Nav");
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

    private void autoPartsWidget() {
        List<WebElement> autoPartsButton = driver.findElements(By.cssSelector(".button"));

        autoPartsButton.get(8).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Used Auto Parts Widget Link");
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
        returnToHowItWorksPage();
    }

    private void newOnYardWidget() {
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
            System.out.println(ANSI_RED + "New On Yard link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToHowItWorksPage();
    }

    private void searchCarInventoryWidget() {
        List<WebElement> searchCarInventoryButton = driver.findElements(By.cssSelector(".button"));
        List<WebElement> findCarsScrollToPoint = driver.findElements(By.cssSelector(".image"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findCarsScrollToPoint.get(2));
        wait.until(ExpectedConditions.elementToBeClickable(searchCarInventoryButton.get(10)));

        searchCarInventoryButton.get(10).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Search Car Inventory Widget Link");
            System.out.println("Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Search Car Inventory link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToHowItWorksPage();
    }

    private void partPricingWidget() {
        List<WebElement> partPricingButton = driver.findElements(By.cssSelector(".button"));
        List<WebElement> partPricingScrollToPoint = driver.findElements(By.cssSelector(".image"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", partPricingScrollToPoint.get(3));
        wait.until(ExpectedConditions.elementToBeClickable(partPricingButton.get(11)));

        partPricingButton.get(11).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Part Pricing Widget Link");
            System.out.println("Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Expected:  Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Price List: Low Prices for Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Parts Pricing link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToHowItWorksPage();
    }

    private void notifyMeWidget() {
        List<WebElement> notifyMeButton = driver.findElements(By.cssSelector(".button"));
        List<WebElement> getNotificationsScrollToPoint = driver.findElements(By.cssSelector(".image"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getNotificationsScrollToPoint.get(4));
        wait.until(ExpectedConditions.elementToBeClickable(notifyMeButton.get(12)));

        notifyMeButton.get(12).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Notify Me Widget Link");
            System.out.println("Notify Me: Pull-A-Part Car Alert & Notification Service");
            System.out.println("Expected:  Notify Me: Pull-A-Part Car Alert & Notification Service");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Notify Me: Pull-A-Part Car Alert & Notification Service", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Notify Me link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToHowItWorksPage();
    }

    private void returnToHowItWorksPage() {
        List<WebElement> howItWorksSubNavButton = driver.findElements(By.cssSelector(".sub-nav a"));
        howItWorksSubNavButton.get(1).click();
    }
}
