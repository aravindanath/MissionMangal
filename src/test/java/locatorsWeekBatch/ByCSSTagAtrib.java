package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByCSSTagAtrib  extends LaunchChrome{
	
	@Test
	public void cssId() {
		
		driver.get("https://www.icicibank.com");
		
		/**
		 * tagname[attibute='value']
		 */
		driver.findElement(By.cssSelector("span[class='pl-login-ornage-box']")).click();
	//	driver.findElement(By.xpath("//span[@class='pl-login-ornage-box']")).click();
	//	driver.findElement(By.className("pl-login-ornage-box")).click();
		
	}

}
