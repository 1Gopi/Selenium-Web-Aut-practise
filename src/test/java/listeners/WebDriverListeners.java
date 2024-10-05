package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;

public class WebDriverListeners extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("I am in onTestFailure method " +
		 * getTestMethodName(result) + " failed");
		 * 
		 * //Get driver from BaseTest and assign to local webdriver variable. Object
		 * testClass = result.getInstance(); WebDriver webDriver = ((BaseTest)
		 * testClass).getDriver();
		 * 
		 * 
		 * //Take base64Screenshot screenshot. String base64Screenshot =
		 * "data:image/png;base64,"+((TakesScreenshot)webDriver).
		 * getScreenshotAs(OutputType.BASE64);
		 * 
		 * //Extentreports log and screenshot operations for failed tests.
		 * ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",
		 * ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
		 */
		
		String Classname = result.getMethod().getMethodName();
		captureScreenshot(Classname);
	}

}
