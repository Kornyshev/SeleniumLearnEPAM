package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class Page {
    protected static final int WAIT_TIMEOUT = 10;
    protected WebDriver driver;

    public abstract Page openPage();

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}