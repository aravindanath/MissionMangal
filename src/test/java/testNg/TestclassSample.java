package testNg;

import java.util.concurrent.BrokenBarrierException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestclassSample extends ExampleBFAFClass {
	@Test(retryAnalyzer = MyRetry.class)
	  public void test2() {
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("Gzoogle")) {
			System.out.println("pass");
		}else {
	    Assert.fail("to test retry");
	  }}


}
