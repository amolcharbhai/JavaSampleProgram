package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
			"D:\\SeleniumJava\\Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com"); // Enter url
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(
				"Naveen Automation");
		driver.findElement(
				By.xpath("//div[@class='FPdoLc VlcLAe']//input[@aria-label='Google Search']"))
				.click();

	}

}
