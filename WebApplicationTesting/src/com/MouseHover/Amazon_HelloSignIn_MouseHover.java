package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://amazon.in";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		// id="nav-link-accountList" - property of  HelloSignIn Element
		WebElement helloSignIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).perform(); 
		
		Thread.sleep(10000);
		
		// automating "Your Orders" Element - which is of Type link
		
		WebElement yourOrders=driver.findElement(By.linkText("Your Orders"));
		yourOrders.click(); 

	}

}
