package navtestcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Nav {

    private boolean debug = false;
    private WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    @Test

    public void navMainTests(WebDriver driver1) throws InterruptedException {
        navAutoPartsLink(driver1);
        navAutoPartsDropDownLink();
        navHowItWorksDropDownLink();
        navNewOnYardDropDownLink();
        navSearchCarInventoryDropDownLink();
        navPartsPricingDropDownLink();
        navNotifyMeDropDownLink();
        navSellMyCar();
        navSellMyCarDropDownLink();
        navSMCHowItWorksDropDownLink();
        navReviewsDropDown();
        navSMCFAQDropDownLink();
        navSellingTipsDropDown();
        navGetAQuoteDropDownLink();
        navInventory();
        navInventorySearchCarInventoryDropDownLink();
        navInterchangeablePartsDropDownLink();
        navVideo();
        navFindAStore();
        navBirminghamDropDownLink();
        navMobileDropDownLink();
        navMontgomeryDropDownLink();
        navTucsonDropDownLink();
        navAtlantaEastDropDownLink();
        navAtlantaNorthDropDownLink();
        navAtlantaSouthDropDownLink();
        navAugustaDropDownLink();
        navIndianapolisDropDownLink();
        navLouisvilleDropDownLink();
        navBatonRougeDropDownLink();
        navLafayetteDropDownLink();
        navNewOrleansDropDownLink();
        navJacksonDropDownLink();
        navCharlotteDropDownLink();
        navWinstonSalemDropDownLink();
        navAkronDropDownLink();
        navCantonDropDownLink();
        navClevelandWestDropDownLink();
        navColumbiaDropDownLink();
        navKnoxvilleDropDownLink();
        navMemphisDropDownLink();
        navNashvilleDropDownLink();
        navCorpusChristiDropDownLink();
        navElPasoDropDownLink();
        navVIPClub();
        navUsedCars();
        navFAQ();
        returnHome(driver1);
    }

    private void navAutoPartsLink(WebDriver driver1) {
        driver = driver1;
        List<WebElement> autoPartsNavLink = driver.findElements(By.cssSelector(".nav > div"));

        autoPartsNavLink.get(0).click();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Nav Tests");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Link in Nav");
            System.out.println("Expected:  Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navAutoPartsDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(1)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts First Drop Down link in Nav");
            System.out.println("Expected:  Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Used Auto Parts: Find Used Car Parts Near You at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts First Drop Down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navHowItWorksDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(2)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Second Drop Down link in Nav");
            System.out.println("Expected:  How It Works");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("How It Works", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts Second Drop Down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navNewOnYardDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(3)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Third Drop Down link in Nav");
            System.out.println("Expected:  Search Pull-A-Part's New Inventory for New on Yard Cars & Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Search Pull-A-Part's New Inventory for New on Yard Cars & Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts Third Drop Down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navSearchCarInventoryDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(4)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Fourth Drop Down link in Nav");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts Fourth Drop Down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navPartsPricingDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(5)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Fifth Drop Down link in Nav");
            System.out.println("Expected:  Pull-A-Part Price List: Low Prices for Auto Salvage Parts");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Price List: Low Prices for Auto Salvage Parts", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts Fifth Drop Down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navNotifyMeDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(0)).moveToElement(autoParts.get(6)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Sixth Drop Down link in Nav");
            System.out.println("Expected:  Notify Me: Pull-A-Part Car Alert & Notification Service");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Notify Me: Pull-A-Part Car Alert & Notification Service", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Auto Parts Sixth Drop Down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navSellMyCar() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        autoParts.get(44).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car Link in Nav");
            System.out.println("Expected:  Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navSellMyCarDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(45)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car first link in Nav");
            System.out.println("Expected:  Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car first drop down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navSMCHowItWorksDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(46)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car second link in Nav");
            System.out.println("Expected:  Learn How to Sell a Junk Car for Cash with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Learn How to Sell a Junk Car for Cash with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car second drop down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navReviewsDropDown() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(47)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car third link in Nav");
            System.out.println("Expected:  Reviews");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Reviews", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car third drop down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navSMCFAQDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(48)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car fourth link in Nav");
            System.out.println("Expected:  Pull-A-Part Car Buying Frequently Asked Questions (FAQs)");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Car Buying Frequently Asked Questions (FAQs)", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car fourth drop down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navSellingTipsDropDown() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(49)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car fifth link in Nav");
            System.out.println("Expected:  Selling Tips");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Selling Tips", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car fifth drop down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navGetAQuoteDropDownLink() {
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(50)).click().build().perform();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car sixth link in Nav");
            System.out.println("Expected:  How Much Money You Can Get for A Junk Car with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("How Much Money You Can Get for A Junk Car with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car sixth drop down link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navInventory() {
        List<WebElement> inventoryNavLink = driver.findElements(By.cssSelector(".nav > div"));

        inventoryNavLink.get(2).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Inventory Link in Nav");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navInventorySearchCarInventoryDropDownLink() {
        List<WebElement> searchCarInventoryLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(searchCarInventoryLink.get(88)).moveToElement(searchCarInventoryLink.get(89)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Search Car Inventory DropDown Link in Nav");
            System.out.println("Expected:  Pull-A-Part Inventory Search: Inventory Car Parts Search");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Inventory Search: Inventory Car Parts Search", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navInterchangeablePartsDropDownLink() {
        List<WebElement> searchCarInventoryLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(searchCarInventoryLink.get(88)).moveToElement(searchCarInventoryLink.get(90)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Interchange Parts DropDown Link in Nav");
            System.out.println("Expected:  Interchangeable Car Parts: Auto Parts Interchange Database Lookup");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Interchangeable Car Parts: Auto Parts Interchange Database Lookup", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Inventory link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navVideo() {
        List<WebElement> videoNavLink = driver.findElements(By.cssSelector(".nav > div"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        videoNavLink.get(3).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Video Link in Nav");
            System.out.println("Expected:  Video Library");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Video Library", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Video link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        wait.until(ExpectedConditions.elementToBeClickable(findAStoreNavLink.get(4)));
    }

    private void navFindAStore() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));

        findAStoreNavLink.get(4).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Find A Store Link in Nav");
            System.out.println("Expected:  Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Un-Junkyard: Auto Salvage Yard Locations & Hours", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Find A Store link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navBirminghamDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(168)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Birmingham DropDown Link in Nav");
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
    }

    private void navMobileDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(169)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Mobile DropDown Link in Nav");
            System.out.println("Expected:  Pull-A-Part Used Auto Parts, Salvage & Un-Junkyard in Mobile");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part Used Auto Parts, Salvage & Un-Junkyard in Mobile", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Mobile link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navMontgomeryDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(170)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Montgomery DropDown Link in Nav");
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
    }

    private void navTucsonDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(172)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Tucson DropDown Link in Nav");
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
    }

    private void navAtlantaEastDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(174)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta East DropDown Link in Nav");
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
    }

    private void navAtlantaNorthDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(175)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta North DropDown Link in Nav");
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
    }

    private void navAtlantaSouthDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(176)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta South DropDown Link in Nav");
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
    }

    private void navAugustaDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(177)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Augusta DropDown Link in Nav");
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
    }

    private void navIndianapolisDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(179)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Indianapolis DropDown Link in Nav");
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
    }

    private void navLouisvilleDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(181)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Louisville DropDown Link in Nav");
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
    }

    private void navBatonRougeDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(183)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Baton Rouge DropDown Link in Nav");
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
    }

    private void navLafayetteDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(184)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Lafayette DropDown Link in Nav");
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
    }

    private void navNewOrleansDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(185)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("New Orleans DropDown Link in Nav");
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
    }

    private void navJacksonDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(187)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Jackson DropDown Link in Nav");
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
    }

    private void navCharlotteDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(189)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Charlotte DropDown Link in Nav");
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
    }

    private void navWinstonSalemDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(190)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Winston Salem DropDown Link in Nav");
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
    }

    private void navAkronDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(192)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Akron DropDown Link in Nav");
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
    }

    private void navCantonDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(193)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Canton DropDown Link in Nav");
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
    }

    private void navClevelandWestDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(194)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Cleveland West DropDown Link in Nav");
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
    }

    private void navColumbiaDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(196)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Columbia DropDown Link in Nav");
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
    }

    private void navKnoxvilleDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(198)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Knoxville DropDown Link in Nav");
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
    }

    private void navMemphisDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(199)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Memphis DropDown Link in Nav");
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
    }

    private void navNashvilleDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(200)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Nashville DropDown Link in Nav");
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
    }

    private void navCorpusChristiDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(202)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Corpus Christi DropDown Link in Nav");
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
    }

    private void navElPasoDropDownLink() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav a"));

        Actions action = new Actions(driver);
        action.moveToElement(findAStoreNavLink.get(166)).moveToElement(findAStoreNavLink.get(203)).click().build().perform();
        try {
            actualTitle = driver.getTitle();
            System.out.println("El Paso DropDown Link in Nav");
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
    }

    private void navVIPClub() {
        List<WebElement> vipClubNavLink = driver.findElements(By.cssSelector(".nav > div"));

        vipClubNavLink.get(5).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("VIP Link in Nav");
            System.out.println("Expected:  VIP Club");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("VIP Club", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "VIP link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navUsedCars() {
        List<WebElement> usedCarNavLink = driver.findElements(By.cssSelector(".nav > div"));

        usedCarNavLink.get(6).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("Used Car Link in Nav");
            System.out.println("Expected:  Used Cars for Sale: Search Used Cars for Sale at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Used Cars for Sale: Search Used Cars for Sale at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Used Cars link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void navFAQ() {
        List<WebElement> faqNavLink = driver.findElements(By.cssSelector(".nav > div"));

        faqNavLink.get(7).click();
        try {
            actualTitle = driver.getTitle();
            System.out.println("FAQ Link in Nav");
            System.out.println("Expected:  FAQ");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("FAQ", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "FAQ link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void returnHome(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.className("logo")).click();
    }
}
