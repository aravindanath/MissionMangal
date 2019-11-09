package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByName extends LaunchChrome {
	
	
	@Test
	public void byName() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Appium jobs",Keys.ENTER);
		Thread.sleep(2000);
	}

}
