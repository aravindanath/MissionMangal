package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class My001 extends ExampleBFAFClass {
	
	@Test(dataProvider="testData")
	public void login(String email, String password ,String tshirt) throws InterruptedException {
		
		driver.get("https://www.myntra.com/login");
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(tshirt,Keys.ENTER);
		Thread.sleep(1000);
		
	}
	@DataProvider
	public Object[][] testData(){
		Object[][] data = new Object[8][3];
		data[0][0] = "aravindnath.dm@myntra.com";
		data[0][1] = "myntra@123";
		data[0][2] = "tshits";
		data[1][0] = "ankush@myntra.com";
		data[1][1] = "myntra#123";
		data[1][2] = "shirt";
		data[2][0] = "lekya@myntra.com";
		data[2][1] = "myntra#123";
		data[3][0] = "prince@myntra.com";
		data[3][1] = "myntra#123";
		data[4][0] = "leyana@myntra.com";
		data[4][1] = "myntra#123";
		data[5][0] = "priyanka@myntra.com";
		data[5][1] = "myntra#123";
		data[6][0] = "kiran@myntra.com";
		data[6][1] = "myntra#123";
		data[7][0] = "padmini@myntra.com";
		data[7][1] = "myntra#123";
		return data;

		
		
	}
	
	
	
	
	
	

}
