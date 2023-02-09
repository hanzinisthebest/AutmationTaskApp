package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class BasePage extends PageObject{
    // Data Members
    @FindBy(tagName = "nav")
    private WebElement navbar;

    @FindBy(className = "css-ppo652")
    WebElement logOutBtn;

    @FindBy(className = "css-1t5cdpz")
    WebElement secLogOutBtn;

    @FindBy(className = "css-1kfa7jk")
    WebElement stayBtn;

    @FindBy(css = "[href='Rating']")
    private WebElement rating;

    @FindBy(css="[href='dateTable']")
    private WebElement missonTable;

    @FindBy(id = "menu-button-:r3:")
    private WebElement chooseMisson;

    @FindBy(className = "css-argit1")
    private WebElement deleteMisson;

    @FindBy(css = ".rbc-btn-group>button")
    private List<WebElement> btnForMoving;

    @FindBy(className = "rbc-toolbar-label")
    private WebElement mounthTitel;

    @FindBy(className = "rbc-event-content")
    private List<WebElement> missions;

    @FindBy(className = "recharts-surface")
    WebElement rateChart;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void validateHomePage(){
        wait.withMessage("Home Page didn't load").
                until(ExpectedConditions.visibilityOf(navbar));
    }

    public void logOut(){
        wait.until(ExpectedConditions.elementToBeClickable(logOutBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(secLogOutBtn)).click();
    }
    public void stay(){
        wait.until(ExpectedConditions.elementToBeClickable(logOutBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(stayBtn)).click();
        wait.withMessage("Stay didnt work").
                until(ExpectedConditions.visibilityOf(navbar));
    }

    public void goToToday(){
        String titel = wait.until(ExpectedConditions.visibilityOf(mounthTitel)).getText();
        wait.until(ExpectedConditions.elementToBeClickable(btnForMoving.get(0))).click();
        Assert.assertNotEquals(titel,btnForMoving.get(0).getText());
    }


    public void goToMounthBefore(){
        String titel = wait.until(ExpectedConditions.visibilityOf(mounthTitel)).getText();
        wait.until(ExpectedConditions.elementToBeClickable(btnForMoving.get(1))).click();
        Assert.assertNotEquals(titel,btnForMoving.get(1).getText());
    }

    public void goToNextMounth(){
        String titel = wait.until(ExpectedConditions.visibilityOf(mounthTitel)).getText();
        wait.until(ExpectedConditions.elementToBeClickable(btnForMoving.get(2))).click();
        Assert.assertNotEquals(titel,btnForMoving.get(2).getText());
    }

    public void goTORate(){
        wait.until(ExpectedConditions.elementToBeClickable(rating)).click();
    }

    public void validateRate(){
        wait.until(ExpectedConditions.visibilityOf(rateChart));
    }

    public void goToAddMission(){
        wait.until(ExpectedConditions.elementToBeClickable(chooseMisson)).click();
    }

    public int getMissonsSize(){
//        if(wait.until(ExpectedConditions.invisibilityOfAllElements(missions))){
//            return 0;
//        }
        return wait.until(ExpectedConditions.visibilityOfAllElements(missions)).size();
    }
    public void eraseMisson(){
        //we depnding that there are missons to erase
        Random rand = new Random();
        int sizeOfList = getMissonsSize();
        int randomIndex = rand.nextInt(sizeOfList);


        missions.get(randomIndex).click();
        wait.until(ExpectedConditions.elementToBeClickable(deleteMisson)).click();
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.className("rbc-event-content"),sizeOfList));
    }

    public void eraseMissonYouChoose(int index){
        //we depnding that there are missons to erase
        int sizeOfList = getMissonsSize();

        missions.get(index).click();
        wait.until(ExpectedConditions.elementToBeClickable(deleteMisson)).click();
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.className("rbc-event-content"),sizeOfList));
    }

}
