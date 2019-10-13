package testNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations {

	/**
	 * open browser User login to amazon search product, addto cart and change
	 * adress log out clouse browser
	 */
	@BeforeTest
	public void opnebrowser() {

		System.err.println("Open browser");
	}

	@Test(priority=1)
	public void openUrl() {

		System.out.println("Open url");
	}

	@Test(priority=2)
	public void login() {
		System.out.println("My first test");
	}
 

	@Test(priority=3)
	public void search() {
		System.out.println("search");
	}

	@Test
	public void addToCart() {
		System.out.println("add to cart");
	}

	@Test(priority=4)
	public void addAddress() {
		System.out.println("add address");
	}

	@Test
	public void logout() {
		System.out.println("logout");
	}

	@AfterTest
	public void closeBroeswe() {
		System.err.println(" close browser");

	}
 
 

}
