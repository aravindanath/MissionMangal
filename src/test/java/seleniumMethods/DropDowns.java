package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class DropDowns extends LaunchChrome {
	
	
	@Test
	public void dropdown() throws InterruptedException {
		
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		WebElement lang = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		lang.sendKeys("ภาษาไทย");
		
		selectByIndex(lang, 20);
		Thread.sleep(2000);
		selectByValue(lang, "it");
		Thread.sleep(2000);
		selectByVisibleText(lang, "فارسی");
 
		
		
	}
	
	
	public void selectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	
	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectByVisibleText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	

}
