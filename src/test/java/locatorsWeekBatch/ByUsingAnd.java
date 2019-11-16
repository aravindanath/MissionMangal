package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByUsingAnd extends LaunchChrome{
	
	@Test
	public void xpath() throws InterruptedException {
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname' and @id='u_0_m']")).sendKeys("Muni");
	}
}
