package qsp;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionWoDupli {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91807/Desktop/SDET/Selenium/FOOD.html");
		WebElement mtrLb = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrLb);
		
		//to get all options
		List<WebElement> options = s.getOptions();			
		
		//choose linkedhashset to maintain insertion order
		LinkedHashSet<String> lhs1=new LinkedHashSet<>();
		LinkedHashSet<String> lhs2=new LinkedHashSet<>();
		
		//all options as it is, then choose any list
		ArrayList<String> al1=new ArrayList<>();
		
		for(WebElement op:options) {
		String optText = op.getText();
		System.out.println(optText);
		
		//to print only duplicates
		if(!lhs1.add(optText)) {
			
		lhs2.add(optText);	
		}
		
		al1.add(optText);
		}
		
		TreeSet<String> ts1=new TreeSet<>(lhs1);
		
		//1
		System.out.println("All options without duplicates"+lhs1);
		//2
		System.out.println("only duplicates"+lhs2);
		//3
		System.out.println("options in alphabetical order without duplicates"+ts1);
		//4
		System.out.println("options in alphabetical order with duplicates"+al1);
		
		//search for specific option present in list box by taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option to search");
		String chooseopt=sc.nextLine();
		
			if(lhs1.contains(chooseopt))
			{
			System.out.println("option is present");
			}
			else
			{
				System.out.println("option is not present");
			}
		driver.close();
	}
}
