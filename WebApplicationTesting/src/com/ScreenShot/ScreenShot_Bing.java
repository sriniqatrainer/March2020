package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot_Bing {
	
	
	WebDriver driver = null;
	String url="http://bing.com";
	
	@BeforeTest
	public void setUp()
	{
			
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicitlyWait
		
		// if the element on the webPage loads within a short duration then the WebDriver will
	// immediately automates the element without waiting for the rest of the time to be completed
		
	// implicitlyWait - will get applicable to all the webPages( to which ever webPage the script 
		// navigates to ) - will get applicable to all the elements of the WebPage under test
		
	}
	
	@Test
	public void screenShot() throws IOException
	{
		
		// TakesScreenshot - its an interface in webDriver
		// Type Casting
		// OutputType<T> - its an interface in webDriver
		
		File bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_ScreenShot, new File("./screenShots/bing.png"));
		
		
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
