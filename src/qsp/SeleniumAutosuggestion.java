package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(3000);
			List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
			int count = allSugg.size();
			System.out.println(count);
			for(int i=0;i<count;i++) {
				String text = allSugg.get(i).getText();
				System.out.println(text);
			}
			allSugg.get(count-1).click();
			Thread.sleep(3000);
			driver.close();
	}

}
