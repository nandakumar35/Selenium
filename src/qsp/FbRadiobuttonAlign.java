package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRadiobuttonAlign {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		
		int female = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int male = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(female==male&&male==custom) {
			System.out.println("Properly aligned");
		}
		else {
			System.out.println("Not Properly aligned");
		}
		driver.close();
	}

}
