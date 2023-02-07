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

public class AddPage extends BasePage{
    //Data Members
    @FindBy(className = "css-i857na")
    private List<WebElement> typeOfMisson;

    @FindBy(name = "next-month")
    private WebElement nextMonthBtn;

    @FindBy(name = "previous-month")
    private WebElement previousMonthBtn;

    @FindBy(css = ".rdp-day:not(.rdp-day_disabled)")
    private List<WebElement> dayToClick;

    @FindBy(css = ".chakra-menu__menu-button.css-i857na")
    private WebElement choseSolder;

    @FindBy(className = "css-1ip5ifq")
    private List<WebElement> soldiers;

    @FindBy(id = "Comment")
    private WebElement comment;

    @FindBy(css = ".css-gmuwbf:nth-child(5)")
    private WebElement nameOfMisson;

    @FindBy(className = "css-17e40sj")
    private WebElement submitBtn;

    @FindBy(css = "footer>.css-i857na")
    private WebElement cancelBtn;

    @FindBy(className = "css-1ik4h6n")
    private WebElement xBtn;

    @FindBy(className = "css-qlig70")
    private WebElement errorMsg;

    @FindBy(className = "css-1kfa7jk")
    private WebElement confirmCollision;

    //depends that we Have one mission at least
    int missonsBefore = getMissonsSize();
    public AddPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void chooseMisson(int indexIfYouWant){
        String typeMisson = wait.until(ExpectedConditions.visibilityOfAllElements(typeOfMisson)).get(indexIfYouWant)
                .getText();

        wait.until(ExpectedConditions.visibilityOfAllElements(typeOfMisson)).get(indexIfYouWant).click();
        wait.until(ExpectedConditions.textToBePresentInElement(nameOfMisson,typeMisson));
    }
    public void chooseMissonRandom(){
        Random rand = new Random();
        int sizeOfList = wait.until(ExpectedConditions.visibilityOfAllElements(typeOfMisson)).size();
        int randomIndex = rand.nextInt(sizeOfList);
        String typeMissonText = wait.until(ExpectedConditions.visibilityOfAllElements(typeOfMisson)).get(randomIndex)
                .getText();

        wait.until(ExpectedConditions.visibilityOfAllElements(typeOfMisson)).get(randomIndex).click();
        wait.until(ExpectedConditions.textToBePresentInElement(nameOfMisson,typeMissonText));
    }

    public void moveFoward(){
        wait.until(ExpectedConditions.elementToBeClickable(nextMonthBtn)).click();
    }
    public void moveBack(){
        wait.until(ExpectedConditions.elementToBeClickable(previousMonthBtn)).click();
    }

    public void chooseDayRanndom(){
        Random rand = new Random();
        int sizeOfList = wait.until(ExpectedConditions.visibilityOfAllElements(dayToClick)).size();
        int randomIndex = rand.nextInt(sizeOfList);

        wait.until(ExpectedConditions.visibilityOfAllElements(dayToClick)).get(randomIndex).click();
    }

    public void chooseDay(int indexIfYouWant){
        wait.until(ExpectedConditions.visibilityOfAllElements(dayToClick)).get(indexIfYouWant).click();
    }

    public void chooseSolderMethod(int indexIfYouWant){
        wait.until(ExpectedConditions.elementToBeClickable(choseSolder)).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(soldiers)).get(indexIfYouWant).click();
        choseSolder.click();
    }

    public void chooseSolderRandom(){
        wait.until(ExpectedConditions.elementToBeClickable(choseSolder)).click();

        Random rand = new Random();
        int sizeOfList = wait.until(ExpectedConditions.visibilityOfAllElements(soldiers)).size();
        int randomIndex = rand.nextInt(sizeOfList);

        soldiers.get(randomIndex).click();
        choseSolder.click();
    }

    public void addComment(){
        wait.until(ExpectedConditions.elementToBeClickable(comment)).sendKeys("something");
    }


    public void clickConfirm(){
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
    }

    public void validateAddMisson(){
        validateHomePage();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("rbc-event-content"),missonsBefore));

    }

    public void clickCancel(){
        wait.until(ExpectedConditions.elementToBeClickable(cancelBtn)).click();
       validateHomePage();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("rbc-event-content"),missonsBefore));
    }

    public void clickX(){
        wait.until(ExpectedConditions.elementToBeClickable(xBtn)).click();
        validateHomePage();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("rbc-event-content"),missonsBefore));
    }

    public void validateCollision(){
        wait.until(ExpectedConditions.visibilityOf(errorMsg));
        wait.until(ExpectedConditions.elementToBeClickable(confirmCollision)).click();
        validateHomePage();
    }

    public void validateAddPage(){
        wait.until(ExpectedConditions.visibilityOf(submitBtn));
    }

}