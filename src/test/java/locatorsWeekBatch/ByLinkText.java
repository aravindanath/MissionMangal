package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByLinkText extends LaunchChrome {
	
	
	@Test
	public void byLink() throws InterruptedException {
		driver.get("https://www.google.com");
//		driver.get("file:///Users/aravindanathdm/Desktop/demo.html");
//		driver.findElement(By.linkText("Google")).click();
		driver.findElement(By.linkText("हिन्दी")).click();
		Thread.sleep(2500);
		driver.findElement(By.name("q")).sendKeys("News",Keys.ENTER);
	}

}
