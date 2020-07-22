package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TenMinutesMainPage extends Page {

    public static final String HOMEPAGE_URL = "https://10minutemail.com/";

    public TenMinutesMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "")
    WebElement element;

    @Override
    public TenMinutesMainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
}
