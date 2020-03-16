package com.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop_IdentifyElement_GetText {

			
		WebDriver driver = null;
		String url="https://jqueryui.com/droppable/";
		
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
		public void dragAndDrop() throws InterruptedException
		{
			
			// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			
			// Thread.sleep(10000); // Explicit wait
					
			// id="draggable" - Property of "Drag me to my Target " element
			
			WebElement dragElement=driver.findElement(By.id("draggable"));
			String dragElement_Text=dragElement.getText();
			System.out.println(" The text of Drag element is : "+dragElement_Text);
			
				
		}
		
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}

	}


