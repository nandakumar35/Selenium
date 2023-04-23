package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectionListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91807/Desktop/SDET/Selenium/FOOD.html");
		WebElement Listbox = driver.findElement(By.id("mtr"));
		Select s=new Select(Listbox);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("C");
		Thread.sleep(1000);
		s.selectByVisibleText("HORLICKS");
		Thread.sleep(1000);
		s.deselectAll();
		System.out.println(s.isMultiple());
	}

}
