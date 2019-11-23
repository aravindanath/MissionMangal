package seleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class Windowhandling extends LaunchChrome {

	@Test
	public void windowhandling() {

		driver.get("https://www.canarabank.com");
		String win1 = driver.getWindowHandle();
		System.out.println(win1);
		String title = driver.getTitle();
		System.out.println("Home Page Title: " + title);

		Set<String> win2 = driver.getWindowHandles();
		Iterator<String> i1 = win2.iterator();

		System.out.println("First window ID " + i1.next());

		driver.findElement(By.xpath("//*[text()='Net Banking (Retail/Corporate)']")).click();

		System.out.println("========Second Window opens========");
		win2 = driver.getWindowHandles();
		i1 = win2.iterator();

		String firstwindow = i1.next(); // window id of the main window
		String SecondWindow = i1.next();

		driver.switchTo().window(SecondWindow);
		win2 = driver.getWindowHandles();
		i1 = win2.iterator();
		System.out.println("Second window:"+ i1.hasNext());
		String title2 = driver.getTitle();
		System.out.println("Second window title: " + title2);
		driver.close();
		driver.switchTo().window(firstwindow);
		System.out.println(driver.getTitle());
		
		

	}

}
