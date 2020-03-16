package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTable extends BaseTest{
	
	@Test
	public void dynamicWebTable()
	{
		// identifying the Table
		// /html/body/div[1]/div[6]/section[1]/div
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		
		// identifying the number of rows in the table - using tr tag
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) // will goto every Row
		{
			
			// Going to Every Row - identifying the number of columns 	
List<WebElement>cols=rows.get(i).findElements(By.tagName("td")); 

		for(int j=0;j<cols.size();j++) // to goto every Row of all the Columns
		{
			
			String table_Data=cols.get(j).getText();
			System.out.print(table_Data+"  ");
		}
		System.out.println();
				
		}
	
	}
}