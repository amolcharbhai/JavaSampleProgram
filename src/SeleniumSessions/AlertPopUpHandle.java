package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumJava\\Jars\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // Enter url
			
			driver.findElement(By.name("proceed")).click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			
			Thread.sleep(5000);
			alert.accept(); // click on ok button
			
			

	}

}
