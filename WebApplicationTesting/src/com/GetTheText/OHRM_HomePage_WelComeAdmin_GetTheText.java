package com.GetTheText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_HomePage_WelComeAdmin_GetTheText {

	public static void main(String[] args) throws InterruptedException {
		
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

		
		String expected_HomePageWelComeText="Admin";
		System.out.println(" The expected text of the OrangeHRM Application HomePage is : "+expected_HomePageWelComeText);
		
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement actual_welcomeAdminElement=driver.findElement(By.id("welcome"));
		String actual_welcomeAdminText=actual_welcomeAdminElement.getText();
		
		System.out.println(" The WelcomeAdmin Element text is : "+actual_welcomeAdminText);
		
		
		if(actual_welcomeAdminText.contains(expected_HomePageWelComeText))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIN Failed - FAIL");
		}
		
		
		actual_welcomeAdminElement.click();
		
		Thread.sleep(10000); // Explicit Wait
		
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		
		WebElement logOut=driver.findElement(By.partialLinkText("Log"));
		logOut.click();
		
		driver.quit();

	}

}
