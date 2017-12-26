package findastoretestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FindAStoreSearch {

    private boolean debug = false;
    private WebDriver driver;
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_GREEN = "\u001B[32m";
    private static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void findAStoreMainTest(WebDriver driver1) throws InterruptedException {
        locationRangeSearch(driver1);
        locationRangeSearchNoResults();
    }

    private void locationRangeSearch(WebDriver driver1) {
        driver = driver1;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        findAStoreNavLink.get(4).click();

        driver.findElement(By.cssSelector(".row .input")).click();
        driver.findElement(By.cssSelector(".row .input")).sendKeys("30360");
        List<WebElement> goButton = driver.findElements(By.cssSelector(".button"));
        wait.until(ExpectedConditions.elementToBeClickable(goButton.get(8)));
        goButton.get(8).click();

        if (driver.findElements(By.className("padding-10")).size() != 0) {
            System.out.println("Find A Store Search completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println("Find A Store search did not finish, please check the website.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void locationRangeSearchNoResults() {
        List<WebElement> findAStoreNavLink = driver.findElements(By.cssSelector(".nav > div"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        findAStoreNavLink.get(4).click();

        driver.findElement(By.cssSelector(".row .input")).click();
        driver.findElement(By.cssSelector(".row .input")).sendKeys("59001");

        List<WebElement> goButton = driver.findElements(By.cssSelector(".button"));
        wait.until(ExpectedConditions.elementToBeClickable(goButton.get(8)));

        goButton.get(8).click();
        List<WebElement> noLocationText = driver.findElements(By.cssSelector(".h6"));

        if (noLocationText.get(2).getAttribute("innerHTML").equals("No locations found.")) {
            System.out.println("Out of range search zip code search completed");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } else {
            System.out.println("Find A Store search did not finish, please check the website.");
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }
}
