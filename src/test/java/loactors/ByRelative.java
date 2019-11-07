package loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByRelative extends LaunchChrome {
	
	@Test
	public void byClassName() throws InterruptedException {
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		/**
		 *  //TAGNAME[@Attribute="value"]
		 *  //input[@name='q']
		 *  /html/body/div/div[4]/form/div[2]/div/div/div/div[2]/input
		 */
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium jobs",Keys.ENTER);
		
		//input[@type='text' and @name='firstname' or @id='u_4_b' and @placeholder='First name']
	}
	

}
