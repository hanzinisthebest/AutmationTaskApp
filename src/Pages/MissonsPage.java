package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MissonsPage extends BasePage{
    @FindBy(linkText = "לילה")
    WebElement nightBtn;

    @FindBy(linkText = "הנפצה")
    WebElement lieMisson;

    @FindBy(linkText = "ניקיון")
    WebElement cleaning;

    @FindBy(linkText = "אבטש")
    WebElement weekMisson;

    public MissonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void chooseNight(){
        wait.until(ExpectedConditions.elementToBeClickable(nightBtn)).click();
    }

    public void chooseLie(){
        wait.until(ExpectedConditions.elementToBeClickable(lieMisson)).click();
    }
    public void chooseClean(){
        wait.until(ExpectedConditions.elementToBeClickable(cleaning)).click();
    }

    public void chooseWeek(){
        wait.until(ExpectedConditions.elementToBeClickable(weekMisson)).click();
    }

}
