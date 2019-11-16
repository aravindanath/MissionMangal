package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByCSSContains  extends LaunchChrome{
	
	@Test
	public void cssContains() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		/**
		 * * contains in using CSS
		 * TagName[Attribute*='value']
		 */
		driver.findElement(By.cssSelector("input[class*='gLFy']")).sendKeys("Selenium jobs",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[contains(@class,'gLFy')]")).sendKeys("Appium jobs",Keys.ENTER);
		
	}

}
