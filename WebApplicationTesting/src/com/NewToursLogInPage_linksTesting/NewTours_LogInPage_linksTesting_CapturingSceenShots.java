package com.NewToursLogInPage_linksTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInPage_linksTesting_CapturingSceenShots 
{

	
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
			
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicitlyWait
		
		// if the element on the webPage loads within a short duration then the WebDriver will
	// immediately automates the element without waiting for the rest of the time to be completed
		
	// implicitlyWait - will get applicable to all the webPages( to which ever webPage the script 
		// navigates to ) - will get applicable to all the elements of the WebPage under test
		
	}
	
	@Test
	public void links_Test_ScreenShots() throws IOException
	{
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			
			String linkName=links.get(i).getText();
			System.out.println(linkName);
			
			links.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./screenShots/"+linkName+".png"));
			
			driver.navigate().back();
			
			links=driver.findElements(By.tagName("a"));
							
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
