package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebDriverManagerFireFox {
	
	WebDriver driver;
	@BeforeTest
	public void launchbrowser() {
		
		WebDriverManager.firefoxdriver().setup();
		driver =  new FirefoxDriver();
		
	}
	
	@Test
	public void openAmazon() {
		driver.get("https://www.amazon.com");
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
