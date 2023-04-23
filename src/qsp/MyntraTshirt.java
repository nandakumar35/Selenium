package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTshirt {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
	driver.findElement(By.xpath("(//h3[text()='The Souled Store'])[2]"));
	Thread.sleep(3000);
	driver.close();
	}

}
