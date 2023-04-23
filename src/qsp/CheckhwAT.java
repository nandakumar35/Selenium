package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckhwAT {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
			int h1 = un.getSize().getHeight();
			int h2 = pwd.getSize().getHeight();
			
			int w1 = un.getSize().getWidth();
			int w2 = pwd.getSize().getWidth();
			
			if(h1==h2&&w1==w2) {
				System.out.println("Height & width are equal");
			}
			else {
				System.out.println("Height & width are not equal");
			}
			driver.close();
	}

}
