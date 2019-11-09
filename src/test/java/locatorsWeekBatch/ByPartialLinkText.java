package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByPartialLinkText extends LaunchChrome {
	
	
	@Test
	public void byPLink() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.partialLinkText("Ima")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Astana",Keys.ENTER);
		Thread.sleep(2500);
	}

}
