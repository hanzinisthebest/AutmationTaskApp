package Tests;

import Pages.BasePage;
import org.testng.annotations.Test;

public class MoveInCalnderTest extends TestLevelTest {
    @Test
    public void moving(){
        loginAs("admin","admin");
        BasePage basePage = new BasePage(driver,wait);
        basePage.validateHomePage();
        basePage.goToMounthBefore();
        basePage.goToNextMounth();
        basePage.goToToday();
    }
}
