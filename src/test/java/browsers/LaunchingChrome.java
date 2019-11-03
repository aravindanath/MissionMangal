package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LaunchingChrome {
	WebDriver driver;
	@BeforeTest
	public void openChrome() {
		/**
		 * For win 		System.getProperty("user.dir")+"\\Driver\\chromedriver.exe"
		 * 
		 */
		String path = "/Users/aravindanathdm/Documents/Jars/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		driver =  new ChromeDriver();

		
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



