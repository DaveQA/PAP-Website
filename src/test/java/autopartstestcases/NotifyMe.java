package autopartstestcases;
/**
 * Created by dholliday on 4/17/2017.
 */

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotifyMe {
    private boolean debug = true;
    private WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    public String email = "QA@pullapart.com";

    @Test

    public void notifyMePageMainTest(WebDriver driver1) {
        notifyMeForm(driver1);
        fillingOutTheForm(driver1);
        widgetLinks(driver1);
    }

    private void notifyMeForm(WebDriver driver1) {
        driver = driver1;
        String actualTitle;

        Actions action = new Actions(driver);
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/a"));
        action.moveToElement(dropdown).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/div[1]/div[6]/a"))).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Notify Me Test");
            System.out.println("Expected:  Notify Me: Pull-A-Part Car Alert & Notification Service");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Notify Me: Pull-A-Part Car Alert & Notification Service", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Notify Me page did not load, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void fillingOutTheForm(WebDriver driver1) {

        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        List<WebElement> firsList = driver.findElements(By.cssSelector(".quote-form .row"));
        for (int i = 0; i < firsList.size(); i++) {
            WebElement elem = firsList.get(i);
            if (i == 0) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
            }
            if (i == 1) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.cssSelector(".option-sub-container div:first-child")).click();
            }
            if (i == 2) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.cssSelector(".option-sub-container div:first-child")).click();
            }
            if (i == 3) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.cssSelector(".option-sub-container div:first-child")).click();
            }
            if (i == 4) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.xpath("//*[@id=\"SubmitSuccess\"]/div/div[2]/form/div[5]/div/pap-multiselect/div/div[2]/div[2]/div[1]/div")).click();
            }
            if (i == 5) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.cssSelector(".option-sub-container div:nth-child(2)")).click();
            }
            if (i == 6) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.cssSelector(".option-sub-container div:nth-child(1)")).click();
            }
            if (i == 7) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.id("email")).click();
                elem.findElement(By.id("email")).sendKeys(email);
            }
            if (i == 8) {
                elem.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elem.findElement(By.xpath("//*[@id=\"SubmitSuccess\"]/div/div[2]/form/div[9]/div/input")).click();
                elem.findElement(By.xpath("//*[@id=\"SubmitSuccess\"]/div/div[2]/form/div[9]/div/input")).sendKeys(email);
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"SubmitSuccess\"]/div/div[2]/form/div[13]/div/button"))));
        driver.findElement(By.xpath("//*[@id=\"SubmitSuccess\"]/div/div[2]/form/div[13]/div/button")).click();

        if (driver.findElements(By.cssSelector(".padding-10")).size() != 0) {
            System.out.println(ANSI_GREEN + "New on Yard results are displayed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "The Notify Me form was not submitted, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void widgetLinks(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

//Auto Parts Widget Link Page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div[4]/div/div/button")).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Link in Nav");
            System.out.println("Expected:  Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            Assert.assertEquals("Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToPage(driver1);
//How It Works Widget Link
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[4]/div[4]/div/div/button")).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("How It Works Widget Link");
            System.out.println("Expected:  How It Works");
            System.out.println("Actual:    " + actualTitle);
            Assert.assertEquals("How It Works", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "How It Works link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToPage(driver1);
//New On Yard Widget Link
        WebElement elem = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[6]/div[2]/div/div/h2[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[6]/div[4]/div/div/button"))));
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[6]/div[4]/div/div/button")).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("New On Yard Widget Link");
            System.out.println("Expected:  Search Pull-A-Part's New Inventory for New on Yard Cars & Parts");
            System.out.println("Actual:    " + actualTitle);
            Assert.assertEquals("Search Pull-A-Part's New Inventory for New on Yard Cars & Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New On Yard link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToPage(driver1);
//Search Car Inventory
        WebElement elem2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[8]/div[2]/div/div/h2[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem2);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[8]/div[4]/div/div/button"))));
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[8]/div[4]/div/div/button")).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Search Car Inventory Widget Link");
            System.out.println("Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            Assert.assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Search Car Inventory link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToPage(driver1);
//Part Pricing
        WebElement elem3 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[10]/div[2]/div/div/h2[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem3);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[10]/div[4]/div/div/button"))));
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[10]/div[4]/div/div/button")).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Part Pricing Widget Link");
            System.out.println("Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Expected:  Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            Assert.assertEquals("Pull-A-Part Price List: Low Prices for Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Parts Pricing link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToPage(driver1);
    }

    private void returnToPage(WebDriver driver1) {
        driver = driver1;
//Notify Me Link in the Nav
        Actions action = new Actions(driver);
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/a"));
        action.moveToElement(dropdown).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]/div[1]/div[6]/a"))).click().build().perform();
    }
}
