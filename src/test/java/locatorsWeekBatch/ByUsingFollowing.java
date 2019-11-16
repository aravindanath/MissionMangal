package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByUsingFollowing extends LaunchChrome {
	
	
	@Test
	public void startswith() throws InterruptedException {
		
		driver.get("https://www1.nseindia.com/");
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'BRITANNIA')]//following::td[1]/span[1]"));
		System.out.println(ele.getText());
		
		
		driver.get("https://www.moneycontrol.com");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,800)");
		String marketName ="Nikkei 225";//Nikkei 225 
		String xpath = "//table[@class='rhsglTbl']//a[contains(text(),'MARKET')]//following::td[1]".replace("MARKET", marketName);
		
		
		
		WebElement ele1 = driver.findElement(By.xpath(xpath));
		System.out.println(ele1.getText());
		
	}

}
