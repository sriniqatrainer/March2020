package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		String url="http://facebook.com";
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		/*
		 
// Email Element Properties		 
<input type="email" data-testid="royal_email">

  xpath is of 2 Types
     1. Relative xpath - starts with //
     2. Absolute xpath - html tag

 Xpath - locator
 Selector - Xpath Expression Creation

 Syntax: - xpath expression creation ( based on Single Property )

 //tagName[@attribute='value']
         or
 //*[@attribute='value']

  // - Search on the complete Webpage
  * - Search for all the Tags

  
  //input[@data-testid='royal_email']
  

 Syntax:-  xpath expression creation ( based on multiple Properties )
 
 //tagName[@attribute='value' and @attribute='value'  ]

		 */
		
		WebElement email=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("srini@gmail.com");
		

//<input class="inputtext login_form_input_box"  id="pass" data-testid="royal_pass">
	
//WebElement password=driver.findElement(By.xpath("//*[@class='inputtext login_form_input_box' and @data-testid='royal_pass']"));
	
		WebElement password	=driver.findElement(By.xpath("//*[@id='pass']"));
		// 						                          //*[@id='pass']
		
		password.sendKeys("Testing");
		

	}

}
