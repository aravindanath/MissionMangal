package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadLess {
	WebDriver driver;
	@BeforeTest
	public void launchbrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver(ops);
		
	}
	
	@Test
	public void openAmazon() {
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
