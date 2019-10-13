package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ExampleBFAFClass {

	protected WebDriver driver;

	 @BeforeClass
	//@BeforeSuite
	public void opnebrowser() {
		// win
		String winPath = "c:\\driver\\chromedriver.exe";
		// For mac
		String path = "/Users/aravindanathdm/Documents/Jars/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		System.err.println("Open browser");
	}

	 @AfterClass
	// @AfterSuite
	public void close() {
		driver.quit();
		System.err.println("close");
	}

}
