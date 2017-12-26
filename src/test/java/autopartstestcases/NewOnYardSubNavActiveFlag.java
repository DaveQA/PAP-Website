package autopartstestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NewOnYardSubNavActiveFlag {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    public void newOnYardActiveMainTest(WebDriver driver1) {
        newOnYardSubNavActiveLink(driver1);
        autoPartsSubNavActiveLink();
        howItWorksSubNavActiveLink();
        searchCarInventorySubNavActiveLink();
        partsPricingSubNavActiveLink();
        notifyMeSubNavActiveLink();
    }

    private void autoPartsSubNavActiveLink() {
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));
        subNavLinks.get(0).click();
        List<WebElement> autoPartsLink = driver.findElements(By.cssSelector(".sub-nav a"));
        if (autoPartsLink.get(0).getAttribute("class").contains("active")) {
            System.out.println("Auto Parts link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto parts link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void howItWorksSubNavActiveLink() {
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));

        subNavLinks.get(1).click();
        List<WebElement> howItWorksLink = driver.findElements(By.cssSelector(".sub-nav a"));
        if (howItWorksLink.get(1).getAttribute("class").contains("active")) {
            System.out.println("How it Works link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "How it Works link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void newOnYardSubNavActiveLink(WebDriver driver1) {
        driver = driver1;
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));
        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(2)).click().build().perform();
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));

        subNavLinks.get(2).click();
        List<WebElement> newOnYardLink = driver.findElements(By.cssSelector(".sub-nav a"));
        if (newOnYardLink.get(2).getAttribute("class").contains("active")) {
            System.out.println("New on Yard link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New on Yard link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void searchCarInventorySubNavActiveLink() {
        returnToAutoPartPage();
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));

        subNavLinks.get(3).click();
        List<WebElement> searchCarInventoryLink = driver.findElements(By.cssSelector(".sub-nav a"));
        if (searchCarInventoryLink.get(3).getAttribute("class").contains("active")) {
            System.out.println("Search Car Inventory link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Search Car Inventory link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void partsPricingSubNavActiveLink() {
        returnToAutoPartPage();
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));

        subNavLinks.get(4).click();
        List<WebElement> partsPricingLink = driver.findElements(By.cssSelector(".sub-nav a"));
        if (partsPricingLink.get(4).getAttribute("class").contains("active")) {
            System.out.println("Parts Pricing link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New on Yard link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void notifyMeSubNavActiveLink() {
        returnToAutoPartPage();
        List<WebElement> subNavLinks = driver.findElements(By.cssSelector(".sub-nav a"));

        subNavLinks.get(5).click();
        List<WebElement> notifyMeLink = driver.findElements(By.cssSelector(".sub-nav a"));
        if (notifyMeLink.get(5).getAttribute("class").contains("active")) {
            System.out.println("New on Yard link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New on Yard link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void returnToAutoPartPage() {
        List<WebElement> newOnYardSubNavLink = driver.findElements(By.cssSelector(".sub-nav a"));
        newOnYardSubNavLink.get(2).click();
    }
}
