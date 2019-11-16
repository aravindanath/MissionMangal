package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByXpathRelative extends LaunchChrome{
	
	@Test
	public void xpath() {
		
		driver.get("https://www.google.com");
		//html/body/div/div[4]/form/div[2]/div/div/div/div[2]/input
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium 4" , Keys.ENTER);
		
	}

}
