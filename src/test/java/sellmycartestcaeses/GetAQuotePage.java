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

public class GetAQuotePage {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    public void getAQuotePageMainTest(WebDriver driver1) throws InterruptedException {
        getAQuoteLandingPage(driver1);
        reviewsGetAQuoteForm();
        zipCodeBoxInAreaLookUp();
        zipCodeBoxOutOfAreaLookUp();
    }

    private void getAQuoteLandingPage(WebDriver driver1) {
        driver = driver1;
        String actualTitle;
        goToGetAQuotePage(driver1);

        System.out.println("===================================================================================");
        System.out.println("Get A Quote Page");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");

        try {
            actualTitle = driver.getTitle();
            System.out.println("Get A Quote page");
            System.out.println("Expected:  How Much Money You Can Get for A Junk Car with Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("How Much Money You Can Get for A Junk Car with Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Get A Quote link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void reviewsGetAQuoteForm() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> quoteFormInputField = driver.findElements(By.cssSelector(".quote-form input"));
        quoteFormInputField.get(7).click();
        List<WebElement> yearOption = driver.findElements(By.cssSelector(".option-container .option"));
        wait.until(ExpectedConditions.elementToBeClickable(yearOption.get(147)));
        yearOption.get(147).click();//Year 2014
        quoteFormInputField.get(8).click();
        List<WebElement> makeOption = driver.findElements(By.cssSelector(".option-container .option"));
        wait.until(ExpectedConditions.elementToBeClickable(makeOption.get(212)));
        makeOption.get(212).click();//Make Acura 65
        quoteFormInputField.get(9).click();
        List<WebElement> modelOption = driver.findElements(By.cssSelector(".option-container .option"));
        wait.until(ExpectedConditions.elementToBeClickable(modelOption.get(294)));
        modelOption.get(294).click();//Model CL
        quoteFormInputField.get(10).click();
        quoteFormInputField.get(10).sendKeys("30360");
        quoteFormInputField.get(11).click();
        quoteFormInputField.get(11).sendKeys("Get A Quote");
        quoteFormInputField.get(12).click();
        quoteFormInputField.get(12).sendKeys("TEST@PULLAPART.COM");
        quoteFormInputField.get(13).click();
        quoteFormInputField.get(13).sendKeys("5555555555");
        List<WebElement> submitButton = driver.findElements(By.cssSelector(".quote-form .button"));
        submitButton.get(1).click();
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
        Thread.sleep(1000);
        goToGetAQuotePage(driver);
    }

    private void zipCodeBoxInAreaLookUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement scrollToPoint = driver.findElement(By.cssSelector(".sub-nav"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPoint);

        List<WebElement> inputField = driver.findElements(By.cssSelector(".red-box .input"));
        wait.until(ExpectedConditions.elementToBeClickable(inputField.get(1)));
        inputField.get(1).click();
        inputField.get(1).sendKeys("30360");

        List<WebElement> zipCodeButton = driver.findElements(By.cssSelector(".red-box .button"));
        wait.until(ExpectedConditions.elementToBeClickable(zipCodeButton.get(1)));
        zipCodeButton.get(1).click();

        List<WebElement> zipCodeBoxSubtitle = driver.findElements(By.cssSelector(".subtitle"));
        Thread.sleep(1000);
        if (zipCodeBoxSubtitle.get(5).isDisplayed()) {
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
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement scrollToPoint = driver.findElement(By.cssSelector(".sub-nav"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPoint);

        List<WebElement> inputField = driver.findElements(By.cssSelector(".red-box .input"));
        wait.until(ExpectedConditions.elementToBeClickable(inputField.get(1)));
        inputField.get(1).click();
        inputField.get(1).sendKeys("99999");

        List<WebElement> zipCodeButton = driver.findElements(By.cssSelector(".red-box .button"));
        wait.until(ExpectedConditions.elementToBeClickable(zipCodeButton.get(1)));
        zipCodeButton.get(1).click();

        List<WebElement> zipCodeBoxSubtitle = driver.findElements(By.cssSelector(".subtitle"));
        Thread.sleep(1000);
        if (zipCodeBoxSubtitle.get(7).isDisplayed()) {
            System.out.println("Out Of Area Zip Code lookup completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Zip Code lookup did not complete, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void goToGetAQuotePage(WebDriver driver1) {
        driver = driver1;
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));
        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(50)).click().build().perform();
    }
}