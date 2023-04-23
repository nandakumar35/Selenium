package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopupCareIn {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(month);
		s1.selectByIndex(2);
		
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s2=new Select(year);
		s2.selectByIndex(73);
		
		driver.findElement(By.xpath("(//a[contains(text(),'1')])[1]")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(5000);
		boolean error = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(error) {
			System.out.println("Error is displaying");
		}
		else {
			System.out.println("Error not is displaying");
		}
		driver.close();
	}
}
