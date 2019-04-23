package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://operationsuat3.nielsen.com/CDARHome/");
		driver.manage().window().maximize();
		// driver.findElement(By.id("USER")).sendKeys("amol.charbhai.consultant@nielsen.com");
		driver.findElement(By.xpath("//*[@id='USER']")).sendKeys(
				"amol.charbhai.consultant@nielsen.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("Harman@123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

		// Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='moreAllModulestext']"))
				.click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[contains(text(),'OneBuyBO')]"))
				.click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

		Set<String> wh1 = driver.getWindowHandles();
		Iterator<String> itra = wh1.iterator();
		String main1Window = itra.next();
		String ChildWindow = itra.next();

		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());

	}
}
