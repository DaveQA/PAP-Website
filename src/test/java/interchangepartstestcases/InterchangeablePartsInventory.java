package interchangepartstestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterchangeablePartsInventory {

    private boolean debug = false;
    private WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void interchangeablePartsInventoryMainTests(WebDriver driver1) {
        interchangeablePartsResultsCheck(driver1);
    }


    private void interchangeablePartsResultsCheck(WebDriver driver1) {
        searchInterchangeablePartsSearchBox(driver1);

        try {
            System.out.println("Interchangeable Parts Search Tests");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("===================================================================================");
            actualTitle = driver.getTitle();
            System.out.println("Expected:  Title is SEARCH INTERCHANGEABLE PARTS INVENTORY");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("SEARCH INTERCHANGEABLE PARTS INVENTORY", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Interchangeable Parts Search did not complete, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        //Checking for the Thank you box that shows after a search is completed
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("padding-10"))));
        if (driver.findElements(By.cssSelector(".results-spacer")).size() != 0) {
            System.out.println("Inventory Search completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory Search did not finish, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void searchInterchangeablePartsSearchBox(WebDriver driver1) {
        driver = driver1;
        List<WebElement> searchCarInventoryLink = driver.findElements(By.cssSelector(".nav a"));
        Actions action = new Actions(driver);
        action.moveToElement(searchCarInventoryLink.get(88)).moveToElement(searchCarInventoryLink.get(90)).click().build().perform();
        List<WebElement> dropDowns = driver.findElements(By.cssSelector(".select-block"));

        for (int i = 0; i < dropDowns.size(); i++) {
            WebElement dropDown = dropDowns.get(i);
            dropDown.click();
            if (i == 0) {
                dropDown.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            if (i == 1) {
                dropDown.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            if (i == 2) {
                dropDown.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            if (i == 3) {
                dropDown.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
            if (i == 4) {
                dropDown.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        }
        List<WebElement> searchButton = driver.findElements(By.cssSelector(".button"));
        searchButton.get(9).click();
    }
}
