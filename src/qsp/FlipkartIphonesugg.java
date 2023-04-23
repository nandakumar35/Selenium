package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphonesugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button)[2]")).click();
			driver.findElement(By.xpath("(//input[@type])[1]")).sendKeys("iphone 14 pro max");
			driver.findElement(By.xpath("//button")).click();
			List<WebElement> desc = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
			int count1 = desc.size();
			List<WebElement> price = driver.findElements(By.xpath("(//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../../../../../../..//div)[36]"));
			int count2 = price.size();
			System.out.println(count1+"------------->"+count2);
			
			for(int i=1;i<count2;i++) {
				String spec = desc.get(i).getText();
				String proprice = price.get(i).getText();
				System.out.println(spec+"----------->"+proprice);
			}
			driver.close();
		}
}
