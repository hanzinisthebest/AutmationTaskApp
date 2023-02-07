package Tests;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestLevelTest extends BaseTest {
    @BeforeMethod
    public void initialize(ITestContext iTestContext){
        super.initialize(iTestContext);
    }

    @AfterMethod
    public void terminate(){
        super.terminate();
    }
}
