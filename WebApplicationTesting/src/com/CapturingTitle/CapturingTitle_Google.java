package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Google {

	public static void main(String[] args) {
		
		String url="http://google.com";
	//	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
				
		driver.get(url);
		
		String actual_GoogleHomePageTitle=driver.getTitle();
		
		System.out.println("The title of the Google Home Page is :" + actual_GoogleHomePageTitle);

		driver.quit();
	}

}
