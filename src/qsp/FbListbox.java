package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.id("day"));
		Select s1= new Select(d);
		s1.selectByIndex(0);
		
		WebElement m = driver.findElement(By.id("month"));
		Select s2= new Select(m);
		s2.selectByValue("3");
		
		WebElement y = driver.findElement(By.id("year"));
		Select s3= new Select(y);
		s3.selectByValue("1997");
	}

}
