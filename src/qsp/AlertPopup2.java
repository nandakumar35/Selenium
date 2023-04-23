package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[2]")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.dismiss();
		String b = driver.findElement(By.id("demo")).getText();
		System.out.println(b);
		driver.close();
			  
	}
}
