package Tests;

import Pages.BasePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class logOutTest extends TestLevelTest {
    @Test
    public void logOut(){
        loginAs("admin","admin");
        BasePage basePage = new BasePage(driver,wait);
        basePage.validateHomePage();
        basePage.logOut();
    }
}
