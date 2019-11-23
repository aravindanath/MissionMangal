package seleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchChrome;

public class AutosuggestAndCalender extends LaunchChrome {

	@Test
	public void autosuggestCalender() throws InterruptedException {

		driver.get("https://www.redbus.in/");

		driver.findElement(By.cssSelector("#src")).sendKeys("Bang");
		Thread.sleep(500);
		List<WebElement> srcCity = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));

		System.out.println("No of pickup points: " + srcCity.size());

		for (WebElement ele : srcCity) {
			Thread.sleep(500);
			String pickup = ele.getText();
			if (pickup.equals("Madiwala, Bangalore")) {
				ele.click();
				break;
			}
		}

		driver.findElement(By.id("dest")).sendKeys("Goa");

		List<WebElement> drop = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		String dropLoc = "Mapusa, Goa";
		for (WebElement webElement : drop) {
			String dp = webElement.getText();
			Thread.sleep(500);
			if (dp.equals(dropLoc)) {
				String xp = "//ul[@class='autoFill']/li[text()='DROP']".replace("DROP", dropLoc);
				driver.findElement(By.xpath(xp)).click();
				// webElement.click();
				break;
			}

		}

		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
		Thread.sleep(200);
		List<WebElement> onDate = driver
				.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));

		for (WebElement webElement : onDate) {
			Thread.sleep(200);
			String dt = webElement.getText();
			if (dt.equals("25")) {
				webElement.click();
				break;
			}

		}

		driver.findElement(By.xpath("//*[@id='search']/div/div[4]/span")).click();
		Thread.sleep(200);

		List<WebElement> reDate = driver
				.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));

		for (WebElement webElement : reDate) {
			Thread.sleep(200);
			String dt = webElement.getText();
			if (dt.equals("Nov 2019")) {
				driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();

				break;
			}

		}
		Thread.sleep(200);
		List<WebElement> nextDate = driver
				.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));

		for (WebElement webElement : nextDate) {
			Thread.sleep(200);
			String dt = webElement.getText();
			if (dt.equals("5")) {
				webElement.click();
				break;
			}

		}

		Thread.sleep(500);
		driver.findElement(By.cssSelector("#search_btn")).click();

		Thread.sleep(1000);

	}

}
