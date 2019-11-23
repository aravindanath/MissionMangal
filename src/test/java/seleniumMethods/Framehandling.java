package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class Framehandling extends LaunchChrome {
	
	
	@Test
	public void frame() throws InterruptedException {
		
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Frames")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("iFrame")).click();
		
		driver.switchTo().frame("mce_0_ifr");
		Thread.sleep(2000);
		WebElement txt = driver.findElement(By.id("tinymce"));
		txt.clear();
		Thread.sleep(2000);
		txt.sendKeys("Hello all");
	}
	
	@Test
	public void nestedFrame() throws InterruptedException {
		
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
		
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("BrowserConfigurationOptions")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		
		WebElement title= driver.findElement(By.xpath("//h2[text()='Class BrowserConfigurationOptions']"));
		System.out.println(title.getText());
		
		
		
	}

}
