package NegativeTests;

import Pages.AddPage;
import Pages.BasePage;
import Tests.TestLevelTest;
import org.testng.annotations.Test;

public class NegativeAddCommentTest extends TestLevelTest {
    @Test
    public void comment() {
        loginAs("admin", "admin");
        new BasePage(driver, wait).goToAddMission();
        AddPage addPage = new AddPage(driver, wait);
        addPage.chooseMissonRandom();
        addPage.chooseDayRanndom();
        addPage.chooseSolderRandom();
        addPage.clickConfirm();
        addPage.validateAddPage();
    }
}