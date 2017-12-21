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

public class SellingTips {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void sellMyCarSellingTipsMainTest(WebDriver driver1) throws InterruptedException {
        reviewsTitleCheck(driver1);
        reviewsGetAQuoteForm();
        zipCodeBoxInAreaLookUp();
        zipCodeBoxOutOfAreaLookUp();
        FordExplorerTransmissionProblems();
        hondaAccordTransmissionProblems();
        waysToTellWhenToSellYourCar();
        canISellMyCarWithoutATitle();
        dodgeIntrepidProblems();
        howLongShouldYouKeepACar();
        howToGetTheMostMoneyForJunkCars();
        partingOutVSSellingAJunkCar();
        scrappingACarWithPullAPart();
        tiredOfBandAidCarRepairs();
        whatsYourJunkCarWorth();
        whenToSellYourOldCar();
        whoBuysWreckedOrTotaledCars();
        canISellMyCarAtAuction();
    }

    private void reviewsTitleCheck(WebDriver driver1) {
        goToSellTipsPage(driver1);
        try {
            actualTitle = driver.getTitle();
            System.out.println("Selling Tips Title Page Check");
            System.out.println("Expected:  Selling Tips");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Selling Tips", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Selling Tips link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void reviewsGetAQuoteForm() throws InterruptedException {
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
        quoteFormInputField.get(4).sendKeys("Sell Tips Page");
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
        Thread.sleep(2000);
        goToSellTipsPage(driver);
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
        goToSellTipsPage(driver);
    }

    private void FordExplorerTransmissionProblems(){
        System.out.println("Starting Blog Pages Tests...");
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(0).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("2002 Ford Explorer Transmission Problems? Sell to Pull-A-Part", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "2002 Ford Explorer Transmission Problems? link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void hondaAccordTransmissionProblems(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(1).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Selling a 2003 Honda Accord with Transmission Problems", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "2003 Honda Accord Transmission Problems link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void waysToTellWhenToSellYourCar(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(2).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("5 Ways to Tell When to Sell Your Car", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "5 Ways to Tell When to Sell Your Car link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void canISellMyCarWithoutATitle(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(3).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("No Title? How to Sell a Car Without a Title at Pull-A-Part", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Can I Sell My Car Without a Title? link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void dodgeIntrepidProblems(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(4).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Dodge Intrepid Problems: Solve Intrepid Issues at Pull-A-Part", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Dodge Intrepid Problems? link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void howLongShouldYouKeepACar(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(5).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("How Long Should You Keep a Car: It Depends on the Model", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "How Long Should You Keep a Car link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void howToGetTheMostMoneyForJunkCars(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(6).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Where to Junk or Scrap Your Car for the Most Money", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "How to Get the Most Money for Junk Cars link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void partingOutVSSellingAJunkCar(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(7).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Parting Out a Car Vs. Selling a Junk Car: How to Make the Right Choice", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Parting Out vs. Selling a Junk Car link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void scrappingACarWithPullAPart(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(8).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Scrapping a Car: How to Sell Junk Salvage Cars at Pull-A-Part", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Scrapping a car with Pull-A-Part link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void tiredOfBandAidCarRepairs(){
        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(9).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Tired of Band-Aid Car Repairs", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Tired of Band-Aid Car Repairs? link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void whatsYourJunkCarWorth(){
        List<WebElement> buttonScrollToPoint = driver.findElements(By.cssSelector(".selling-tips a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonScrollToPoint.get(9));

        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(10).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Junk Car Worth: How Much Can You Get for Your Junk Car?", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "What's Your Junk Car Worth? link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void whenToSellYourOldCar(){
        List<WebElement> buttonScrollToPoint = driver.findElements(By.cssSelector(".selling-tips a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonScrollToPoint.get(11));

        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(11).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("Selling Old Cars: When to Sell Your Old Car to Pull-A-Part", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "When to Sell Your Old Car link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void whoBuysWreckedOrTotaledCars(){
        List<WebElement> buttonScrollToPoint = driver.findElements(By.cssSelector(".selling-tips a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonScrollToPoint.get(12));

        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(12).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("How to Sell Damaged, Wrecked or Totaled Cars to Pull-A-Part", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Who Buys Wrecked or Totaled Cars? link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
    }

    private void canISellMyCarAtAuction(){
        List<WebElement> buttonScrollToPoint = driver.findElements(By.cssSelector(".selling-tips a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonScrollToPoint.get(13));

        List<WebElement> readButton = driver.findElements(By.cssSelector(".selling-tips a"));
        readButton.get(13).click();
        try {
            actualTitle = driver.getTitle();
            assertEquals("How to Sell My Junk Car at an Auto Auction by Pull-A-Part", actualTitle);
            System.out.println("Link Verified.");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Can I Sell My Car at Auction link not working, please check the website." + ANSI_RESET);
        }
        goToSellTipsPage(driver);
        System.out.println("Selling Tips Blog Pages Tests Finished");
        System.out.println("===================================================================================");
    }

    private void goToSellTipsPage(WebDriver driver1) {
        driver = driver1;
        List<WebElement> autoParts = driver.findElements(By.cssSelector(".nav a"));
        Actions action = new Actions(driver);
        action.moveToElement(autoParts.get(44)).moveToElement(autoParts.get(49)).click().build().perform();
    }
}
