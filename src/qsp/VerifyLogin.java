package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		boolean Result = driver.findElement(By.id("loginbutton")).isEnabled();
		if(Result) {
			System.out.println("Enabled");
		}
		else {
			System.out.println("Not-enabled");
		}
		driver.close();
	}

}
