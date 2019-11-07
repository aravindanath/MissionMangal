package loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByUsingAndOR extends LaunchChrome {
	
	@Test
	public void andOR() {
		
		driver.get("https://www.facebook.com/");
		
		try {
			WebElement crtNewAc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
			if(crtNewAc.isDisplayed()) {
				crtNewAc.click();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname' or id='u_0_m']")).sendKeys("teju");
		
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("sharma");
	}

}
