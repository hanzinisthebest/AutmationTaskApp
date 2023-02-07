package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    // Data Members
    protected WebDriver driver;
    protected WebDriverWait wait;

    // Constructor
    public PageObject(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

        PageFactory.initElements(driver, this);
    }
}

