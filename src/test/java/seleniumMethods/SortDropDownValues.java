package seleniumMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class SortDropDownValues extends LaunchChrome {

	@Test
	public void sort() {

		driver.get("https://www.wikipedia.org/");

		List<WebElement> lang = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

		System.out.println("Total no of Lang " + lang.size());
		
		// Empty list
		List<String> empty = new ArrayList<String>();
		
		for (WebElement webElement : lang) {
			empty.add(webElement.getText());
		}
		
		System.out.println("Un sorted list: "+ empty);
		System.out.println("************************");
		Collections.sort(empty);
		System.out.println("sorted list: "+ empty);
		
	}

}
