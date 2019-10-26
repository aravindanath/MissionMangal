package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertElement extends ExampleBFAFClass{
	
	@Test
	public void assertElement() throws InterruptedException {
		System.out.println("Starting...");
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("(//input[@name='btnK' and @type='submit'])[2]"));
		
		Assert.assertTrue(btn.isSelected(), "Search button is not present!");
		
		driver.findElement(By.name("q")).sendKeys("Selenium jobs..");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@value,'Feeling')])[1]")).click();
		
		System.out.println("Ending....");
		
	}

	
	
	@Test
	public void assertElement1() throws InterruptedException {
		System.out.println("Starting...");
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("(//input[@name='btnK' and @type='submit'])[2]"));
		
		SoftAssert sf =  new SoftAssert();
		
		sf.assertTrue(btn.isSelected(), "Search button is not present!");
		
		driver.findElement(By.name("q")).sendKeys("Selenium jobs..");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@value,'Feeling')])[1]")).click();
		
		System.out.println("Ending....");
		sf.assertAll();
	}
}
