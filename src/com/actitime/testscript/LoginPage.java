package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx;
	private WebElement pwdbx;
	private WebElement lgbtn;
	
		public LoginPage(WebDriver driver) {
			untbx=driver.findElement(By.id("username"));
			pwdbx=driver.findElement(By.name("pwd"));
			lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
		}
		
		public void setLogin(String untbx,String pwdbx) {
			this.untbx.sendKeys(untbx);
			this.pwdbx.sendKeys(pwdbx);
		}
}
