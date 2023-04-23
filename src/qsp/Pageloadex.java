package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadex {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(7,TimeUnit.SECONDS);
			try
			{
				driver.get("https://www.facebook.com/");
				System.out.println("Page is loaded within 7seconds");
			}
			catch(Exception e) {
				System.out.println("Page is not loaded within 7seconds");
			}
			driver.close();
		}
}
