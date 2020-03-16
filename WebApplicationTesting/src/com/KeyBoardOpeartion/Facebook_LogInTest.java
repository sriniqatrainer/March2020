package com.KeyBoardOpeartion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize the Browser
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("srini.qatrainer@gmail.com");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("testing").perform();
				
		act.sendKeys(Keys.ENTER).perform();
	}

}
