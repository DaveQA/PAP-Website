package sellmycartestcaeses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PopularMakesPages {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    public void SMCPopularMakesMainTest(WebDriver driver1) throws InterruptedException {
        Acura(driver1);
        BMW(driver1);
        Buick(driver1);
        Cadillac(driver1);
        Chevy(driver1);
        Chrysler(driver1);
        Daewoo(driver1);
        Datsun(driver1);
        Dodge(driver1);
        Eagle(driver1);
        Ford(driver1);
        GMC(driver1);
        Honda(driver1);
        Hyundai(driver1);
        Isuzu(driver1);
        Jeep(driver1);
        Lexus(driver1);
        Lincoln(driver1);
        Mazda(driver1);
        Mercury(driver1);
        MG(driver1);
        Mitsubushi(driver1);
        Nissan(driver1);
        Peugeot(driver1);
        Plymouth(driver1);
        Pontiac(driver1);
        Renault(driver1);
        Saturn(driver1);
        Sterling(driver1);
        Subaru(driver1);
        Toyota(driver1);
        Volkswagen(driver1);
        Volvo(driver1);
    }

    private void Acura(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();
        System.out.println("===================================================================================");
        System.out.println("Popular Page Tests");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> acuraLink = driver.findElements(By.cssSelector(".bottom-links li a"));
            acuraLink.get(25).click();
            actualTitle = driver.getTitle();
            System.out.println("Acura Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Acura at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Acura at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Acura link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        acuraMakeGetAQuoteForm();
        zipCodeBoxInAreaLookUp();
        zipCodeBoxOutOfAreaLookUp();
    }

    private void BMW(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> bmwLink = driver.findElements(By.cssSelector(".bottom-links li a"));
            bmwLink.get(26).click();
            actualTitle = driver.getTitle();
            System.out.println("BMW Popular Make link");
            System.out.println("Expected:  Sell Your Junk BMW: Get Cash for a BMW at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Junk BMW: Get Cash for a BMW at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "BMW link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Buick(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(27).click();
            actualTitle = driver.getTitle();
            System.out.println("Buick Popular Make link");
            System.out.println("Expected:  Sell a Junk Buick for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Buick for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Buick link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Cadillac(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(28).click();
            actualTitle = driver.getTitle();
            System.out.println("Cadillac Popular Make link");
            System.out.println("Expected:  We Buy Junk Cadillacs: Sell Your Cadillac at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("We Buy Junk Cadillacs: Sell Your Cadillac at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Cadillac link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Chevy(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(29).click();
            actualTitle = driver.getTitle();
            System.out.println("Chevy Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Chevy at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Chevy at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Chevy link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Chrysler(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(30).click();
            actualTitle = driver.getTitle();
            System.out.println("Chrysler Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Chrysler at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Chrysler at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Chrysler link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Daewoo(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(31).click();
            actualTitle = driver.getTitle();
            System.out.println("Daewoo Popular Make link");
            System.out.println("Expected:  Sell a Junk Daewoo for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Daewoo for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Daewoo link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Datsun(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(32).click();
            actualTitle = driver.getTitle();
            System.out.println("Datsun Popular Make link");
            System.out.println("Expected:  Sell a Junk Datsun for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Datsun for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Datsun link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Dodge(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(33).click();
            actualTitle = driver.getTitle();
            System.out.println("Dodge Popular Make link");
            System.out.println("Expected:  Sell Your Dodge: Pull-A-Part Buys Junk Dodges for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Dodge: Pull-A-Part Buys Junk Dodges for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Dodge link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Eagle(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(34).click();
            actualTitle = driver.getTitle();
            System.out.println("Eagle Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Eagle at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Eagle at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Eagle link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Ford(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(35).click();
            actualTitle = driver.getTitle();
            System.out.println("Ford Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Ford at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Ford at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Ford link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void GMC(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(36).click();
            actualTitle = driver.getTitle();
            System.out.println("GMC Popular Make link");
            System.out.println("Expected:  We Buy Junk GMCs: Sell Your GMC at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("We Buy Junk GMCs: Sell Your GMC at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "GMC link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Honda(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(37).click();
            actualTitle = driver.getTitle();
            System.out.println("Honda Popular Make link");
            System.out.println("Expected:  Sell Your Junk Honda: Get Cash for a Honda at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Junk Honda: Get Cash for a Honda at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Honda link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Hyundai(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(38).click();
            actualTitle = driver.getTitle();
            System.out.println("Hyundai Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Hyundai at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Hyundai at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Hyundai link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Isuzu(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(39).click();
            actualTitle = driver.getTitle();
            System.out.println("Isuzu Popular Make link");
            System.out.println("Expected:  Sell Your Isuzu: Pull-A-Part Buys Junk Isuzus for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Isuzu: Pull-A-Part Buys Junk Isuzus for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Isuzu link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Jeep(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(40).click();
            actualTitle = driver.getTitle();
            System.out.println("Jeep Popular Make link");
            System.out.println("Expected:  Sell Your Jeep: Pull-A-Part Buys Junk Jeeps for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Jeep: Pull-A-Part Buys Junk Jeeps for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Jeep link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Lexus(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(41).click();
            actualTitle = driver.getTitle();
            System.out.println("Lexus Popular Make link");
            System.out.println("Expected:  Sell Your Junk Lexus: Get Cash for a Lexus at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Junk Lexus: Get Cash for a Lexus at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Lexus link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Lincoln(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(42).click();
            actualTitle = driver.getTitle();
            System.out.println("Lincoln Popular Make link");
            System.out.println("Expected:  We Buy Junk Lincolns: Sell Your Lincoln at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("We Buy Junk Lincolns: Sell Your Lincoln at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Lincoln link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Mazda(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(43).click();
            actualTitle = driver.getTitle();
            System.out.println("Mazda Popular Make link");
            System.out.println("Expected:  Sell Your Junk Mazda: Get Cash for a Mazda at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Junk Mazda: Get Cash for a Mazda at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Mazda link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Mercury(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(44).click();
            actualTitle = driver.getTitle();
            System.out.println("Mercury Popular Make link");
            System.out.println("Expected:  Sell Your Mercury: Pull-A-Part Buys Junk Mercurys for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Mercury: Pull-A-Part Buys Junk Mercurys for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Mercury link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void MG(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(45).click();
            actualTitle = driver.getTitle();
            System.out.println("MG Popular Make link");
            System.out.println("Expected:  We Buy Junk MGs: Sell Your MG at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("We Buy Junk MGs: Sell Your MG at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "MG link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Mitsubushi(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(46).click();
            actualTitle = driver.getTitle();
            System.out.println("Mitsubushi Popular Make link");
            System.out.println("Expected:  We Buy Junk Mitsubishis: Sell Your Mitsubishi at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("We Buy Junk Mitsubishis: Sell Your Mitsubishi at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Mitsubushi link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Nissan(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(47).click();
            actualTitle = driver.getTitle();
            System.out.println("Nissan Popular Make link");
            System.out.println("Expected:  Sell a Junk Nissan for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Nissan for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Nissan link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Peugeot(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(48).click();
            actualTitle = driver.getTitle();
            System.out.println("Peugeot Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Peugeot at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Peugeot at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Peugeot link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Plymouth(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(49).click();
            actualTitle = driver.getTitle();
            System.out.println("Plymouth Popular Make link");
            System.out.println("Expected:  Sell a Junk Plymouth for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Plymouth for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Plymouth link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Pontiac(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(50).click();
            actualTitle = driver.getTitle();
            System.out.println("Pontiac Popular Make link");
            System.out.println("Expected:  Sell Your Junk Pontiac: Get Cash for a Pontiac at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Junk Pontiac: Get Cash for a Pontiac at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Pontiac link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Renault(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(51).click();
            actualTitle = driver.getTitle();
            System.out.println("Renault Popular Make link");
            System.out.println("Expected:  We Buy Junk Renaults: Sell Your Renault at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("We Buy Junk Renaults: Sell Your Renault at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Renault link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Saturn(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(52).click();
            actualTitle = driver.getTitle();
            System.out.println("Saturn Popular Make link");
            System.out.println("Expected:  Get Fast Cash for Your Junk Saturn at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Get Fast Cash for Your Junk Saturn at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Saturn link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Sterling(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(53).click();
            actualTitle = driver.getTitle();
            System.out.println("Sterling Popular Make link");
            System.out.println("Expected:  Sell a Junk Sterling for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Sterling for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sterling link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Subaru(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(54).click();
            actualTitle = driver.getTitle();
            System.out.println("Subaru Popular Make link");
            System.out.println("Expected:  Sell Your Subaru: Pull-A-Part Buys Junk Subarus for Cash");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell Your Subaru: Pull-A-Part Buys Junk Subarus for Cash", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Subaru link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Toyota(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(55).click();
            actualTitle = driver.getTitle();
            System.out.println("Toyota Popular Make link");
            System.out.println("Expected:  Sell a Junk Toyota for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Toyota for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Toyota link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Volkswagen(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(56).click();
            actualTitle = driver.getTitle();
            System.out.println("Volkswagen Popular Make link");
            System.out.println("Expected:  We Buy Junk Volkswagens: Sell Your Volkswagen at Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("We Buy Junk Volkswagens: Sell Your Volkswagen at Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Volkswagen link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void Volvo(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();

        try {
            scrollToLocationList(driver1);
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
            List<WebElement> elems = driver.findElements(By.cssSelector(".bottom-links li a"));
            elems.get(57).click();
            actualTitle = driver.getTitle();
            System.out.println("Volvo Popular Make link");
            System.out.println("Expected:  Sell a Junk Volvo for Top Dollar with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Sell a Junk Volvo for Top Dollar with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Volvo link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void scrollToLocationList(WebDriver driver1) {
        driver = driver1;
        WebElement locationTitle = driver.findElement(By.cssSelector(".bottom-links"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", locationTitle);
    }


    private void acuraMakeGetAQuoteForm() throws InterruptedException {
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
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "The Get A Quote form was not submitted, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        scrollToLocationList(driver);
        List<WebElement> acuraLink = driver.findElements(By.cssSelector(".bottom-links li a"));
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".bottom-links li a"))));
        acuraLink.get(25).click();
    }

    private void zipCodeBoxInAreaLookUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".red-box .input"))));
        WebElement scrollToPoint = driver.findElement(By.cssSelector(".sub-nav"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPoint);

        List<WebElement> inputField = driver.findElements(By.cssSelector(".red-box .input"));
        wait.until(ExpectedConditions.elementToBeClickable(inputField.get(0)));
        inputField.get(0).click();
        driver.findElement(By.cssSelector(".red-box .input")).sendKeys("30360");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".red-box .button"))));
        driver.findElement(By.cssSelector(".red-box button")).click();
        List<WebElement> zipCodeBoxSubtitle = driver.findElements(By.cssSelector("h3"));
        Thread.sleep(1000);

        if (zipCodeBoxSubtitle.get(2).isDisplayed()) {
            System.out.println("In Of Area Zip Code lookup completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Zip Code lookup did not complete, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void zipCodeBoxOutOfAreaLookUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement scrollToPoint = driver.findElement(By.cssSelector(".sub-nav"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPoint);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".red-box .input"))));
        driver.findElement(By.cssSelector(".red-box .input")).click();
        driver.findElement(By.cssSelector(".red-box .input")).sendKeys("99999");
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".red-box .button"))));
        driver.findElement(By.cssSelector(".red-box button")).click();
        List<WebElement> zipCodeBoxSubtitle = driver.findElements(By.cssSelector("h3"));
        Thread.sleep(1000);
        if (zipCodeBoxSubtitle.get(3).isDisplayed()) {
            System.out.println("Out Of Area Zip Code lookup completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Zip Code lookup did not complete, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }
}
