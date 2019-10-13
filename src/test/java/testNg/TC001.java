package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TC001 extends ExampleBFAFClass {

	
 

	@Test
	public void openUrl() {
		driver.get("https://www.amazon.com");
		System.out.println("Open url");

	}

	@Test
	public void addcart() {

		System.out.println("addcart");

	}
 
	
	
	
	/**
	 * Before suit
	 * Before group
	 * Before Class
	 * Before Test
	 * Before method
	 * @Test
	 * After method
	 * After Test
	 * After Class
	 * After Group
	 * After suite
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
