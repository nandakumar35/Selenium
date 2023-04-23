package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class HandlingPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream f=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(f);
		String ur = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.out.println(ur);
		System.out.println(un);
		System.out.println(pwd);
	}
}
