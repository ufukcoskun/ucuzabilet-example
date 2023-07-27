package Pages;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Base {

    //Variables
    public static WebDriver driver;
    public static WebDriverWait wait;

    //Methods
    public void waitVisibility(By elementBy) {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void waitForMe(){
        wait = new WebDriverWait(driver, 2);
    }

    @BeforeClass
    public static void setUp () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown () {
        driver.quit();
    }
}
