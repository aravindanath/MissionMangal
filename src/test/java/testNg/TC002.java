package testNg;

import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TC002  extends ExampleBFAFClass{

 
//
//	@BeforeMethod
//	public void bfMethod() {
//		System.out.println("++++++++ Before method ++++++++ ");
//	}
//
//	@AfterMethod
//	public void afMethod() {
//		System.out.println("########## After method ########## ");
//	}

	@Test
	public void openUrl() {
		driver.get("https://www.facebook.com");
		System.out.println("Open url");

	}

	@Test
	public void addcart() {

		System.out.println("addcart");
		throw new SkipException("Skipping..");

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
