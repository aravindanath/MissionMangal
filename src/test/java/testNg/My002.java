package testNg;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class My002 extends ExampleBFAFClass {
	public static Xls_Reader xls =  null;
	@Test(dataProvider="testData")
	public void login(Hashtable<String, String> value) throws InterruptedException {
	
		driver.get("https://www.myntra.com/login");
		test.info("User is on "+ driver.getCurrentUrl());
		driver.findElement(By.name("email")).sendKeys(value.get("user"));
		test.info("User is entering email"+value.get("user") );
		driver.findElement(By.name("password")).sendKeys(value.get("password"));
		test.info("User is entering password"+value.get("password") );
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(value.get("search"),Keys.ENTER);
		test.info("User is searching for "+value.get("search") );
		Thread.sleep(1000);
		
		
	
		
	}
	@DataProvider
	public Object[][] testData(){
		if (xls == null) {
		xls = new  Xls_Reader(System.getProperty("user.dir")+"//data//DataproviderDemo.xlsx");
		}
	
		
		String sheetName = "Login";
		int rows =  xls.getRowCount(sheetName);
		int colCount = xls.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		//Empty hastable
		Hashtable<String, String> table = null;
		// 2 is becoz we are reading from 2nd row
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			// for every row we need to create a hash table
			table = new Hashtable<String, String>();

			// from 1st col so o
			for (int colNum = 0; colNum < colCount; colNum++) {

				// this line will create a hashtable based on key n value
				table.put(xls.getCellData(sheetName, colNum, 1), xls.getCellData(sheetName, colNum, rowNum));
				// Data will be passed in 2D array.
				data[rowNum - 2][0] = table;
			}
		}
		return data;
		
	
		
	}
	
	
	
	
	
	

}
