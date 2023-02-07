package Tests;

import Pages.AddPage;
import Pages.BasePage;
import org.testng.annotations.Test;

public class addTest extends TestLevelTest{
    @Test
    public void add(){
        loginAs("admin","admin");
        new BasePage(driver,wait).goToAddMission();
        AddPage addPage = new AddPage(driver,wait);
        addPage.chooseMisson(3);
        addPage.chooseDay(4);
        addPage.chooseSolderMethod(3);
        addPage.addComment();
        addPage.clickConfirm();
        addPage.validateAddMisson();
    }
}
