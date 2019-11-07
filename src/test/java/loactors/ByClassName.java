package loactors;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByClassName extends LaunchChrome {
	
	@Test
	public void byClassName() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("pl-login-ornage-box")).click();
	}
	

}
