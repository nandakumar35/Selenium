package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiprohref {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("wipro jobs");
			driver.findElement(By.name("btnK")).click();
			
			List<WebElement> h = driver.findElements(By.xpath("//a[@href]"));
			int count = h.size();
			System.out.println(count);
			for(int i=0;i<count;i++) {
			String url = h.get(i).getAttribute("href");
			System.out.println(url);
			}
			driver.close();
		}
}
