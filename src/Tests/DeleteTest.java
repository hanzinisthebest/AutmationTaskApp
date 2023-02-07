package Tests;

import Pages.BasePage;
import org.testng.annotations.Test;

public class DeleteTest extends TestLevelTest {
    @Test
    public void eraseTest(){
        loginAs("admin","admin");
        new BasePage(driver,wait).eraseMisson();
    }
}
