package footertestcases;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SocialMediaLinks {

    private boolean debug = false;
    private WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void socialMediaLinksTest(WebDriver driver1) throws InterruptedException {
        footerFaceBookLink(driver1);
        footerTwitterLink(driver1);
        footerInstagramLink(driver1);
        footerYouTubeLink(driver1);
    }

    private void footerFaceBookLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;

        WebElement facebookScrollToPoint = driver.findElement(By.cssSelector(".footer-social"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", facebookScrollToPoint);
        List<WebElement> facebookLink = driver.findElements(By.cssSelector(".footer-social i"));
        facebookLink.get(0).click();

        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Thread.sleep(2000);
        try {
            actualTitle = driver.getTitle();
            System.out.println("FaceBook link in the Footer");
            System.out.println("Expected:  Pull-A-Part - Home | Facebook");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part - Home | Facebook", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "FaceBook link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

    private void footerTwitterLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;

        WebElement twitterScrollToPoint = driver.findElement(By.cssSelector(".footer-social"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", twitterScrollToPoint);
        List<WebElement> twitterLink = driver.findElements(By.cssSelector(".footer-social i"));
        twitterLink.get(1).click();

        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Thread.sleep(2000);
        try {
            actualTitle = driver.getTitle();
            System.out.println("Twitter link in the Footer");
            System.out.println("Expected:  Pull-A-Part (@PullAPartAuto) | Twitter");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part (@PullAPartAuto) | Twitter", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Twitter link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

    private void footerInstagramLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;

        WebElement instagramScrollToPoint = driver.findElement(By.cssSelector(".footer-social"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", instagramScrollToPoint);
        List<WebElement> instagramLink = driver.findElements(By.cssSelector(".footer-social i"));
        instagramLink.get(2).click();

        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Thread.sleep(2000);
        try {
            actualTitle = driver.getTitle();
            System.out.println("Instagram link in the Footer");
            System.out.println("Expected:  Pull-A-Part (@pullapartauto) • Instagram photos and videos");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part (@pullapartauto) • Instagram photos and videos", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Instagram link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

    private void footerYouTubeLink(WebDriver driver1) throws InterruptedException {
        driver = driver1;

        WebElement youtubeScrollToPoint = driver.findElement(By.cssSelector(".footer-social"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", youtubeScrollToPoint);
        List<WebElement> youtubeLink = driver.findElements(By.cssSelector(".footer-social i"));
        youtubeLink.get(3).click();

        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Thread.sleep(2000);
        try {
            actualTitle = driver.getTitle();
            System.out.println("YouTube link in the Footer");
            System.out.println("Expected:  Pull-A-Part - YouTube - YouTube");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Pull-A-Part - YouTube - YouTube", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "YouTube link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }
}
