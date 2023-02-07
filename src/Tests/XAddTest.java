package Tests;

import Pages.AddPage;
import Pages.BasePage;
import org.testng.annotations.Test;

public class XAddTest extends TestLevelTest{
    @Test
    public void X(){
        loginAs("admin","admin");
        new BasePage(driver,wait).goToAddMission();
        AddPage addPage = new AddPage(driver,wait);
        addPage.chooseMissonRandom();
        addPage.chooseDayRanndom();
        addPage.chooseSolderRandom();
        addPage.addComment();
        addPage.clickX();
    }
}
