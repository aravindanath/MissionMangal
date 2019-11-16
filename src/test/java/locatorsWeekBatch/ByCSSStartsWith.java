package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByCSSStartsWith  extends LaunchChrome{
	
	@Test
	public void cssId() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		/**
		 * ^ starts with
		 * TagName[Attribute^='value']
		 */
		driver.findElement(By.cssSelector("input[class^='gLFy']")).sendKeys("Selenium jobs",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[starts-with(@class,'gLFy')]")).sendKeys("Appium jobs",Keys.ENTER);
		
	}

}
