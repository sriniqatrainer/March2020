package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Vacations_BackToHome {

	public static void main(String[] args) {
		
String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// <a href="mercuryunderconst.php">Vacations</a>
		
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		vacations.click();
		
		// <img src="/images/forms/home.gif" width="118" height="23" border="0">
		
	//	WebElement backToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		WebElement backToHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
		backToHome.click();

	}

}
