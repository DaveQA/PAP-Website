package homepagetestcases; /**
 * Created by Doc on 4/13/2017.
 */

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HomePage {
    private boolean debug = false;
    public WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    @Test

    public void homeMainTest(WebDriver driver1) {
        verifyHomePageTitle(driver1);
        completeInventorySearch();
        verifyLeftCallOutLinkClick();
        verifyRightCallOutLinkClick();
        verifyLeftCTALinkClick();
        verifyCenterCTALinkClick();
        verifyRightCTALink();
        findAStoreLink();
        verifySliderImageLinkClick();
        returnHome();
    }

    private void verifyHomePageTitle(WebDriver driver1) {
        driver = driver1;

        try {
            actualTitle = driver.getTitle();
            System.out.println("Home Page Test");
            System.out.println("Expected:  Title is Cash for Junk Cars & Used Parts: Pull-A-Part Auto Salvage");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("Cash for Junk Cars & Used Parts: Pull-A-Part Auto Salvage", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Home page not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void completeInventorySearch() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        List<WebElement> makeDropDown = driver.findElements(By.cssSelector(".red-box input"));
        makeDropDown.get(1).click();
        List<WebElement> makeOption = driver.findElements(By.className(".red-box option"));
        makeOption.get(0).click();
        List<WebElement> modelDropDown = driver.findElements(By.cssSelector(".red-box.input"));
        modelDropDown.get(3).click();
        List<WebElement> modelOption = driver.findElements(By.className(".red-box.option"));
        modelOption.get(25).click();
        List<WebElement> yearDropDown = driver.findElements(By.cssSelector(".red-box.input"));
        yearDropDown.get(5).click();
        List<WebElement> yearOption = driver.findElements(By.className(".red-box.option"));
        yearOption.get(107).click();

//        for (int i = 0; i < options.size(); i++) {
//            WebElement elem = options.get(i);
//            elem.click();
//            if (i == 0) {
//                elem.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            }
//            if (i == 1) {
//                elem.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            }
//            if (i == 2) {
//                elem.findElement(By.cssSelector(".option-sub-container > div:first-child")).click();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            }
//        }
//        List<WebElement> carFromSingleLocationButton = driver.findElements(By.cssSelector(".red-box .button"));
//        carFromSingleLocationButton.get(2).click(); //Complete search

        try {
            System.out.println("Inventory Search Title Test");
            actualTitle = driver.getTitle();
            System.out.println("Expected:  Title is Pull-A-Part Advanced Used Car Parts Search: Search by Year");
            System.out.println("Actual:    Title is " + actualTitle);
            Assertions.assertEquals("Pull-A-Part Advanced Used Car Parts Search: Search by Year", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory Search page did not load, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        //Checking for the Thank you box that shows after a search is completed
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("padding-10"))));
        if (driver.findElements(By.id("Results")).size() != 0) {
            System.out.println("Inventory Lookup Test");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "Inventory Search displayed results" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory Search did not finish, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void verifyLeftCallOutLinkClick() {
        List<WebElement> leftCallOutLink = driver.findElements(By.cssSelector(".callout a"));

        leftCallOutLink.get(0).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Left CallOut image link");
            System.out.println("Expected:  Title is Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("Pull-A-Part Price List: Low Prices for Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Left CallOut link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void verifyRightCallOutLinkClick() {
        List<WebElement> rightCallOutLink = driver.findElements(By.cssSelector(".callout a"));

        rightCallOutLink.get(1).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Right CallOut image link");
            System.out.println("Expected:  Title is Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Left CallOut link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void verifyLeftCTALinkClick() {
        List<WebElement> scrollToPointCTALinks = driver.findElements(By.cssSelector(".image"));
        List<WebElement> leftCTAButton = driver.findElements(By.cssSelector(".button.gray.uppercase.ng-binding"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPointCTALinks.get(0));
        leftCTAButton.get(0).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Left CTA link");
            System.out.println("Expected:  Title is How It Works");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("How It Works", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Left CTA link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void verifyCenterCTALinkClick() {
        List<WebElement> scrollToPointCTALinks = driver.findElements(By.cssSelector(".image"));
        List<WebElement> centerCTAButton = driver.findElements(By.cssSelector(".button.gray.uppercase.ng-binding"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPointCTALinks.get(0));
        centerCTAButton.get(1).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Middle CTA link");
            System.out.println("Expected:  Title is Search Pull-A-Part's New Inventory for New on Yard Cars & Parts");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("Search Pull-A-Part's New Inventory for New on Yard Cars & Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Left CTA link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void verifyRightCTALink() {
        List<WebElement> scrollToPointCTALinks = driver.findElements(By.cssSelector(".image"));
        List<WebElement> rightCTAButton = driver.findElements(By.cssSelector(".button.gray.uppercase.ng-binding"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPointCTALinks.get(0));
        rightCTAButton.get(2).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Right CTA link");
            System.out.println("Expected:  Title is Used Cars for Sale: Search Used Cars for Sale at Pull-A-Part");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("Used Cars for Sale: Search Used Cars for Sale at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Right CTA link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void findAStoreLink() {
        List<WebElement> findAStoreLink = driver.findElements(By.cssSelector(".slider a"));

        findAStoreLink.get(0).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Find A Store link in the slider");
            System.out.println("Expected:  Title is Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Find A Store link in the slider not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void verifySliderImageLinkClick() {
        List<WebElement> sliderImage = driver.findElements(By.cssSelector(".slider"));

        sliderImage.get(0).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Image link in the slider");
            System.out.println("Expected:  PullAPartChallenge");
            System.out.println("Actual:    Title is " + actualTitle);
            assertEquals("PullAPartChallenge", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Find A Store link in the slider not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnHome();
    }

    private void returnHome() {
        driver.findElement(By.className("logo")).click();
    }
}
