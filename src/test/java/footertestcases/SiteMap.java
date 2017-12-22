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
    }

    private void goToSiteMapPage(WebDriver driver1){
        driver = driver1;

        WebElement siteMapLink = (WebElement) driver.findElements(By.className(".footer-nav a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", siteMapLink);
        siteMapLink.click();
    }
}
