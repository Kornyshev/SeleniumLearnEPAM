package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PastebinMainPage extends Page {

    private static final String HOMEPAGE_URL = "https://pastebin.com/";

    public PastebinMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".paste_textarea")
    WebElement newPasteField;

    @FindBy(name = "paste_format")
    WebElement syntaxHighlightingList;

    @FindBy(name = "paste_expire_date")
    WebElement expirationPeriod;

    @FindBy(name = "paste_name")
    WebElement pasteNameField;

    @FindBy(name = "submit")
    WebElement createPasteButton;

    @Override
    public PastebinMainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public PastebinMainPage fillPasteField(String code) {
        newPasteField.sendKeys(code);
        return this;
    }

    public PastebinMainPage selectSyntaxHighlighting(String syntax) {
        Select select = new Select(syntaxHighlightingList);
        select.selectByVisibleText(syntax);
        return this;
    }

    public PastebinMainPage selectExpirationPeriod(String expiry) {
        Select select = new Select(expirationPeriod);
        select.selectByVisibleText(expiry);
        return this;
    }

    public PastebinMainPage fillPasteNameField(String name) {
        pasteNameField.sendKeys(name);
        return this;
    }

    public PastebinCreatedPastePage clickOnCreateButton() {
        createPasteButton.click();
        return new PastebinCreatedPastePage(driver);
    }
}