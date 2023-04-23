package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbFontsizetype {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String fonttype = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-family");
			String fontsize = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");	
			System.out.println("fonttype is"+fonttype);
			System.out.println("fontsize is"+fontsize);
			driver.close();
	}

}
