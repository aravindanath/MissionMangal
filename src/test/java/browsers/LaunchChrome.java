package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	protected WebDriver driver;

	@BeforeClass
	public void launchbrowser() {
		ChromeOptions ops =  new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(ops);

	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
