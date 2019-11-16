package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByContains extends LaunchChrome{
	
	@Test
	public void xpath() throws InterruptedException {
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in') or contains(text(),'Hello. Sign in') ]")).click();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in') or contains(text(),'Hello. Sign in') ]")).click();
		
	}
}
