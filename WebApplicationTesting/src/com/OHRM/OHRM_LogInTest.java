package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogInTest {

	public static void main(String[] args) {
		
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		String UserName="admin";
		String Password="password";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);

		String expected_OrangeHRMLogInPage="OrangeHRM";
System.out.println(" The Expected Title of OrangeHRM LogIN Page is :"+expected_OrangeHRMLogInPage);
		
		String actual_OrangeHRMWebPageTitle=driver.getTitle();
System.out.println(" The actual title of the OrangeHRM WebPage is :"+actual_OrangeHRMWebPageTitle);
		
		if(actual_OrangeHRMWebPageTitle.equals(expected_OrangeHRMLogInPage))
		{
			System.out.println(" Successfully navigated to OrangeHRM LogIN Page");
		}
		else
		{
			System.out.println(" Failed to navigate to OrangeHRM LogIn Page");
		}
		
		// <input name="txtUsername" id="txtUsername" type="text">
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(UserName);
		
		// <input name="txtPassword"  type="password">
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys(Password);
		
		// <input type="submit"  class="button"  value="LOGIN">
		WebElement logInButton=driver.findElement(By.className("button"));
		logInButton.click();
		
		String expected_HomePageTitle="OrangeHRM";
		System.out.println(" The expected title of OrangeHRM HomePage is :"+expected_HomePageTitle);
		
		String actual_WebPageTitle=driver.getTitle();
		System.out.println(" The actual title of the OrangeHRM WebPage is :"+actual_WebPageTitle);
		
		if(actual_WebPageTitle.equals(expected_HomePageTitle))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
		}
		
		driver.quit();
	}

}
