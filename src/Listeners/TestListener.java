//package Listeners;
//
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.service.ExtentService;
//import com.aventstack.extentreports.service.ExtentTestManager;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import java.io.File;
//import java.sql.DriverManager;
//
//public class TestListener implements ITestListener {
//    @Override
//    public void onStart(ITestContext iTestContext) {
//
//    }
//
//    @Override
//    public void onTestStart(ITestResult iTestResult) {
//        ExtentTestManager.createMethod(iTestResult);
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult iTestResult) {
//        ExtentTestManager.log(iTestResult);
//    }
//
//    @Override
//    public void onTestFailure(ITestResult iTestResult) {
////        test.log(Status.FAIL, "Test Failed");
////        File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
////        String screenshotPath = "C:\\Screenshots\\screenshot.png";
////        try {
////            FileUtils.copyFile(screenshot, new File(screenshotPath));
////            test.addScreenCaptureFromPath(screenshotPath);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        WebDriver driver = (WebDriver)
//                iTestResult.getTestContext().getAttribute("driver");
//
//        String scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//        ExtentTestManager.getTest().log(Status.FAIL,
//                iTestResult.getThrowable().getMessage(),
//                ExtentTestManager.getTest().addScreenCaptureFromBase64String(scrShot).
//                        getModel().getMedia().get(0));
////        MediaModel media = ExtentTestManager.getTest().addScreenCaptureFromBase64String(scrShot).getModel().getMedia();
////        if (media != null && !media.isEmpty()) {
////            ExtentTestManager.getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage(), media.get(0));
////        }
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult iTestResult) {
//        ExtentTestManager.log(iTestResult);
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
//    }
//
//    @Override
//    public void onFinish(ITestContext iTestContext) {
//        ExtentService.getInstance().flush();
//    }
//}
