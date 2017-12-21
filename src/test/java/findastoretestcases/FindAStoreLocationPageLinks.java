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
        charotteLinkTitleCheck();
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
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Used Auto Parts in Birmingham");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Used Auto Parts in Birmingham", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Birmingham link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Used Auto Parts, Salvage & Un-Junkyard in Mobile");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts, Salvage & Un-Junkyard in Mobile", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Birmingham link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Montgomery Used Auto Parts & Salvage Yard Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Montgomery Used Auto Parts & Salvage Yard Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Montgomery link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Auto Salvage Tucson: Un-Junkyard & Used Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Auto Salvage Tucson: Un-Junkyard & Used Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Tucson link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Used Auto Parts & Salvage Yard in Lithonia");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts & Salvage Yard in Lithonia", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta East link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Norcross Used Auto Parts & Salvage");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Norcross Used Auto Parts & Salvage", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta North link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Used Auto Parts: Car Parts Un-Junkyard in Atlanta");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts: Car Parts Un-Junkyard in Atlanta", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta South link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Augusta Salvage Yard: Used Parts & Auto Salvage");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Augusta Salvage Yard: Used Parts & Auto Salvage", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Augusta link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Indianapolis Un-Junkyard & Used Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Indianapolis Un-Junkyard & Used Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Indianapolis link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Louisville link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Baton Rouge Used Auto Parts & Auto Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Baton Rouge Used Auto Parts & Auto Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Baton Rouge link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Salvage Yard & Used Auto Parts in Lafayette");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Salvage Yard & Used Auto Parts in Lafayette", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Lafayette link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Used Auto Parts & Salvage Yard in New Orleans");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts & Salvage Yard in New Orleans", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New Orleans link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Used Auto Parts & Auto Salvage Yard in Jackson");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts & Auto Salvage Yard in Jackson", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Jackson link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToFindAStorePage();
    }

    private void charotteLinkTitleCheck(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        List<WebElement> mobileLink = driver.findElements(By.cssSelector(".row ul a"));
        mobileLink.get(15).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Charlotte Link");
            System.out.println("Expected:  Pull-A-Part Auto Un-Junkyards: Charlotte Used Auto Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Auto Un-Junkyards: Charlotte Used Auto Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Charlotte link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Used Auto Parts & Salvage Car Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Used Auto Parts & Salvage Car Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Winston Salem link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Used Car Parts & Akron Auto Salvage Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Car Parts & Akron Auto Salvage Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Akron link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Canton Auto Salvage & Used Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Canton Auto Salvage & Used Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Canton link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Cleveland: Used Auto Parts & Car Un-Junkyard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Cleveland: Used Auto Parts & Car Un-Junkyard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Cleveland West link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Used Auto Parts & Un-Junkyard in Columbia");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts & Un-Junkyard in Columbia", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Columbia link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Knoxville Used Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Knoxville Used Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Knoxville link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Auto Salvage Yards: Used Auto Parts Memphis");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Auto Salvage Yards: Used Auto Parts Memphis", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Memphis link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Un-Junkyards: Used Auto & Car Parts Nashville");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyards: Used Auto & Car Parts Nashville", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Nashville link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part Salvage Yard & Used Auto Parts in Corpus Christi");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Salvage Yard & Used Auto Parts in Corpus Christi", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Corpus Christi link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
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
            System.out.println("Expected:  Pull-A-Part: El Paso Junk Car Parts & Auto Salvage Yard");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part: El Paso Junk Car Parts & Auto Salvage Yard", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "El Paso link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToFindAStorePage();
    }

    private void returnToFindAStorePage(){
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();
    }
}
