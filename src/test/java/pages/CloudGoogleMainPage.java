package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudGoogleMainPage extends Page {

    public static final String HOMEPAGE_URL = "https://cloud.google.com/";

    public CloudGoogleMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "")
    WebElement element;

    @Override
    public CloudGoogleMainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
}