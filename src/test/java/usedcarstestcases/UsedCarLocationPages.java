package usedcarstestcases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UsedCarLocationPages {
    private WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";
    private String actualTitle;

    public void usedCarLocationPagesMainTest(WebDriver driver1) throws InterruptedException {
        akronUsedCarLocationPageSubNavActive(driver1);
//        akronUsedCarListingPageTitleCheck();
//        visitTheAkronStore();
        letUsReachOutToYouForm();
    }

    private void akronUsedCarLocationPageSubNavActive(WebDriver driver1) {
        driver = driver1;
        List<WebElement> usedCarNavLink = driver.findElements(By.cssSelector(".nav > div"));
        usedCarNavLink.get(6).click();

        scrollToPoint();
        List<WebElement> akronUsedCarLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        akronUsedCarLink.get(0).click();

        List<WebElement> autoPartsLink = driver.findElements(By.cssSelector(".sub-nav a"));
        if (autoPartsLink.get(5).getAttribute("class").contains("active")) {
            System.out.println("Used Car link is active.");
            System.out.println(ANSI_GREEN + "Test Passed." + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Used Car link is not active, please check the website" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void akronUsedCarListingPageTitleCheck(){
        List<WebElement> searchAllCarsButton = driver.findElements(By.cssSelector(".red-box .button"));
        if(searchAllCarsButton.get(1).isDisplayed()){
            searchAllCarsButton.get(1).click();
            try {
                actualTitle = driver.getTitle();
                System.out.println("Akron Used Car Listing Page");
                System.out.println("Expected:  Akron Used Cars Listing");
                System.out.println("Actual:    " + actualTitle);
                assertEquals("Akron Used Cars Listing", actualTitle);
                System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
                System.out.println("===================================================================================");
            } catch (AssertionError e) {
                System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
                System.out.println(ANSI_RED + "Akron Used Car Listing page not verified, please check the website." + ANSI_RESET);
                System.out.println("===================================================================================");
            }
        }else{
            System.out.println("This location does not have any used cars to view");
            System.out.println("===================================================================================");
        }
        returnToUsedCarLandingPage();
    }

    private void visitTheAkronStore() throws InterruptedException {
        scrollToPoint();
        List<WebElement> akronUsedCarLink = driver.findElements(By.cssSelector(".bottom-links.padding-10 a"));
        akronUsedCarLink.get(0).click();

        List<WebElement> visitStoreFormInput = driver.findElements(By.cssSelector(".gray-background .input"));
        visitStoreFormInput.get(0).sendKeys("4473 Tilly Mill Rd, Doraville, GA 30360");

        List<WebElement> getDirectionsButton = driver.findElements(By.cssSelector(".gray-background .button"));
        getDirectionsButton.get(0).click();

        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Thread.sleep(3000);
        try {
            actualTitle = driver.getTitle();
            System.out.println("Google Map Tab Opened");
            System.out.println("Expected:  4473 Tilly Mill Rd, Doraville, GA 30360 to 1250 Kelly Ave, Akron, OH 44306 - Google Maps");
            System.out.println("Actual:    " + actualTitle);
            Assertions.assertEquals("4473 Tilly Mill Rd, Doraville, GA 30360 to 1250 Kelly Ave, Akron, OH 44306 - Google Maps", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Google Map link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

    private void letUsReachOutToYouForm(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement scrollToPointUsedCarLetUsReachOutForm = driver.findElement(By.cssSelector(".used-cars-contact"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPointUsedCarLetUsReachOutForm);

        List<WebElement> usedCarContactFormNameField = driver.findElements(By.cssSelector(".used-cars-contact .input"));
        usedCarContactFormNameField.get(0).sendKeys("QA Test");
        List<WebElement> usedCarContactFormPhoneNumberField = driver.findElements(By.cssSelector(".used-cars-contact .input"));
        usedCarContactFormPhoneNumberField.get(1).sendKeys("5555555555");
        List<WebElement> usedCarContactFormEmailField = driver.findElements(By.cssSelector(".used-cars-contact .input"));
        usedCarContactFormEmailField.get(2).sendKeys("QA@pullapart.com");
        List<WebElement> usedCarContactFormSubmitButton = driver.findElements(By.cssSelector(".used-cars-contact .button"));
        wait.until(ExpectedConditions.elementToBeClickable(usedCarContactFormSubmitButton.get(0)));
        usedCarContactFormSubmitButton.get(0).click();

        List<WebElement> reachOutForm = driver.findElements(By.cssSelector(".used-cars-contact h2"));
        if(reachOutForm.get(1).getText().contains("THANK YOU!")){
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "Please check the QA email for the email" + ANSI_RESET);
        }else{
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Let Us Reach Out form was not completed, please check the website" + ANSI_RESET);
        }
    }

    private void scrollToPoint() {
        WebElement scrollToPointUsedCarLocationPagesLinks = driver.findElement(By.cssSelector(".bottom-links.padding-10"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPointUsedCarLocationPagesLinks);
    }

    private void returnToUsedCarLandingPage() {
        List<WebElement> usedCarNavLink = driver.findElements(By.cssSelector(".nav > div"));
        usedCarNavLink.get(6).click();
    }
}
