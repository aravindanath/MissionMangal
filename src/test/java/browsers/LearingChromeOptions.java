package browsers;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearingChromeOptions extends LaunchChrome{
	
	@Test
	public void browserPopup() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		
		driver.findElement(By.className("pl-login-ornage-box")).click();
		Thread.sleep(2000);
		
	}
	
	

}
