package com.GetTheText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoEcho {

	public static void main(String[] args) {
		
	String url="http://www.echoecho.com/htmlforms10.htm";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize the Browser
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement block=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
		List<WebElement>group=block.findElements(By.name("group1"));
		
		
		System.out.println(group.size());
		
		for(int i=0;i<group.size();i++)
		{
			group.get(i).click();
			for(int j=0;j<group.size();j++)
			{
			System.out.println(group.get(j).getAttribute("value")+"  "+group.get(j).isSelected());
			}
		}
		
		driver.quit();

	}

}
