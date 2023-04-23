package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTab {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			driver.findElement(By.xpath("(//div)[97]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'About your actiTIME')]")).click();
			driver.findElement(By.linkText("Read Service Agreement")).click();
			String etitle = "Terms of Service";
			Set<String> allwh = driver.getWindowHandles();
				for(String w:allwh) {
						driver.switchTo().window(w);
						String atitle = driver.getTitle();
						if(atitle.contains(etitle)) {
						 List<WebElement> headings = driver.findElements(By.tagName("h2"));
						 int count = headings.size();
						 System.out.println(count);
						 for(int i=1;i<count;i++) {
						String text = headings.get(i).getText();
						System.out.println(text);
						 						}	
									}
						driver.close();
						}	
		}
}
