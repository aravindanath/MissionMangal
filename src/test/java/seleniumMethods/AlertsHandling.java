package seleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class AlertsHandling  extends LaunchChrome{
	
	
	@Test
	public void alerts() throws InterruptedException {
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement goBtn = driver.findElement(By.xpath("//input[@value='Go']"));
		goBtn.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("keerthi@rediffmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password")).sendKeys("keerthi@123");
		goBtn.click();
		
		
		
	}
	
	@Test
	public void alertTypes() throws InterruptedException {
		
		driver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		System.out.println(alertGetText());
		
		alertAccept() ;
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println(alertGetText());
		sendText("Hello all");
		
		
		alertAccept() ;
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		System.out.println(alertGetText());
		
		alertDismiss();
		
		
	}
	
	
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public String alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}
	
	public void sendText(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}

}
