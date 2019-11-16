package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class SeleniumBuiltMethods extends LaunchChrome{
	
	
	@Test
	public void builtins() {
		
		// get method will open URL
		driver.get("https://www.google.com");
		

		
		//getTitle will get the page title
		String title =  driver.getTitle();
		System.out.println("Page title "+title);
 
		driver.findElement(By.name("q")).sendKeys("Boston city",Keys.ENTER);
		String url = driver.getCurrentUrl();
		System.out.println("Current url: "+url);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
	}
	
	

}
