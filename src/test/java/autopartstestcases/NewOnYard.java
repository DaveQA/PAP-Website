package autopartstestcases; /**
 * Created by dholliday on 4/14/2017.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewOnYard {
    private boolean debug = true;
    private WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void SearchNewOnYardMainTest(WebDriver driver1) throws InterruptedException {
        SearchNewOnYardTitleCheck(driver1);
        completeNewOnYardSearch24HourOption();
        completeNewOnYardSearch48HourOption();
        completeNewOnYardSearch7DaysOption();
        redBoxInventoryLink();
        redBoxPartInterchangeLink();
        signUpToBeNotifiedLinkCheck();
        findAStoreLinkCheck(driver1);
        partsInterchangeLinkCheck(driver1);
        inventorySearchLinkCheck(driver1);
    }

    private void SearchNewOnYardTitleCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        Actions action = new Actions(driver);

        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(3)).click().build().perform();

        actualTitle = driver.getTitle();
        System.out.println("===================================================================================");
        System.out.println("New on Yard Test");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");
        System.out.println("Expected:  Title is Search Pull-A-Part's New Inventory for New on Yard Cars & Parts");
        System.out.println("Actual:    Title is " + actualTitle);
        assertEquals("Search Pull-A-Part's New Inventory for New on Yard Cars & Parts", actualTitle);
        System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
        System.out.println("===================================================================================");
    }

    private void completeNewOnYardSearch24HourOption() {
        driver.findElement(By.cssSelector(".multi-select")).click();
        List<WebElement> locationOption = driver.findElements(By.cssSelector(".item-list div"));
        locationOption.get(3).click();

        List<WebElement> timeSpan24Hours = driver.findElements(By.cssSelector(".button"));
        timeSpan24Hours.get(9).click();

        driver.findElement(By.cssSelector(".red-box button")).click();

        if (driver.findElements(By.cssSelector(".brandin-is-awesome")).size() != 0) {
            System.out.println(ANSI_GREEN + "New on Yard search using 24 Hours option" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "The New on Yard search did not finish, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void completeNewOnYardSearch48HourOption() {
        driver.findElement(By.cssSelector(".multi-select")).click();

        List<WebElement> locationOption = driver.findElements(By.cssSelector(".item-list div"));
        locationOption.get(3).click();

        List<WebElement> timeSpan24Hours = driver.findElements(By.cssSelector(".button"));
        timeSpan24Hours.get(10).click();

        driver.findElement(By.cssSelector(".red-box button")).click();

        if (driver.findElements(By.cssSelector(".brandin-is-awesome")).size() != 0) {
            System.out.println(ANSI_GREEN + "New on Yard search using 48 Hours option" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "The New on Yard search did not finish, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void completeNewOnYardSearch7DaysOption() {
        driver.findElement(By.cssSelector(".multi-select")).click();

        List<WebElement> locationOption = driver.findElements(By.cssSelector(".item-list div"));
        locationOption.get(3).click();

        List<WebElement> timeSpan24Hours = driver.findElements(By.cssSelector(".button"));
        timeSpan24Hours.get(10).click();

        driver.findElement(By.cssSelector(".red-box button")).click();

        if (driver.findElements(By.cssSelector(".brandin-is-awesome")).size() != 0) {
            System.out.println(ANSI_GREEN + "New on Yard search using 7 Days option" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "The New on Yard search did not finish, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void redBoxInventoryLink(){
        List<WebElement> inventoryLink = driver.findElements(By.cssSelector(".red-box a"));

        inventoryLink.get(2).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Inventory link in the red search box");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sign up to be notified link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void redBoxPartInterchangeLink(){
        List<WebElement> inventoryLink = driver.findElements(By.cssSelector(".red-box a"));

        inventoryLink.get(3).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Parts Interchange in the red search box");
            System.out.println("Expected:  SEARCH INTERCHANGEABLE PARTS INVENTORY");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("SEARCH INTERCHANGEABLE PARTS INVENTORY", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sign up to be notified link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void signUpToBeNotifiedLinkCheck() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elem = driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)"));

        searchToGetTheThankYouBox(driver);
        driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)")).isDisplayed();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a.button.gray"))));
        driver.findElement(By.cssSelector("a.button.gray")).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sign up to be notified link");
            System.out.println("Expected:  Notify Me: Pull-A-Part Car Alert & Notification Service");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Notify Me: Pull-A-Part Car Alert & Notification Service", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sign up to be notified link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void findAStoreLinkCheck(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elem = driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)"));

        searchToGetTheThankYouBox(driver1);

        driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)")).isDisplayed();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a.button"))));
        List<WebElement> elems = driver.findElements(By.cssSelector("a.button"));
        elems.get(1).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Find A Store link");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sign up to be notified link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void partsInterchangeLinkCheck(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elem = driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)"));

        searchToGetTheThankYouBox(driver1);

        driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)")).isDisplayed();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a.button"))));
        List<WebElement> elems = driver.findElements(By.cssSelector("a.button"));
        elems.get(2).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Parts Interchange Link");
            System.out.println("Expected:  Interchangeable Car Parts: Auto Parts Interchange Database Lookup");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("SEARCH INTERCHANGEABLE PARTS INVENTORY", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Parts Interchange link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void inventorySearchLinkCheck(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elem = driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)"));

        searchToGetTheThankYouBox(driver1);

        driver.findElement(By.cssSelector("h5.titlecase:nth-child(1)")).isDisplayed();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a.button"))));
        List<WebElement> elems = driver.findElements(By.cssSelector("a.button"));
        elems.get(3).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Inventory Search Link");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory Search link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToPage();
    }

    private void searchToGetTheThankYouBox(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.cssSelector(".multi-select")).click();
        driver.findElement(By.cssSelector(".item-list > div:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".radio-buttons > div:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".red-box button")).click();
    }

    private void returnToPage() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));
        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(3)).click().build().perform();
    }
}
