package com.NewTours_TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.NewTours_Pages.LogInPage;

public class LogInPageTest extends BaseTest {
	
	LogInPage logInPage = null;
	
	@Test(priority=1)
	public void Register()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		
		logInPage.Register();
	}
	
	
	@Test(priority=2)
	public void Support()
	{
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		
		logInPage.Support();
	}

	@Test(priority=3)
	public void logIn() throws IOException
	{
		
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		
		FileInputStream file = new FileInputStream("./src/main/java/com/TestDataFIles/NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			Row row=sheet.getRow(i);
			
			logInPage.logIn(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
			
			System.out.println(i +" LogIn Successfull ");
			
			driver.navigate().back();
		}
				
	}
	
}
