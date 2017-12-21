package usedcarstestcases;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class UsedCar {
//    private boolean debug = false;
    private WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";
    private String actualTitle;

    public void usedCarMainTest(WebDriver driver1) throws InterruptedException {
        usedCarSearchWithResults(driver1);
        usedCarSearchWithOutResults();
        akronUsedCarLinkTitleCheck();
        atlantaEastUsedCarLinkTitleCheck();
        atlantaSouthUsedCarLinkTitleCheck();
        augustaUsedCarLinkTitleCheck();
        batonRougeUsedCarLinkTitleCheck();
        birminghamUsedCarLinkTitleCheck();
        cantonUsedCarLinkTitleCheck();
        clevelandWestUsedCarLinkTitleCheck();
        columbiaUsedCarLinkTitleCheck();
        corpusChristiUsedCarLinkTitleCheck();
        elPasoUsedCarLinkTitleCheck();
        jacksonUsedCarLinkTitleCheck();
        knoxvilleUsedCarLinkTitleCheck();
        lafayetteUsedCarLinkTitleCheck();
        louisvilleUsedCarLinkTitleCheck();
        memphisUsedCarLinkTitleCheck();
        mobileUsedCarLinkTitleCheck();
        montgomeryUsedCarLinkTitleCheck();
        nashvilleUsedCarLinkTitleCheck();
        newOrleansUsedCarLinkTitleCheck();
        tucsonUsedCarLinkTitleCheck();
        winstonSalemUsedCarLinkTitleCheck();
    }

    private void usedCarSearchWithResults(WebDriver driver1) throws InterruptedException {
        driver = driver1;
        List<WebElement> usedCarNavLink = driver.findElements(By.cssSelector(".nav > div"));
        usedCarNavLink.get(6).click();

        List<WebElement> zipCodeBox = driver.findElements(By.cssSelector(".red-box input"));
        zipCodeBox.get(0).click();
        zipCodeBox.get(0).sendKeys("30360");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".red-box .button"))));
        driver.findElement(By.cssSelector(".red-box .button")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        List<WebElement> resultsBlock = driver.findElements(By.cssSelector(".cell-spacer-text"));
        if (resultsBlock.size() > 0) {
            System.out.println("Used Car Store Search completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Used Car Store Search did not finish, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void usedCarSearchWithOutResults() throws InterruptedException {
        List<WebElement> usedCarNavLink = driver.findElements(By.cssSelector(".nav > div"));
        usedCarNavLink.get(6).click();

        List<WebElement> zipCodeBox = driver.findElements(By.cssSelector(".red-box input"));
        zipCodeBox.get(0).click();
        zipCodeBox.get(0).sendKeys("59001");

        List<WebElement> submitButton = driver.findElements(By.cssSelector(".button"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".red-box .button"))));
        submitButton.get(8).click();
        Thread.sleep(1000);

        List<WebElement> resultsBlock = driver.findElements(By.cssSelector(".cell-spacer-text"));
        List<WebElement> noResultsBlockMessage = driver.findElements(By.cssSelector("h2"));
        if (resultsBlock.size() <= 0 || noResultsBlockMessage.get(0).isDisplayed()) {
            System.out.println("Used Car Store Out of Area Search completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Used Car Store Search did not finish, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private void akronUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(0).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Akron Used Car Link");
            System.out.println("Expected:  Akron Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Akron Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Akron Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void atlantaEastUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(1).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta East Used Car Link");
            System.out.println("Expected:  Atlanta East Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Atlanta East Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta East Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void atlantaSouthUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(2).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Atlanta South Used Car Link");
            System.out.println("Expected:  Atlanta South Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Atlanta South Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Atlanta South Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void augustaUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(3).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Augusta Used Car Link");
            System.out.println("Expected:  Augusta Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Augusta Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Augusta Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void batonRougeUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(4).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Baton Rouge Used Car Link");
            System.out.println("Expected:  Baton Rouge Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Baton Rouge Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Baton Rouge Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void birminghamUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(5).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Birmingham Used Car Link");
            System.out.println("Expected:  Birmingham Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Birmingham Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Birmingham Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void cantonUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(6).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Canton Used Car Link");
            System.out.println("Expected:  Canton Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Canton Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Canton Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void clevelandWestUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(7).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Cleveland West Used Car Link");
            System.out.println("Expected:  Cleveland West Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cleveland West Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Cleveland West Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void columbiaUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(8).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Columbia Used Car Link");
            System.out.println("Expected:  Columbia Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Columbia Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Columbia Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void corpusChristiUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(9).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Corpus Christi Used Car Link");
            System.out.println("Expected:  Corpus Christi Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Corpus Christi Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Corpus Christi Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void elPasoUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(10).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("El Paso Used Car Link");
            System.out.println("Expected:  El Paso Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("El Paso Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "El Paso Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void jacksonUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(11).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Jackson Used Car Link");
            System.out.println("Expected:  Jackson Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Jackson Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Jackson Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void knoxvilleUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(12).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Knoxville Used Car Link");
            System.out.println("Expected:  Knoxville Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Knoxville Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Knoxville Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void lafayetteUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(13).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Lafayette Used Car Link");
            System.out.println("Expected:  Lafayette Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Lafayette Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Lafayette Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void louisvilleUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(14).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Louisville Used Car Link");
            System.out.println("Expected:  Louisville Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Louisville Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Louisville Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void memphisUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(15).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Memphis Used Car Link");
            System.out.println("Expected:  Memphis Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Memphis Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Memphis Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void mobileUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(16).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Mobile Used Car Link");
            System.out.println("Expected:  Mobile Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Mobile Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Mobile Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void montgomeryUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(17).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Montgomery Used Car Link");
            System.out.println("Expected:  Mobile Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Montgomery Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Montgomery Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void nashvilleUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(18).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Nashville Used Car Link");
            System.out.println("Expected:  Nashville Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Nashville Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Nashville Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void newOrleansUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(19).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("New Orleans Used Car Link");
            System.out.println("Expected:  New Orleans Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("New Orleans Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "New Orleans Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void tucsonUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(20).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Tucson Used Car Link");
            System.out.println("Expected:  Tucson Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Tucson Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Tucson Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void winstonSalemUsedCarLinkTitleCheck(){
        scrollToPoint();

        List<WebElement> usedCarPageLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        usedCarPageLink.get(21).click();

        try {
            actualTitle = driver.getTitle();
            System.out.println("Winston-Salem Used Car Link");
            System.out.println("Expected:  Winston-Salem Used Cars");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Winston-Salem Used Cars", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Winston-Salem Used Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------------");
        }
        returnToUsedCarLandingPage();
    }

    private void scrollToPoint(){
        WebElement scrollToPointUsedCarLocationPagesLinks = driver.findElement(By.cssSelector(".bottom-links.padding-10"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPointUsedCarLocationPagesLinks);
    }

    private void returnToUsedCarLandingPage(){
        List<WebElement> usedCarNavLink = driver.findElements(By.cssSelector(".nav > div"));
        usedCarNavLink.get(6).click();
    }
}
