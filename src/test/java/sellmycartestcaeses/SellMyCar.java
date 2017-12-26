package sellmycartestcaeses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class SellMyCar {
    public static WebDriver driver;
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_RESET = "\u001B[0m";
    String actualTitle;

    public void sellMyCarMainTest(WebDriver driver1) {
        sellMyCarLandingPage(driver1);
        zipCodeCheck(driver1);
    }

    private void sellMyCarLandingPage(WebDriver driver1) {
        driver = driver1;

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();
        System.out.println("===================================================================================");
        System.out.println("Sell My Car Page Tests");
        System.out.println("===================================================================================");
        System.out.println("===================================================================================");

        try {
            actualTitle = driver.getTitle();
            System.out.println("Auto Parts Link in Nav");
            System.out.println("Expected:  Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part");
            System.out.println("Actual:    " + actualTitle);
            assertEquals("Cash for Junk Cars: Sell Your Junk Car for Cash | Pull-A-Part", actualTitle);
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (AssertionError e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Sell My Car link not verified, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }

    private void zipCodeCheck(WebDriver driver1) {
        driver = driver1;

        driver.findElement(By.cssSelector(".nav > div:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".red-box input")).sendKeys("30360");
        driver.findElement(By.cssSelector(".red-box button")).click();

        try {
            WebElement phoneNumber = driver.findElement(By.cssSelector("h1.title"));
            phoneNumber.isDisplayed();
            System.out.println("Zip Code search finished.");
            System.out.println(ANSI_GREEN + "Test Passed" + ANSI_RESET);
            System.out.println("===================================================================================");
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Test Failed" + ANSI_RESET);
            System.out.println(ANSI_RED + "Zip code look up did not complete, please check the website." + ANSI_RESET);
            System.out.println("===================================================================================");
        }
    }
}
