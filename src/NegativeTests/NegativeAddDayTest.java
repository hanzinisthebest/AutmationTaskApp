package NegativeTests;

import Pages.AddPage;
import Pages.BasePage;
import Tests.TestLevelTest;
import org.testng.annotations.Test;

public class NegativeAddDayTest extends TestLevelTest {
    @Test
    public void day() {
        loginAs("admin", "admin");
        new BasePage(driver, wait).goToAddMission();
        AddPage addPage = new AddPage(driver, wait);
        addPage.chooseMissonRandom();
        addPage.chooseSolderRandom();
        addPage.addComment();
        addPage.clickConfirm();
        addPage.validateAddPage();
    }
}
