package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class ActionsClass extends LaunchChrome{
	
	@Test
	public void mousehover() throws InterruptedException {
		driver.get("https://www.myntra.com/");
		String dress = "Leggings, Salwars & Churidars";
		String xpDress = "(//a[text()='DRESS'])[1]".replace("DRESS", dress);
		
		WebElement tgt = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		WebElement tgt2 = driver.findElement(By.xpath(xpDress));
		mouseHover(driver,tgt);
		click(driver,tgt2);
		
		
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		try {
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#closeBtn")).click();
			
		}catch(Exception e) {
		System.out.println(e.getMessage());	;
		}
		
		WebElement src1 =  driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement dec1 =  driver.findElement(By.xpath("//*[@id='amt7']/li"));
		

		WebElement dec2 =  driver.findElement(By.xpath("//*[@id='amt8']/li"));
		
		dragDrop(driver, src1, dec1);
		Thread.sleep(2000);
		dragDrop(driver, src1, dec2);
	}
	
	
	
	public void mouseHover(WebDriver driver, WebElement target ) {
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
	}
	public void click(WebDriver driver, WebElement target ) {
		Actions act = new Actions(driver);
		act.click(target).build().perform();
	}
	
	public void dragDrop(WebDriver driver, WebElement src, WebElement tgt ) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, tgt).build().perform();
	}
	
	
	
	
	
	

}
