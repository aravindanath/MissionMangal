package locatorsWeekBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByTag extends LaunchChrome {
	
	/*
	 * Print all the links in the web page
	 */
	
	@Test
	public void bytag() throws InterruptedException {
		driver.get("https://www.google.com");
		
		List<WebElement>aTag = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links "+aTag.size());
		
		for(WebElement ele : aTag) {
			System.out.println(ele.getText() + " --> " + ele.getAttribute("href"));
		}
		
	}

}
