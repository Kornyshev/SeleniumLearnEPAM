package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CloudGoogleCalculatorPage;
import pages.TenMinutesMainPage;

public class CloudGoogleTest {

    WebDriver driver;
    CloudGoogleCalculatorPage calculatorPage;
    TenMinutesMainPage tenMinutesMainPage;

    @BeforeMethod
    public void settingUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void testMethod() {

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}