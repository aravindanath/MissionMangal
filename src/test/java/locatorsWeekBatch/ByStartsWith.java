package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByStartsWith extends LaunchChrome {
	
	
	@Test
	public void startswith() {
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[starts-with(@class,'gLF')]")).sendKeys("Selenium conf 2020",Keys.ENTER);
	}

}
