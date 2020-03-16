package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
	String url="http://facebook.com";
	
	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get(url);
	
	/*
	 
 <input  id="email" >

 locator - id
 selector - email
	 
	 */
	
driver.findElement(By.id("email")).sendKeys("srini.qatrainer@gmail.com");
	
// <input  id="pass" >
	
	// WebElement - is an interface
	
    WebElement password=driver.findElement(By.id("pass"));
    password.sendKeys("testing");
    
// <label  id="loginbutton"></label>
    WebElement logInButton=driver.findElement(By.id("loginbutton"));
    logInButton.click();
    

	}

}
