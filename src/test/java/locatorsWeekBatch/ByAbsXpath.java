package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByAbsXpath  extends LaunchChrome{
	
	
	@Test
	public void byPLink() throws InterruptedException {
		driver.get("https://www.google.com");
driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div/div/div[2]/input")).sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2500);
		
		 //TagName[@Attribue="Value"]
		//input[@name='q']
	}
}
