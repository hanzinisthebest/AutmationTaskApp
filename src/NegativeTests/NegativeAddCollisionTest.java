package NegativeTests;

import Pages.AddPage;
import Pages.BasePage;
import Tests.TestLevelTest;
import org.testng.annotations.Test;

public class NegativeAddCollisionTest extends TestLevelTest {
    @Test
    public void collision(){
        loginAs("admin","admin");
        BasePage basePage = new BasePage(driver,wait);
        AddPage addPage = new AddPage(driver,wait);

        basePage.goToAddMission();
        addPage.chooseMisson(0);
        addPage.chooseDay(0);
        addPage.chooseSolderMethod(0);
        addPage.addComment();
        addPage.clickConfirm();
        addPage.validateAddMisson();
        basePage.goToAddMission();
        addPage.chooseMisson(0);
        addPage.chooseDay(0);
        addPage.chooseSolderMethod(0);
        addPage.addComment();
        addPage.clickConfirm();
        addPage.validateCollision();
    }
}
