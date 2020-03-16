package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TimeAndData_CapturingCompleteWebTableData extends BaseTest{
	
	@Test
	public void capturingCompleteWebTableData()
	{
		
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++) // to goto all the Rows
		{
			
			for(int j=1;j<=8;j++) // to goto every Row of All the Columns
			{
				
				WebElement data=driver.findElement(By.xpath
	("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
				String table_Data=data.getText();
				System.out.print(table_Data+" ");
			}
			System.out.println();
			
		}
		
		
		
	}
	
	
	

}
