package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByID extends LaunchChrome{
	
	@Test
	public void byID() {
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Smart Watch",Keys.ENTER);
		
		
	}
	

	 

}
