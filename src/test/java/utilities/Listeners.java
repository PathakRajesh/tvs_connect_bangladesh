package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import testBase.BaseClass;

public class Listeners extends BaseClass implements ITestListener {
	
	ExtentTest test;
	AppiumDriver driver;
	ExtentReports extent= ExtentReportManager.getReporterObject();
	
//	public Listeners(AndroidDriver driver) {
//		super(driver);
//		this.driver=driver;
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}
//	ExtentTest test;
//	AppiumDriver driver;
	
//	ExtentReports extent= ExtentReportManager.getReporterObject();
	
	@Override
	public void onTestStart(ITestResult result) {
		
		 test= extent.createTest(result.getMethod().getMethodName());
	}
	@Override
	
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Test Passed");
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
	
	try
	{
		driver=(AppiumDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	}   catch (Exception e1) {
	    e1.printStackTrace();	
	}
	try
	{
	 test.addScreenCaptureFromPath(getScreenshotspath(result.getMethod().getMethodName(),driver),result.getMethod().getMethodName());
	}catch (Exception e) {
		e.printStackTrace();
	}
} 
	@Override
	public void onTestSkipped(ITestResult result) {
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void onStart(ITestContext context) {
	
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
}
	}




