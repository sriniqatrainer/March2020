package com.NavigateToApplication;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BingApplication_Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.bing.com");
		
		driver.get("http://google.com");
		
		driver.navigate().to("http://facebook.com");
		
		//driver.close();
				
		driver.quit();
			
	}

}
