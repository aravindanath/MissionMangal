package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LaunchingFireFox {
	WebDriver driver;
	@BeforeTest
	public void openChrome() {
		/**
		 * For win 		System.getProperty("user.dir")+"\\Driver\\chromedriver.exe"
		 * 
		 */
		String path = "/Users/aravindanathdm/Documents/Jars/drivers/geckodriver";
		System.setProperty("webdriver.gecko.driver", path);
		driver =  new FirefoxDriver();

		
	}
	
	@Test
	public void amazon() {
		
		driver.get("https://www.amazon.in");
		
		
	}
	
	
	@AfterTest
	public void close() {
		
		driver.close();
	}

}



