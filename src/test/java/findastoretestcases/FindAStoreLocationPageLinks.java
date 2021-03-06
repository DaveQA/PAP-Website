package findastoretestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindAStoreLocationPageLinks {
    private boolean debug = false;
    private WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void findAStoreLocationPageLinksMainTest(WebDriver driver1){
        birminghamLinkTitleCheck(driver1);
        mobileLinkTitleCheck();
        montgomeryLinkTitleCheck();
        tucsonLinkTitleCheck();
        atlantaEastLinkTitleCheck();
        atlantaNorthLinkTitleCheck();
        atlantaSouthLinkTitleCheck();
        augustaLinkTitleCheck();
        indianapolisLinkTitleCheck();
        louisvilleLinkTitleCheck();
        batonRougeLinkTitleCheck();
        lafayetteLinkTitleCheck();
        newOrleansLinkTitleCheck();
        jacksonLinkTitleCheck();
        charlotteLinkTitleCheck();
        winstonSalemLinkTitleCheck();
        akronLinkTitleCheck();
        cantonLinkTitleCheck();
        clevelandWestLinkTitleCheck();
        columbiaLinkTitleCheck();
        knoxvilleLinkTitleCheck();
        memphisLinkTitleCheck();
        nashvilleLinkTitleCheck();
        corpusChristiLinkTitleCheck();
        elPasoLinkTitleCheck();
    }

    private void birminghamLinkTitleCheck(WebDriver driver1){
        driver = driver1;
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> birminghamLink = driver.findElements(By.cssSelector(".row ul a"));
        birminghamLink.get(1).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Birmingham Link");
            System.out.println("Expected:  Pull-A-Part Used Auto Parts Un-Junkyard & Auto Salvage in Birmingham");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts Un-Junkyard & Auto Salvage in Birmingham", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Birmingham link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void mobileLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(2).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Mobile Link");
            System.out.println("Expected:  Pull-A-Part Mobile Auto Salvage Yard & Used Auto Parts Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Mobile Auto Salvage Yard & Used Auto Parts Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Mobile link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void montgomeryLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(3).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Montgomery Link");
            System.out.println("Expected:  Pull-A-Part Salvage Yard & Used Auto Parts Un-Junkyard in Montgomery");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Salvage Yard & Used Auto Parts Un-Junkyard in Montgomery", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Montgomery link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void tucsonLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(4).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Tucson Link");
            System.out.println("Expected:  Pull-A-Part Auto Salvage Tucson: Un-Junkyard & Used Auto Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Auto Salvage Tucson: Un-Junkyard & Used Auto Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Tucson link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void atlantaEastLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(5).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta East Link");
            System.out.println("Expected:  Pull-A-Part Lithonia Auto Salvage & Used Auto Parts Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Lithonia Auto Salvage & Used Auto Parts Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta East link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void atlantaNorthLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(6).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta North Link");
            System.out.println("Expected:  Pull-A-Part Used Auto Parts Un-Junkyard & Auto Salvage in Norcross");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts Un-Junkyard & Auto Salvage in Norcross", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta North link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void atlantaSouthLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(7).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta South Link");
            System.out.println("Expected:  Pull-A-Part Atlanta: Salvage Yard & Used Auto Parts Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Atlanta: Salvage Yard & Used Auto Parts Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta South link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void augustaLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(8).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Augusta Link");
            System.out.println("Expected:  Pull-A-Part Used Auto Parts Un-Junkyard & Auto Salvage in Augusta");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts Un-Junkyard & Auto Salvage in Augusta", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Augusta link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void indianapolisLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(9).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Indianapolis Link");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Used Auto Parts & Auto Salvage Indianapolis");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Used Auto Parts & Auto Salvage Indianapolis", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Indianapolis link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void louisvilleLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(10).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Louisville Link");
            System.out.println("Expected:  Pull-A-Part Salvage: Used Auto Parts Un-Junkyard in Louisville");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Salvage: Used Auto Parts Un-Junkyard in Louisville", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Louisville link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void batonRougeLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(11).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Baton Rouge Link");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Used Auto Parts & Auto Salvage in Baton Rouge");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Used Auto Parts & Auto Salvage in Baton Rouge", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Baton Rouge link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void lafayetteLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(12).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Lafayette Link");
            System.out.println("Expected:  Pull-A-Part: Auto Salvage & Used Auto Parts Un-Junkyard in Lafayette");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part: Auto Salvage & Used Auto Parts Un-Junkyard in Lafayette", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Lafayette link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void newOrleansLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(13).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("New Orleans Link");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard in New Orleans: Used Auto Parts & Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard in New Orleans: Used Auto Parts & Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New Orleans link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void jacksonLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(14).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Jackson Link");
            System.out.println("Expected:  Pull-A-Part Jackson Un-Junkyard: Auto Salvage & Used Car Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Jackson Un-Junkyard: Auto Salvage & Used Car Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Jackson link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void charlotteLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(15).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Charlotte Link");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard in Charlotte: Used Auto Parts & Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard in Charlotte: Used Auto Parts & Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Charlotte link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void winstonSalemLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(16).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Winston Salem Link");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard Winston-Salem: Used Auto Parts & Salvage Yards");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard Winston-Salem: Used Auto Parts & Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Winston Salem link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void akronLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(17).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Akron Link");
            System.out.println("Expected:  Pull-A-Part Akron Un-Junkyard: Used Car Parts & Auto Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Akron Un-Junkyard: Used Car Parts & Auto Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Akron link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void cantonLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(18).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Canton Link");
            System.out.println("Expected:  Pull-A-Part Canton Auto Salvage Yard & Used Car Parts Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Canton Auto Salvage Yard & Used Car Parts Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Canton link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void clevelandWestLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(19).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Cleveland West Link");
            System.out.println("Expected:  Pull-A-Part Cleveland Un-Junkyard: Used Auto Parts & Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Cleveland Un-Junkyard: Used Auto Parts & Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Cleveland West link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void columbiaLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(20).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Columbia Link");
            System.out.println("Expected:  Pull-A-Part: Columbia Auto Salvage & Used Auto Parts Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part: Columbia Auto Salvage & Used Auto Parts Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Columbia link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void knoxvilleLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(21).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Knoxville Link");
            System.out.println("Expected:  Pull-A-Part Salvage Yard & Used Auto Parts Un-Junkyard in Knoxville");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Salvage Yard & Used Auto Parts Un-Junkyard in Knoxville", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Knoxville link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void memphisLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(22).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Memphis Link");
            System.out.println("Expected:  Pull-A-Part Memphis Un-Junkyard: Used Auto Parts & Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Memphis Un-Junkyard: Used Auto Parts & Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Memphis link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void nashvilleLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(23).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Nashville Link");
            System.out.println("Expected:  Pull-A-Part Nashville Un-Junkyard: Used Car Parts & Auto Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Nashville Un-Junkyard: Used Car Parts & Auto Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Nashville link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void corpusChristiLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(24).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Corpus Christi Link");
            System.out.println("Expected:  Pull-A-Part Corpus Christi Un-Junkyard: Used Auto Parts & Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Corpus Christi Un-Junkyard: Used Auto Parts & Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Corpus Christi link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void elPasoLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(25).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("El Paso Link");
            System.out.println("Expected:  Pull-A-Part Salvage Yard in El Paso & Used Auto Parts Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Salvage Yard in El Paso & Used Auto Parts Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "El Paso link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        returnToFindAStorePage();
    }

    private void returnToFindAStorePage(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();
    }
}
