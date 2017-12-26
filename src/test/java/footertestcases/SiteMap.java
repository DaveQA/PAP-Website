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

    public void sitMapMainTest(WebDriver driver1) throws InterruptedException {
        clickAllLinksOnSiteMapPage(driver1);
    }

    private void clickAllLinksOnSiteMapPage(WebDriver driver1) throws InterruptedException {
        goToSiteMapPage(driver1);
        String[] links = null;
        int linksCount = 0;

        List<WebElement> linkSize = driver.findElements(By.cssSelector(".sitemap-section a"));
        linksCount = linkSize.size();
//        System.out.println("Total number of links on the site map: "+linksCount);
        links= new String[linksCount];
//        System.out.println("List of links Available: ");

        for(int i=0;i<linksCount;i++)
        {
            links[i] = linkSize.get(i).getAttribute("href");
//            System.out.println(linksize.get(i).getAttribute("href"));
        }
        System.out.println("===================================================================================");
        System.out.println("Checking site for testing data...");
        for(int i=0;i<linksCount;i++)
        {
            driver.navigate().to(links[i]);
            Thread.sleep(1000);
            if(driver.getPageSource().contains("TEST") ||driver.getPageSource().contains(" test ")){
                System.out.println(ANSI_RED + "Page contains test data, please check the site" + ANSI_RESET);
                System.out.println(ANSI_RED + driver.getCurrentUrl() + ANSI_RESET);
            }
        }
        System.out.println("Finished checking all links on the site map page.");
        System.out.println("===================================================================================");
    }

    private void goToSiteMapPage(WebDriver driver1){
        driver = driver1;
        List<WebElement> scrollToPoint = driver.findElements(By.cssSelector(".footer-nav a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToPoint.get(8));
        scrollToPoint.get(8).click();
    }
}