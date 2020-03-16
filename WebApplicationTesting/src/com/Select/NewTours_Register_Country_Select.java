package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Select {

	public static void main(String[] args) {
		
		String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php?osCsid=76af65c99d97d06ce59055dccd0717d6">REGISTER</a>
												//34b48db988f9cafe4c6cd298bcd15dd6
											    // 4f5171815504278cd1a0bcc13da37147
			
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String registerElementText=register.getText();
		System.out.println(" The text of the Register Element is :  "+registerElementText);
		
		String expected_RegisterUrlAddress=register.getAttribute("href");
System.out.println(" The Expected URL address of Register Element under test is : "+
																	expected_RegisterUrlAddress);
		
		register.click();
		
		String actual_WebpageUrlAddress=driver.getCurrentUrl();
		System.out.println(" The actual URL Address of the Webpage is : "+actual_WebpageUrlAddress);
		
		if(actual_WebpageUrlAddress.equals(expected_RegisterUrlAddress))
		{
			System.out.println(" Sucessfully Navigated to Register Webpage - PASS");
		}
		else
		{
			System.out.println(" Failed to navigate to Register Webpage - FAIL ");
		}

		// Automate Country DropDown 
		
		// name="country" - property of Country DropDown
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select selection = new Select(country);
		
		selection.selectByIndex(7);
		
		selection.selectByValue("234");
		
		selection.selectByVisibleText("INDIA");
		

	}

}
