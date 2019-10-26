package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertions extends ExampleBFAFClass{
	
	
	@Test
	
	public void  verifyPageTitle() {
		System.out.println("Starting.....");
		driver.get("https://www.amazon.com");
		String pageTitle =driver.getTitle();
		System.out.println(pageTitle);
		//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
		Assert.assertEquals(pageTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Mismatch in title!");
		
		System.out.println("ending.....");
	}
	
	
	@Test 
	public void softAssertion() {
		
		System.out.println("Starting.....");
		driver.get("https://www.google.com");
		String pageTitle =driver.getTitle();
		System.out.println(pageTitle);
		
		SoftAssert sf  = new SoftAssert();
		sf.assertEquals(pageTitle, "Google.com","Title mis match!");
		System.out.println("ending.....");
		sf.assertAll();
		
	}

}
