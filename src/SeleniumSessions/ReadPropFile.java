package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException,
			InterruptedException {
		Properties prop = new Properties();
		FileInputStream IP = new FileInputStream(
				"D:\\Selenium\\WebDriver_Tutorial\\JavaTrainingSession\\src\\SeleniumSessions\\config.properties");
		prop.load(IP);

		String URL = prop.getProperty("URL");
		String browserName = (prop.getProperty("Browser"));

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\SeleniumJava\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\SeleniumJava\\Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath(prop.getProperty("Fromlist_Xpath")))
				.sendKeys(prop.getProperty("From"));
		driver.findElement(
				By.xpath("//li[@role='option']//div[contains(@class,'makeFlex hrtlCenter')]//div/p[1]"))
				.click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		/*
		 * List<WebElement> myList = driver .findElements(By .xpath(
		 * "//li[@role='option']//div[contains(@class,'makeFlex hrtlCenter')]//div/p[1]"
		 * ));
		 * 
		 * for (int i = 0; i < myList.size(); i++) {
		 * System.out.println(myList.get(i).getText());
		 * 
		 * if (myList.get(i).getText().contains(prop.getProperty("From"))) {
		 * myList.get(i).click(); myList.get(i).sendKeys(Keys.ARROW_DOWN,
		 * Keys.ENTER);
		 * 
		 * break; }
		 * 
		 * }
		 */

		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath(prop.getProperty("Tolist_Xpath")))
				.sendKeys(prop.getProperty("To"));
		driver.findElement(By.xpath("//li[@role='option']//div//p[1]")).click();

	}

}
