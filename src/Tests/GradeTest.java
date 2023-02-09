package Tests;

import Pages.BasePage;
import org.testng.annotations.Test;

public class GradeTest  extends TestLevelTest{
    @Test
    public void watchGrade(){
        loginAs("admin","admin");
        BasePage basePage = new BasePage(driver,wait);
        basePage.goTORate();
        basePage.validateRate();
    }
}
