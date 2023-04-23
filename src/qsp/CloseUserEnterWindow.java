package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseUserEnterWindow {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			Scanner sc=new Scanner(System.in);
			System.out.println("which window has to be closed?");
			String s=sc.nextLine();
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			Set<String> Allwh = driver.getWindowHandles();
					for(String w:Allwh) {
						driver.switchTo().window(w);
						String title = driver.getTitle();
								if(title.equals(s)) {
									driver.close();
								}
								else {
								}
					}
		}
}
