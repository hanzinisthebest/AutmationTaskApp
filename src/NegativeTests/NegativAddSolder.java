package NegativeTests;

import Pages.AddPage;
import Pages.BasePage;
import Tests.TestLevelTest;
import org.testng.annotations.Test;

public class NegativAddSolder extends TestLevelTest {
    @Test
    public void solder() {
        loginAs("admin", "admin");
        new BasePage(driver, wait).goToAddMission();
        AddPage addPage = new AddPage(driver, wait);
        addPage.chooseMissonRandom();
        addPage.chooseDayRanndom();
        addPage.addComment();
        addPage.clickConfirm();
        addPage.validateAddPage();
    }
}
