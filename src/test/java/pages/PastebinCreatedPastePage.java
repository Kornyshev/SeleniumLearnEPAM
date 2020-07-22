package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PastebinCreatedPastePage extends Page {

    public PastebinCreatedPastePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h_640")
    WebElement syntaxLink;

    @FindBy(css = "#selectable")
    WebElement codeArea;

    @Override
    public PastebinCreatedPastePage openPage() {
        throw new UnsupportedOperationException
                ("That method does not make any sense on page with just created paste!!!");
    }

    public String syntaxLinkText() {
        new WebDriverWait(driver, WAIT_TIMEOUT)
                .until(ExpectedConditions.visibilityOfElementLocated
                        (By.cssSelector(".h_640")));
        return syntaxLink.getText();
    }

    public String codeAreaText() {
        new WebDriverWait(driver, WAIT_TIMEOUT)
                .until(ExpectedConditions.visibilityOfElementLocated
                        (By.cssSelector("#selectable")));
        return codeArea.getText();
    }
}
