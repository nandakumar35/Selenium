package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpNaukri {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
	
		driver.findElement(By.id("usernameField")).sendKeys("nandycandy35@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Nanda");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	
		File f=new File("./Data/Nanda_kumar.pdf");
		String path = f.getAbsolutePath();
	
		driver.findElement(By.id("attachCV")).sendKeys(path);
	}
}
