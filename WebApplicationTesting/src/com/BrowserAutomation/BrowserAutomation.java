package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", 
	"C:\\Users\\srinivas1\\Desktop\\Feb6PMBatch\\WebApplicationTesting"
	+ "\\driverFiles\\geckodriver.exe");
	
		FirefoxDriver hello = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		ChromeDriver hi = new ChromeDriver();
		

	}

}
