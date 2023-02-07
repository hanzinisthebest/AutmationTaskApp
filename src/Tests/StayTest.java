package Tests;

import Pages.BasePage;
import org.testng.annotations.Test;

public class StayTest extends TestLevelTest{
    @Test
    public void stayingTest(){
        loginAs("admin","admin");
        BasePage basePage = new BasePage(driver,wait);
        basePage.validateHomePage();
        basePage.stay();
    }
}
