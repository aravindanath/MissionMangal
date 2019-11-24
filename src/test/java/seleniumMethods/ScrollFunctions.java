package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ScrollFunctions extends LaunchChrome{

	/**
	 * https://www.guru99.com/execute-javascript-selenium-webdriver.html
	 * @throws InterruptedException 
	 */
	
	@Test
	public void scrollFunctions() throws InterruptedException {
		
		driver.get("https://www.amazon.in");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Back to top']"));
		
		jsScrollTOelement(ele);
		jsColourElement(ele);
		Thread.sleep(2000);
		jsClick(ele);

	}
	

	public void jsScrollTOelement(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	public void jsColourElement(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='4px solid red'", ele);
	}
	public void jsClick(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
	}
	
	
	
	
}
