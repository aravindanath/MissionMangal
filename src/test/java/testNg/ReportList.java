package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ReportList  implements ITestListener{


	public void onTestStart(ITestResult result) {

		Reporter.log("Test on start " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test on success  " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("Test on failure " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test on skip " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("Test on failure " + result.getStatus());
	}

	public void onStart(ITestContext context) {
		Reporter.log("Test on start " + context.getName());
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Test on finish " + context.getName());
	}


}
