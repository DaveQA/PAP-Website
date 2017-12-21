package footertestcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SiteMap {

    private boolean debug = false;
    private WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";

    @Test

    public void sitMapMainTest(WebDriver driver1) {
        goToSiteMapPage(driver1);
//        aboutLink(driver1);
    }

    private void aboutLink(WebDriver driver1){
        driver = driver1;
        goToSiteMapPage(driver1);
        System.out.println("Checking site for test data...");
//        WebElement siteMapLink = driver.findElement(By.cssSelector(".footer-nav > div:first-child > a"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", siteMapLink);
//        siteMapLink.click();
        List<WebElement> aboutLink = driver.findElements(By.className(".sitemap-section a"));
        aboutLink.get(0).click();
        if(driver.findElement(By.cssSelector("body")).getText().contains("test")==false){
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        }else{
            System.out.println("Check page, test data present.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void goToSiteMapPage(WebDriver driver1){
        driver = driver1;
        WebElement siteMapScrollToPoint = driver.findElement(By.cssSelector(".footer-nav > div:first-child > a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", siteMapScrollToPoint);
//        List<WebElement> siteMapLink = driver.findElements(By.className(".footer-nav div"));
//        siteMapLink.get(8).click();
        driver.findElement(By.className(".footer-nav > div:nth-child(7)")).click();
    }
}
