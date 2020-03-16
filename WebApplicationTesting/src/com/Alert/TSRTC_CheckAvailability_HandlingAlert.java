package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_CheckAvailability_HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		

		String url="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize the Browser
		driver.manage().window().maximize();
		
		driver.get(url);
		
//		<input id="searchBtn" );"> Automating Check Availability button
		
		WebElement checkAvailabilityButton=driver.findElement(By.id("searchBtn"));
		checkAvailabilityButton.click();
							
		Alert alt=driver.switchTo().alert();
		
		// getting the text of an Alert
		String alertMessage=alt.getText();
		System.out.println(" The alert message is : "+alertMessage);
		
		Thread.sleep(10000);

		alt.accept(); // to accept OK button
		
	//	alt.dismiss(); // to work on Cancel button
		
		// sending test data into the alert window
	//	alt.sendKeys("testing");
		
	}
}
