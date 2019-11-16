package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByTextFunctions extends LaunchChrome {
	
	
	@Test
	public void startswith() {
		
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//label[text()='Email or Phone']"));
		System.out.println("isElement present? "+ele.isDisplayed());
		if(ele.isDisplayed()) {
			System.out.println(ele.getText());
		}
		WebElement ele1 =  driver.findElement(By.xpath("//span[contains(text(),'Create')]"));
		System.out.println(ele1.getText());
		Assert.assertEquals(ele1.getText(), "Create an account","Title mismatch!");
		
	}

}
