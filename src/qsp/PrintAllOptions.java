package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(0, null);
	driver.get("file:///C:/Users/91807/Desktop/SDET/Selenium/FOOD.html");
	WebElement lb = driver.findElement(By.id("mtr"));
	Select s=new Select(lb);						
	String text = s.getWrappedElement().getText();	
	System.out.println(text);
	}
}
