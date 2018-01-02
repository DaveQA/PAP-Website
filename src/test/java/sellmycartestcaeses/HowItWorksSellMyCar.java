package sellmycartestcaeses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HowItWorksSellMyCar {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    public void HowItWorksSellMyCarMainTest(WebDriver driver1) throws InterruptedException {
        smcHowItWorks(driver1);
        reviewsGetAQuoteForm();
        zipCodeBoxInAreaLookUp();
        zipCodeBoxOutOfAreaLookUp();
    }

    private void smcHowItWorks(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        goToHowItWorksPage(driver1);

        System.out.println("===================================================================================");
        System.out.println("How it Works Page");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");

        try {
            actualTitle = driver.getTitle();
            System.out.println("Sell My Car How It Works page");
            System.out.println("Expected:  Learn How to Sell a Junk Car for Cash with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Learn How to Sell a Junk Car for Cash with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "How It Works link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void reviewsGetAQuoteForm() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
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
        goToHowItWorksPage(driver);
    }

    private void zipCodeBoxInAreaLookUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".red-box .input"))));
        WebElement scrollToPoint = driver.findElement(By.cssSelector(".sub-nav"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPoint);

        List<WebElement> inputField = driver.findElements(By.cssSelector(".red-box .input"));
        wait.until(ExpectedConditions.elementToBeClickable(inputField.get(0)));
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
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Zip Code lookup did not complete, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void zipCodeBoxOutOfAreaLookUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);

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
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Zip Code lookup did not complete, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void goToHowItWorksPage(WebDriver driver1) {
        driver = driver1;
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));
        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(46)).click().build().perform();
    }
}