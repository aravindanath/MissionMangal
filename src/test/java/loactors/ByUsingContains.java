package loactors;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByUsingContains extends LaunchChrome {
	
	@Test
	public void byClassName() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in') or contains(text(),'Hello. Sign in') ]")).click();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in') or contains(text(),'Hello. Sign in') ]")).click();
		Thread.sleep(2000);
	}
	

}
