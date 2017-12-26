package autopartstestcases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class PartsPricing {
    private WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    public void partsPricingMainTest(WebDriver driver1) {
        partPricingPage(driver1);
        partPricingLookUp(driver1);
        tableColumnNameCheck();
    }

    private void partPricingPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;

        Actions action = new Actions(driver);
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/a"));
        action.moveToElement(dropdown).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/div[1]/div[5]/a"))).click().build().perform();

        try {
            System.out.println("===================================================================================");
            System.out.println("Parts Pricing Page Test");
            System.out.println("===================================================================================");
            System.out.println("===================================================================================");
            actualTitle = driver.getTitle();
            System.out.println("Expected:  Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            Assertions.assertEquals("Pull-A-Part Price List: Low Prices for Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory Search page did not load, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void partPricingLookUp(WebDriver driver1) {
        driver = driver1;

        driver.findElement(By.cssSelector("select-block")).click();
        driver.findElement(By.cssSelector(".option-sub-container > div:nth-child(3)")).click();

        List<WebElement> elems = driver.findElements(By.cssSelector(".part-search input"));
        elems.get(3).sendKeys("TRANSMISSION");
        List<WebElement> elem2 = driver.findElements(By.cssSelector(".part-search button"));
        elem2.get(2).click();

        if (driver.findElements(By.id("Parts-Results")).size() != 0) {
            System.out.println(ANSI_GREEN + "Part Pricing lookup completed with results shown" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Part Pricing lookup did not complete, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void tableColumnNameCheck() {
        List<WebElement> priceTableColumnNames = driver.findElements(By.cssSelector(".inner-container .h6"));

        if (priceTableColumnNames.get(1).getAttribute("innerHTML").contains("Base Price")) {
            System.out.println(ANSI_GREEN + "Part Price column name is correct" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Part Pricing table does not have the correct header names, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }
}

