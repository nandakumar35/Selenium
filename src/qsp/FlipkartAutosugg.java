package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutosugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@class,'KpZ')])[1]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone 14 pro max')]"));
		int count = allSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		allSugg.get(count-1).click();
	}

}
