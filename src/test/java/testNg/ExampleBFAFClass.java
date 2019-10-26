package testNg;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExampleBFAFClass {

	protected static WebDriver driver;

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeClass
	// @BeforeSuite
	public void opnebrowser() {
		// win
		// String winPath = "c:\\driver\\chromedriver.exe";
		// For mac
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/report.html");
		htmlReporter.config().setDocumentTitle("Automation Report for Regression Suite"); // Title of the report
		htmlReporter.config().setReportName("Functional Report"); // name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Env", "Staging");
		extent.setSystemInfo("os", "macOS Mojave 10.14.6");
		extent.setSystemInfo("Tester Name", "ARAVINDA");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("BuildVersion", "v123.22");

		String path = "/Users/aravindanathdm/Documents/Jars/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		System.err.println("Open browser");
	}

	
	
	//@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			
			test.log(Status.FAIL, "Result status: " + result.getStatus());
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
																					// report
			String screenshotPath = getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(screenshotPath);// adding screen shot go report
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Result status: " + result.getStatus());
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Result status: " + result.getStatus());
			test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
		
	}

	@AfterClass
	public void endReport() {
		driver.quit();
		extent.flush();
	}

	public  String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

}
