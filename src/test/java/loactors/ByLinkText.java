package loactors;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByLinkText extends LaunchChrome {
	
	
	@Test
	public void linktext() throws InterruptedException {
		
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Bangalore",Keys.ENTER);
		
		
		
	}

}
