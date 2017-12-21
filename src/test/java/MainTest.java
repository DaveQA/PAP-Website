/**
 * Created by dholliday on 4/12/2017.
 */

import autopartstestcases.*;
import findastoretestcases.*;
import footertestcases.Footer;
import footertestcases.SiteMap;
import footertestcases.SocialMediaLinks;
import homepagetestcases.HomePage;
import interchangepartstestcases.InterchangeablePartsInventory;
import navtestcases.Nav;
import sellmycartestcaeses.*;
import usedcarstestcases.*;
import viptestcases.VIP;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainTest {
    private static boolean debug = true;
    public static String prefix = "stg";
    public static String url;
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    @BeforeClass
    public static void Browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dholliday\\Desktop\\Everything Selenium\\SeleniumDrivers\\ChromeDrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test

    public void WebsiteTest() throws InterruptedException {
        Nav navTests = new Nav();
////======================================================================================================================
        HomePage homePageTest = new HomePage();
////======================================================================================================================
        AutoParts autoPartsTest = new AutoParts();
        AutoPartsSubNavActiveFlag autoPartsActiveTests = new AutoPartsSubNavActiveFlag();
        HowItWorks howItWorksTest = new HowItWorks();
        HowItWorksSubNavActiveFlag howItWorksActiveTests = new HowItWorksSubNavActiveFlag();
        SearchCarInventory searchCarInventoryTest = new SearchCarInventory();
        SearchCarInventorySubNavActiveFlag searchCarInventoryActiveTests = new SearchCarInventorySubNavActiveFlag();
        InterchangeablePartsInventory interchangeableSearchTests = new InterchangeablePartsInventory();
        PartsPricing partsPricingTest = new PartsPricing();
        NewOnYard newOnYardTest = new NewOnYard();
        NewOnYardSubNavActiveFlag newOnYardActiveTests = new NewOnYardSubNavActiveFlag();
        NotifyMe notifyMeTest = new NotifyMe();
////======================================================================================================================
        SellMyCar sellMyCarTest = new SellMyCar();
        HowItWorksSellMyCar howItWorksSMC = new HowItWorksSellMyCar();
        Reviews reviewsSMC = new Reviews();
        SellMyCarFAQ faqSMC = new SellMyCarFAQ();
        SellingTips sellingTipsSMC = new SellingTips();
        GetAQuotePage getAQuoteSMC = new GetAQuotePage();
        LocationCityPages smcLocationTest = new LocationCityPages();
        PopularMakesPages smcPopularMakesTest = new PopularMakesPages();
////======================================================================================================================
        FindAStoreSearch findAStoreTest = new FindAStoreSearch();
        FindAStoreLocationPageLinks locationLinksTest = new FindAStoreLocationPageLinks();
////======================================================================================================================
        VIP vipTest = new VIP();
////======================================================================================================================
        UsedCar usedCarTest = new UsedCar();
        UsedCarLocationPages usedCarLocationPageTest = new UsedCarLocationPages();
////======================================================================================================================
        Footer footerTests = new Footer();
        SocialMediaLinks socialMediaTest = new SocialMediaLinks();
////======================================================================================================================
        SiteMap siteMapTests = new SiteMap();
////======================================================================================================================

        if (prefix.equals("stg")) {
            url = "https://stg.pullapart.com/";
        } else if (prefix.equals("uat")) {
            url = "https://uat.pullapart.com/";
        } else if (prefix.equals("prod")) {
            url = "https://www.pullapart.com/";
        }
        if (debug)
            System.out.println(url);
        driver.get(url);
//        navTests.navMainTests(driver);
////======================================================================================================================
//        homePageTest.homeMainTest(driver);
////======================================================================================================================
//        autoPartsActiveTests.autoPartsActiveMainTest(driver);
//        autoPartsTest.autoPartMainTest(driver);
//        howItWorksActiveTests.howItWorksActiveMainTest(driver);
//        howItWorksTest.howItWorksMainTest(driver);
//        newOnYardTest.SearchNewOnYardMainTest(driver);
//        newOnYardActiveTests.newOnYardActiveMainTest(driver);
//        searchCarInventoryTest.searchInventoryMainTest(driver);
//        searchCarInventoryActiveTests.notifyMeActiveMainTest(driver);
//        interchangeableSearchTests.interchangeablePartsInventoryMainTests(driver);
//        partsPricingTest.partsPricingMainTest(driver);
//        notifyMeTest.notifyMePageMainTest(driver);
////======================================================================================================================
//        sellMyCarTest.sellMyCarMainTest(driver);
//        howItWorksSMC.HowItWorksSellMyCarMainTest(driver);
//        reviewsSMC.reviewsMainTest(driver);
//        faqSMC.sellMyCarFAQMainTest(driver);
//        sellingTipsSMC.sellMyCarSellingTipsMainTest(driver);
//        getAQuoteSMC.getAQuotePageMainTest(driver);
//        smcLocationTest.smcLocationPagesMainTest(driver);
//        smcPopularMakesTest.SMCPopularMakesMainTest(driver);
////======================================================================================================================
////        inventoryTest.searchInventoryMainTest(driver);
////======================================================================================================================
//        findAStoreTest.findAStoreMainTest(driver);
//        locationLinksTest.findAStoreLocationPageLinksMainTest(driver);
////======================================================================================================================
//        usedCarTest.usedCarMainTest(driver);
//        usedCarLocationPageTest.usedCarLocationPagesMainTest(driver);
////======================================================================================================================
//        vipTest.vipMainTest(driver);
////======================================================================================================================
        footerTests.footerMainTest(driver);
//        socialMediaTest.socialMediaLinksTest(driver);
//        siteMapTests.sitMapMainTest(driver);
////======================================================================================================================
//        returnHome(driver);
    }

    private void returnHome(WebDriver driver1) {
        driver = driver1;
        driver.findElement(By.className("logo")).click();
    }

    @AfterClass
    public static void CloseBrowser() throws InterruptedException {
        //Thread.sleep (2000);
        //driver.quit();
    }
}