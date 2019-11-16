package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByCSSID  extends LaunchChrome{
	
	@Test
	public void cssId() {
		
		driver.get("https://www.amazon.com");
		
		/**
		 * # is for ID in CSS
		 */
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone 11 pro", Keys.ENTER);
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11 pro");
	//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 11 pro");
		
	}

}
