package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModuledemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@BeforeClass
	public void openBrowser(){
		Reporter.log("openBrowser", true);
	}
	@BeforeMethod
	public void login(){
			Reporter.log("login", true);
	}
	@Test(priority = -1)
	public void editCustomer() {
		Reporter.log("editCustomer", true);
	}
	@Test(priority = 0)
	public void registerCustomer() {
		Reporter.log("registerCustomer", true);
	}
	@Test(priority = 2, invocationCount = 2)
	public void deletecustomer() {
		Reporter.log("deletecustomer", true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
	}
}
