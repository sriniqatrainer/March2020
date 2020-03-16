package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_Click {

	public static void main(String[] args) {
	
		WebDriver driver = null;
		String url="http://google.com";
	
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get(url);
		
// <a class="gb_g" data-pid="23" href="https://mail.google.com/mail/?tab=wm&amp;ogbl">Gmail</a>
// <a class="gb_g" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;ogbl">Images</a>
		
		//WebElement images=driver.findElement(By.className("gb_g"));
		
		WebElement images=driver.findElement(By.linkText("Images"));
		images.click();
		
		String googleImagesTitle=driver.getTitle();
		System.out.println(" The title of Google Images WebPage is : "+googleImagesTitle);
		
		


	}

}
