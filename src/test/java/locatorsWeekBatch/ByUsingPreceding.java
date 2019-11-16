package locatorsWeekBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ByUsingPreceding extends LaunchChrome {
	
	
	@Test
	public void startswith() throws InterruptedException {
		
		driver.get("http://the-internet.herokuapp.com/tables");
		//Method 1
		WebElement ele = driver.findElement(By.xpath("//table[@id='table1']//td[contains(text(),'fbach@yahoo.com')]/../td[1]"));
		System.out.println(ele.getText());
		//Method 2
		WebElement ele1 = driver.findElement(By.xpath("//table[@id='table1']//td[contains(text(),'fbach@yahoo.com')]/preceding::td[2]"));
		System.out.println(ele1.getText());
 
		
		
	}

}
