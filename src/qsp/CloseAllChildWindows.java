package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindows {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			String pwh = driver.getWindowHandle();
			Set<String> Allwh = driver.getWindowHandles();
			Thread.sleep(3000);
					for(String w:Allwh) {
						
						driver.switchTo().window(w);
						if(pwh.equals(w)) {
						}
						else {
							driver.close();
						}
					}
		}
}
