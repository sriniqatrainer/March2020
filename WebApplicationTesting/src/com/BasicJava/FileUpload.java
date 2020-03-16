package com.BasicJava;

/*
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

*/
public class FileUpload {

	/*
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		
		WebDriver driver = null;
		
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);

		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("password");
		
		
		
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();
		
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		
		Actions act = new Actions(driver);
		act.moveToElement(pim).perform();
		
		WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
		addEmployee.click();
		
		driver.findElement(By.id("firstName")).sendKeys("Testing");
		
		driver.findElement(By.id("lastName")).sendKeys("hello");
		
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(10000);
		
		java.lang.Runtime.getRuntime().exec(".//AutoItScripts//imageUpload.exe");

		Thread.sleep(10000);
		
		driver.findElement(By.id("btnSave")).click();
		
		
	} */

}
