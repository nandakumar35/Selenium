package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.cleartrip.com/");
			driver.findElement(By.xpath("//div[contains(@class,'flex flex-middle nmx')]")).click();
			driver.findElement(By.xpath("(//input[contains(@class,' c-neutral')])[1]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Bangalore, IN')]")).click();
			driver.findElement(By.xpath("//input[contains(@placeholder,'Where to?')]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Goa, IN')]")).click();
			driver.findElement(By.xpath("(//div[contains(@class,'c-inherit flex flex-nowrap')])[3]")).click();
			driver.findElement(By.xpath("(//div[contains(text(),'15')])[1]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Search flights')]")).click();
			
		 List<WebElement> flights = driver.findElements(By.xpath("//img[@class]"));
		 List<WebElement> timings = driver.findElements(By.xpath("//img[@class]/../../../../../../../../div/div/div/div/div[2]/div/div[1]/p"));
		 
		int count1 = flights.size();
		int count2 = timings.size();
		System.out.println(count1+"             "+count2);
		
		for(int i=0;i<count1;i++) {
		String allflights = flights.get(i).getText();
		String depttime = timings.get(i).getText();
		System.out.println(allflights+"--------->"+depttime);
		}
		
		driver.close();
		}
}
