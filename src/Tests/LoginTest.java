package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestLevelTest{
    @Test
    public void login(){
        loginAs("admin","admin");
        new LoginPage(driver,wait).validateLogin();
    }
}
