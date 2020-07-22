package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudGoogleSearchResultPage extends Page {

    public CloudGoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "")
    WebElement element;

    @Override
    public CloudGoogleSearchResultPage openPage() {
        throw new UnsupportedOperationException
                ("That method does not make any sense on page with just created paste!!!");
    }
}