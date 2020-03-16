package com.CapturingURl;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingURL_Facebook {

	public static void main(String[] args) {
		
		String url="http://facebook.com";
			
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get(url);
		
		System.out.println(" The sent Url address is : "+url);
		
		String actual_FacebookLogInPageURL=driver.getCurrentUrl();
		
		System.out.println(" The Current URL address of the FaceBook LogIN Page Is : "+actual_FacebookLogInPageURL);
		
		driver.quit();
			
			

	}

}
