package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageObject{
    @FindBy(id = "Username")
    WebElement userName;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(className = "css-11zy16w")
    WebElement enterBtn;

    @FindBy(className = "css-1q9segi")
    WebElement massage;
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //Methods

    public void setUserName(String userNameToPut){
        wait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys(userNameToPut);
    }

    public void setPassword(String passwordToPut) {
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(passwordToPut);
    }
    public void clickOnBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(enterBtn)).click();
    }

    public void validateLogin(){
        wait.until(ExpectedConditions.visibilityOf(massage));
        System.out.println(massage.getText());
    }

    public void validateNegativeLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(userName));
        System.out.println("yes");
    }

}
