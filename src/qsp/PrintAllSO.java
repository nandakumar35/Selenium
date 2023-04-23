package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSO {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91807/Desktop/SDET/Selenium/FOOD.html");
		WebElement Listbox = driver.findElement(By.id("cp"));
		Select s=new Select(Listbox);	
		List<WebElement> Soptions = s.getAllSelectedOptions();
		int count = Soptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = Soptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
