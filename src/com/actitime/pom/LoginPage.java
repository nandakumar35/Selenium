package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwdbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
	public void setLogin(String un,String pwd) {
		untbx.sendKeys(un);
		pwdbx.sendKeys(pwd);
	}
}
