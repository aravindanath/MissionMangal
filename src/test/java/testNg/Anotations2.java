package testNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations2 {

	/**
	 * open browser User login to amazon search product, addto cart and change
	 * adress log out clouse browser
	 */
	@BeforeTest
	public void opnebrowser() {

		System.err.println("Open browser");
	}

	@Test
	public void openUrl() {

		System.out.println("Open url");
		Assert.fail("Fail...");
	}

	@Test(dependsOnMethods = "openUrl")
	public void login() {
		System.out.println("login");
	}

	@Test
	public void search() {
		System.out.println("search");
	}

	@Test
	public void addToCart() {
		System.out.println("add to cart");
	}

	@Test
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
