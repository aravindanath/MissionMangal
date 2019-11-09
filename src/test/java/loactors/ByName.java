package loactors;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByName extends LaunchChrome {

	
	@Test
	public void byname() {
		
		driver.get("https://www.google.com");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Hello ");
		searchBox.clear();
		searchBox.sendKeys("Selenium jobs",Keys.ENTER);
		
	}
}
