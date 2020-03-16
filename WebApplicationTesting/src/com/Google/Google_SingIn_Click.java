package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SingIn_Click {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://google.com";
	
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get(url);
		
// <a class="gb_ce gb_4 gb_Wc" id="gb_70" href="//www.google.com/" >Sign in</a>
		
		/*
		  a - anchor tag
 		href - attribute

 	Type of the Element - link
 	locator - linkText
 	selector - Sign in
		 
		 */
		
	//WebElement singIn=driver.findElement(By.id("gb_70"));
		WebElement singIn=driver.findElement(By.linkText("Sign in"));
		singIn.click();

	}
}
