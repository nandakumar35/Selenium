package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcNews {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.bbc.com/");
			List<WebElement> n = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
			for(WebElement news:n) {
				String text = news.getText();
				System.out.println(text);
			}
			driver.close();
		}	
}
