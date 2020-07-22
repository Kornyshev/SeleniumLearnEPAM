package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudGoogleCalculatorPage extends Page {

    public static final String HOMEPAGE_URL = "https://cloud.google.com/products/calculator";

    public CloudGoogleCalculatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "")
    WebElement element;

    public CloudGoogleCalculatorPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
}