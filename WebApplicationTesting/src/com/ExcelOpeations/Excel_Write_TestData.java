package com.ExcelOpeations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row row=sheet.createRow(4);
		
		Cell cell=row.createCell(3);
		
		cell.setCellValue("Testing");
		
		cell.setCellValue("Selenium");
		
		Row row1=sheet.createRow(0);
		Cell cell1=row1.createCell(0);
		cell1.setCellValue("LiveTech");
		
		cell1.setCellValue("WebDriver");
				
FileOutputStream file1 = new FileOutputStream(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");
		workBook.write(file1);

	}

}
