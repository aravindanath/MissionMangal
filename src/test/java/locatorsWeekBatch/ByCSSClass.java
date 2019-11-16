package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByCSSClass  extends LaunchChrome{
	
	@Test
	public void cssId() {
		
		driver.get("https://www.icicibank.com");
		
		/**
		 * . is for className in CSS
		 */
		driver.findElement(By.cssSelector(".pl-login-ornage-box")).click();
	//	driver.findElement(By.xpath("//span[@class='pl-login-ornage-box']")).click();
	//	driver.findElement(By.className("pl-login-ornage-box")).click();
		
	}

}
