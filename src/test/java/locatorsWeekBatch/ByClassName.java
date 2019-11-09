package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByClassName extends LaunchChrome {
	
	
	@Test
	public void byName() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.className("pl-login-ornage-box")).click();
		Thread.sleep(2000);
	}

}
