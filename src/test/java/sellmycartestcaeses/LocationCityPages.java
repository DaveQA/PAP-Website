package sellmycartestcaeses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LocationCityPages {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    public void smcLocationPagesMainTest(WebDriver driver1) throws InterruptedException {
        sellMyCarAkronPage(driver1);
        sellMyCarAugustaPage(driver1);
        sellMyCarBatonRougePage(driver1);
        sellMyCarBirminghamPage(driver1);
        sellMyCarCantonPage(driver1);
        sellMyCarCharlottePage(driver1);
        sellMyCarClevelandPage(driver1);
        sellMyCarColumbiaPage(driver1);
        sellMyCarConleyPage(driver1);
        sellMyCarCorpusChristiPage(driver1);
        sellMyCarElPasoPage(driver1);
        sellMyCarIndianapolisPage(driver1);
        sellMyCarJacksonPage(driver1);
        sellMyCarKnoxvillePage(driver1);
        sellMyCarLafayettePage(driver1);
        sellMyCarLithoniaPage(driver1);
        sellMyCarLouisvillePage(driver1);
        sellMyCarMemphisPage(driver1);
        sellMyCarMobilePage(driver1);
        sellMyCarMontgomeryPage(driver1);
        sellMyCarNashvillePage(driver1);
        sellMyCarNewOrleansPage(driver1);
        sellMyCarNorcrossPage(driver1);
        sellMyCarTucsonPage(driver1);
        sellMyCarWinstonSalemPage(driver1);
    }

    private void sellMyCarAkronPage(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();
        System.out.println("===================================================================================");
        System.out.println("Location Page Tests");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> ackronLink = driver.findElements(By.cssSelector(".bottom-links li a"));
            ackronLink.get(0).click();
            actualTitle = driver.getTitle();
            System.out.println("Akron Location link");
            System.out.println("Expected:  Cash for Junk Cars Akron: Sell Your Junk Car with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars Akron: Sell Your Junk Car with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Akron link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        akronMakeGetAQuoteForm();
    }

    private void sellMyCarAugustaPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(1).click();
            actualTitle = driver.getTitle();
            System.out.println("Canton Location link");
            System.out.println("Expected:  Get Cash for Your Junk Car in Augusta with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Cash for Your Junk Car in Augusta with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Augusta link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarBatonRougePage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(2).click();
            actualTitle = driver.getTitle();
            System.out.println("Baton Rouge Location link");
            System.out.println("Expected:  Get Cash for Junk Cars in Baton Rouge with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Cash for Junk Cars in Baton Rouge with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Baton Rouge link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarBirminghamPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(3).click();
            actualTitle = driver.getTitle();
            System.out.println("Birmingham Location link");
            System.out.println("Expected:  Cash for Junk Cars Birmingham: Sell Your Junk Car for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars Birmingham: Sell Your Junk Car for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Birmingham link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarCantonPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(4).click();
            actualTitle = driver.getTitle();
            System.out.println("Canton Location link");
            System.out.println("Expected:  Junk Your Car: Sell A Junk Car for Cash in Canton | Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Junk Your Car: Sell A Junk Car for Cash in Canton | Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Canton link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarCharlottePage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(5).click();
            actualTitle = driver.getTitle();
            System.out.println("Charlotte Location link");
            System.out.println("Expected:  Cash for Junk Cars: Sell Your Junk Car in Charlotte, NC");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Junk Car in Charlotte, NC", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Charlotte link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarClevelandPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(6).click();
            actualTitle = driver.getTitle();
            System.out.println("Cleveland Location link");
            System.out.println("Expected:  Cash for Junk Cars: Sell Your Car in Cleveland at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Car in Cleveland at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Cleveland link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarColumbiaPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(7).click();
            actualTitle = driver.getTitle();
            System.out.println("Columbia Location link");
            System.out.println("Expected:  Get Cash for Selling Your Junk Car with Pull-A-Part Columbia");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Cash for Selling Your Junk Car with Pull-A-Part Columbia", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Columbia link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarConleyPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(8).click();
            actualTitle = driver.getTitle();
            System.out.println("Conley Location link");
            System.out.println("Expected:  Cash for Junk Cars Atlanta, GA: Sell Your Junk Car Today");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars Atlanta, GA: Sell Your Junk Car Today", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Conley link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarCorpusChristiPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(9).click();
            actualTitle = driver.getTitle();
            System.out.println("Corpus Christi Location link");
            System.out.println("Expected:  Junk Your Car: Sell Your Junk Car for Cash in Corpus Christi");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Junk Your Car: Sell Your Junk Car for Cash in Corpus Christi", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Corpus Christi link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarElPasoPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(10).click();
            actualTitle = driver.getTitle();
            System.out.println("El Paso Location link");
            System.out.println("Expected:  Junk Your Car & Get Cash for Junk Cars El Paso: Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Junk Your Car & Get Cash for Junk Cars El Paso: Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "El Paso link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarIndianapolisPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(11).click();
            actualTitle = driver.getTitle();
            System.out.println("Indianapolis Location link");
            System.out.println("Expected:  Get Cash for Junk Cars in Indianapolis & Sell Your Junk Car");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Cash for Junk Cars in Indianapolis & Sell Your Junk Car", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Indianapolis link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarJacksonPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(12).click();
            actualTitle = driver.getTitle();
            System.out.println("Jackson Location link");
            System.out.println("Expected:  Sell Your Junk Car for Cash: Pull-A-Part in Jackson, MS");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Junk Car for Cash: Pull-A-Part in Jackson, MS", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Jackson link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarKnoxvillePage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(13).click();
            actualTitle = driver.getTitle();
            System.out.println("Knoxville Location link");
            System.out.println("Expected:  Sell Junk Cars for Cash in Knoxville, TN with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Junk Cars for Cash in Knoxville, TN with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Knoxville link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarLafayettePage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(14).click();
            actualTitle = driver.getTitle();
            System.out.println("Lafayette Location link");
            System.out.println("Expected:  Sell Junk Cars & Get Cash in Lafayette with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Junk Cars & Get Cash in Lafayette with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Lafayette link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarLithoniaPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(15).click();
            actualTitle = driver.getTitle();
            System.out.println("Lithonia Location link");
            System.out.println("Expected:  Cash For Junk Cars in Lithonia: Sell Junk Cars with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash For Junk Cars in Lithonia: Sell Junk Cars with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Lithonia link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarLouisvillePage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(16).click();
            actualTitle = driver.getTitle();
            System.out.println("Louisville Location link");
            System.out.println("Expected:  Cash for Junk Cars Louisville, KY: Sell A Junk Car | Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars Louisville, KY: Sell A Junk Car | Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Louisville link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarMemphisPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(17).click();
            actualTitle = driver.getTitle();
            System.out.println("Memphis Location link");
            System.out.println("Expected:  Cash for Junk Cars Memphis, TN: Sell Junk Cars for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars Memphis, TN: Sell Junk Cars for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Memphis link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarMobilePage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(18).click();
            actualTitle = driver.getTitle();
            System.out.println("Mobile Location link");
            System.out.println("Expected:  Sell Your Junk Car & Get Cash for Junk Cars in Mobile, AL");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Junk Car & Get Cash for Junk Cars in Mobile, AL", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Mobile link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarMontgomeryPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(19).click();
            actualTitle = driver.getTitle();
            System.out.println("Montgomery Location link");
            System.out.println("Expected:  Cash for Junk Cars: Sell Junk Cars in Montgomery & Prattville");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Junk Cars in Montgomery & Prattville", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Montgomery link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarNashvillePage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(20).click();
            actualTitle = driver.getTitle();
            System.out.println("Nashville Location link");
            System.out.println("Expected:  Cash for Junk Cars Nashville, TN: Sell Junk Cars at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars Nashville, TN: Sell Junk Cars at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Nashville link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarNewOrleansPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(21).click();
            actualTitle = driver.getTitle();
            System.out.println("New Orleans Location link");
            System.out.println("Expected:  Cash for Junk Cars: Sell Your Junk Car in New Orleans");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Junk Car in New Orleans", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New Orleans link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarNorcrossPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(22).click();
            actualTitle = driver.getTitle();
            System.out.println("Norcross Location link");
            System.out.println("Expected:  Cash for Junk Cars: Sell Junk Cars in Norcross for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Junk Cars in Norcross for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Norcross link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarTucsonPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(23).click();
            actualTitle = driver.getTitle();
            System.out.println("Tucson Location link");
            System.out.println("Expected:  Get Cash for Junk Cars & Sell Your Junk Car in Tucson, AZ");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Cash for Junk Cars & Sell Your Junk Car in Tucson, AZ", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Tucson link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void sellMyCarWinstonSalemPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(24).click();
            actualTitle = driver.getTitle();
            System.out.println("Winsotn-Salem Location link");
            System.out.println("Expected:  Sell A Junk Car for Cash Today with Pull-A-Part Winston-Salem");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell A Junk Car for Cash Today with Pull-A-Part Winston-Salem", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Winston-Salem link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void akronMakeGetAQuoteForm() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> quoteFormInputField = driver.findElements(By.cssSelector(".quote-form input"));
        quoteFormInputField.get(0).click();
        List<WebElement> yearOption = driver.findElements(By.cssSelector(".option-container .option"));
        wait.until(ExpectedConditions.elementToBeClickable(yearOption.get(0)));
        yearOption.get(0).click();//Year 2014
        quoteFormInputField.get(1).click();
        List<WebElement> makeOption = driver.findElements(By.cssSelector(".option-container .option"));
        wait.until(ExpectedConditions.elementToBeClickable(makeOption.get(65)));
        makeOption.get(65).click();//Make Acura 65
        quoteFormInputField.get(2).click();
        List<WebElement> modelOption = driver.findElements(By.cssSelector(".option-container .option"));
        wait.until(ExpectedConditions.elementToBeClickable(modelOption.get(147)));
        modelOption.get(147).click();//Model CL
        quoteFormInputField.get(3).click();
        quoteFormInputField.get(3).sendKeys("30360");
        quoteFormInputField.get(4).click();
        quoteFormInputField.get(4).sendKeys("How It Works Page");
        quoteFormInputField.get(5).click();
        quoteFormInputField.get(5).sendKeys("TEST@PULLAPART.COM");
        quoteFormInputField.get(6).click();
        quoteFormInputField.get(6).sendKeys("5555555555");
        driver.findElement(By.cssSelector(".quote-form button")).click();
        if (driver.findElements(By.cssSelector("#top-of-form")).size() != 0) {
            System.out.println("The Get A Quote form was submitted.");
            if (driver.getCurrentUrl().contains("https://stg")) {
                System.out.println("Email was sent to the QA Pull-A-Part email account, confirm email was sent.");
            } else if (driver.getCurrentUrl().contains("https://uat")) {
                System.out.println("Email was sent to the QA UAT Pull-A-Part email account, confirm email was sent.");
            } else if (driver.getCurrentUrl().contains("https://www")) {
                System.out.println("Email was sent to the Car Buy Pull-A-Part email account, confirm email was sent.");
            }
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "The Get A Quote form was not submitted, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        scrollToLocationList(driver);
        List<WebElement> akronLink = driver.findElements(By.cssSelector(".bottom-links li a"));
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
        akronLink.get(0).click();
    }

    private void scrollToLocationList(WebDriver driver1) {
        driver = driver1;
        WebElement locationTitle = driver.findElement(By.cssSelector(".bottom-links"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", locationTitle);
    }
}