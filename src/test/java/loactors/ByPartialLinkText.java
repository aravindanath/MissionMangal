package loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByPartialLinkText extends LaunchChrome {
	
	
	@Test
	public void partiallinktext() throws InterruptedException {
		
		driver.get("https://www.google.com");
		driver.findElement(By.partialLinkText("Ima")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("SFO",Keys.ENTER);
		driver.quit();
		
		
		
	}

}
