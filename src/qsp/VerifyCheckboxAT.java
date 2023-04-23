package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckboxAT {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean result = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(result) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not-selected");
		}
		driver.close();
	}

}
