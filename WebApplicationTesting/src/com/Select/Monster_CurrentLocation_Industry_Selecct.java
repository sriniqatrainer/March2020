package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Selecct {

	public static void main(String[] args) {
		
		String url="https://my.monsterindia.com/sponsered_popup.html";
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();

		// Automate Current Location
		// class="border_grey1"
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		
		List<WebElement>currentLocationCities=currentLocation.findElements(By.tagName("option"));
		 		
		int currentLocationCities_Count=currentLocationCities.size();
System.out.println(" The total nyumber of Cities in currentLocationCities are: "+
																		currentLocationCities_Count);
		
		for(int i=0;i<currentLocationCities_Count;i++)
		{
			System.out.println(i+" "+currentLocationCities.get(i).getText());
		}
		
		Select selection = new Select(currentLocation);
		
		selection.selectByVisibleText("Delhi");
		
		// Automating industry Element
		// id="id_industry"
		
		//WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select selection1 = new Select(driver.findElement(By.id("id_industry")));
		
		selection1.selectByIndex(2);
		selection1.selectByValue("65");
		selection1.selectByVisibleText("Banking/Accounting/Financial Services");
		
		// deSelecting Optional Values - which are selected
		
		/*selection1.deselectByIndex(1);
		selection1.deselectByVisibleText("Automotive/Automobile/Ancillaries");
		selection1.deselectByValue("5"); */
		
		selection1.deselectAll();
				
		//driver.quit();
	}
}
