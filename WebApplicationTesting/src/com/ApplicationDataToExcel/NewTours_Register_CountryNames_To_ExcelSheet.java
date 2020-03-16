package com.ApplicationDataToExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNames_To_ExcelSheet {

	public static void main(String[] args) throws IOException {
		

		String url="http://newtours.demoaut.com";
			
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php?osCsid=76af65c99d97d06ce59055dccd0717d6">REGISTER</a>
												//34b48db988f9cafe4c6cd298bcd15dd6
											    // 4f5171815504278cd1a0bcc13da37147
			
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String registerElementText=register.getText();
		System.out.println(" The text of the Register Element is :  "+registerElementText);
		
		String expected_RegisterUrlAddress=register.getAttribute("href");
System.out.println(" The Expected URL address of Register Element under test is : "+
																	expected_RegisterUrlAddress);
		
		register.click();
		
		String actual_WebpageUrlAddress=driver.getCurrentUrl();
		System.out.println(" The actual URL Address of the Webpage is : "+actual_WebpageUrlAddress);
		
		if(actual_WebpageUrlAddress.equals(expected_RegisterUrlAddress))
		{
			System.out.println(" Sucessfully Navigated to Register Webpage - PASS");
		}
		else
		{
			System.out.println(" Failed to navigate to Register Webpage - FAIL ");
		}
		
	// Automating Country DropDown
		WebElement country=driver.findElement(By.name("country"));
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		FileInputStream file = new FileInputStream(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
				
		for(int i=0;i<countries.size();i++)
		{
			Row row=sheet.createRow(i);
			Cell cell=row.createCell(0);
			
			String countryName=countries.get(i).getText();
			System.out.println(countryName);
			
			cell.setCellValue(countryName);
			
			FileOutputStream file1 = new FileOutputStream(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
			workBook.write(file1);
			
		}
		
		driver.quit();

	}

}
