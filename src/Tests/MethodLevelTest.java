package Tests;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MethodLevelTest extends BaseTest{
    @Override
    @BeforeMethod
    public void initialize(ITestContext iTestContext){
        super.initialize(iTestContext);
    }
    @Override
    @AfterMethod
    public void terminate(){
        super.terminate();
    }
}
