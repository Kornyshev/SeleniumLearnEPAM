package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.PastebinCreatedPastePage;
import pages.PastebinMainPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PastebinTest {

    WebDriver driver;
    PastebinCreatedPastePage createdPastePage;

    @BeforeMethod
    public void settingUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 0, dataProvider = "firstTestCase")
    public void testSimplePasteCreation(String code, String expiry, String name) {
        createdPastePage = new PastebinMainPage(driver)
                .openPage()
                .fillPasteField(code)
                .selectExpirationPeriod(expiry)
                .fillPasteNameField(name)
                .clickOnCreateButton();
        assertEquals(createdPastePage.codeAreaText(), code);
        assertTrue(driver.getTitle().contains(name));
    }

    @Test(priority = 10, dataProvider = "secondTestCase")
    public void testMoreComplexPasteSyntaxLink(String code, String syntax, String expiry, String name) {
        createdPastePage = new PastebinMainPage(driver)
                .openPage()
                .fillPasteField(code)
                .selectSyntaxHighlighting(syntax)
                .selectExpirationPeriod(expiry)
                .fillPasteNameField(name)
                .clickOnCreateButton();
        assertEquals(createdPastePage.syntaxLinkText(), syntax);
        assertEquals(createdPastePage.codeAreaText(), code);
        assertTrue(driver.getTitle().contains(name));
    }

    /*
    @Test(priority = 10, dataProvider = "secondTestCase")
    public void testMoreComplexPasteCodeArea(String code, String syntax, String expiry, String name) {
        assertEquals(createdPastePage.codeAreaText(), code);
    }

    @Test(priority = 10, dataProvider = "secondTestCase")
    public void testMoreComplexPastePageTitle(String code, String syntax, String expiry, String name) {
        assertTrue(driver.getTitle().contains(name));
    }
     */

    @AfterMethod
    public void tearDown() {
        driver.quit();
        driver = null;
    }

    @DataProvider(name = "firstTestCase")
    public Object[][] dataForFirstTestCase() {
        return new Object[][]{
                {"Hello from WebDriver", "10 Minutes", "helloweb"}
        };
    }

    @DataProvider(name = "secondTestCase")
    public Object[][] dataForSecondTestCase() {
        String code =
                "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        return new Object[][]{
                {code, "Bash", "10 Minutes", "ow to gain dominance among developers"}
        };
    }
}