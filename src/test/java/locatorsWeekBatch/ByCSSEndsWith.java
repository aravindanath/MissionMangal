package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByCSSEndsWith  extends LaunchChrome{
	
	@Test
	public void cssContains() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		/**
		 * $ contains in using CSS
		 * TagName[Attribute$='value']
		 */
		driver.findElement(By.cssSelector("input[class$='fi']")).sendKeys("Selenium jobs",Keys.ENTER);
	}

}
