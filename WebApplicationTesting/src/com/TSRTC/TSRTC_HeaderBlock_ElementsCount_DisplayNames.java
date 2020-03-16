package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_ElementsCount_DisplayNames {

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.tsrtconline.in/oprs-web/";
			
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		// first reaching out to the header block of the Webpage -
		// class="menu-wrap" - property of the  HeaderBlock
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
		// identifying the element in the header block of the webPage
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
		int headerBlockLinks_Count=headerBlockLinks.size();
		
System.out.println(" The Total number of links on the HeaderBlock are : "+headerBlockLinks_Count);
		
		for(int p=0;p<headerBlockLinks_Count;p++)
		{
			String headerBlockLinkName=headerBlockLinks.get(p).getText();
			System.out.println(p+" - "+headerBlockLinkName);
			
			headerBlockLinks.get(p).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
// since we are in the next webPage after the click Operation - we should navigate back to the 
			// immediate previous WebPage - which is under Test 
			driver.navigate().back();
			
			Thread.sleep(5000); // Explicit Wait
			
// After coming back to the WebPage under Test - again Identifying the Header Block and recreating
// the ArrayList again - Because the Elements are Lost from the ArrayList when the click operation
	// happened on the 1st list store in the ArrayList - when driver moved to the next WebaPage 
//the stored information in the  arrayList will be cleared-OFF - so need to recreate the ArrayList 		
			
			headerBlock=driver.findElement(By.className("menu-wrap"));
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
					
		}				
		driver.quit();
	}
}
