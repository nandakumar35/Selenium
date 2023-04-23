package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisableElements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/91807/Desktop/SDET/Selenium/DisableElements.html");
			driver.findElement(By.id("d1")).sendKeys("admin");
			RemoteWebDriver r=(RemoteWebDriver)driver;
			r.executeScript("document.getElementById('d2').value='manager'");
		}		
}
