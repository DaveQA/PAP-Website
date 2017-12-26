package autopartstestcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchCarInventory {
    private boolean debug = true;
    private WebDriver driver;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Test

    public void searchInventoryMainTest(WebDriver driver1) {
        completeInventorySearch(driver1);
    }

    private void completeInventorySearch(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(4)).click().build().perform();
        List<WebElement> elems = driver.findElements(By.cssSelector(".select-block"));

        for (int i = 0; i < elems.size(); i++) {
            WebElement elem = elems.get(i);
            elem.click();
            if (i == 0) {
                elem.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            if (i == 1) {
                elem.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            if (i == 2) {
                elem.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        }
        driver.findElement(By.cssSelector(".button.yellow.ng-binding")).click(); //Complete search

        try {
            System.out.println("Inventory Search Title Test");
            System.out.println("===================================================================================");
            System.out.println("===================================================================================");
            actualTitle = driver.getTitle();
            System.out.println("Expected:  Title is Pull-A-Part Advanced Used Car Parts Search: Search by Year");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("Pull-A-Part Advanced Used Car Parts Search: Search by Year", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory Search page did not load, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        //Checking for the Thank you box that shows after a search is completed
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("padding-10"))));
        if (driver.findElements(By.id("Results")).size() != 0) {
            System.out.println("Inventory Search completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory Search did not finish, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToSearchCarInventoryPage();
    }

    private void returnToSearchCarInventoryPage() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));
        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(4)).click().build().perform();
    }
}