package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    static {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/DELL/Desktop/Drivers/chromedriver.exe");
    }

    protected WebDriver driver;
    protected WebDriverWait wait;


    public void initialize(ITestContext iTestContext) {
        driver = new ChromeDriver();
        Duration duration = Duration.ofSeconds(10);
        wait = new WebDriverWait(driver, duration);

        final String PATH = "http://localhost/";


        driver.get(PATH);
        driver.manage().window().maximize();
        iTestContext.setAttribute("driver", driver);
    }


    public void terminate() {
        driver.quit();
    }

    public void loginAs(String username, String password) {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        loginPage.clickOnBtn();
    }

}