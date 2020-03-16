package com.ExcelOpeations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
FileInputStream file = new FileInputStream(".//src//com//ExcelTestDataFiles//SingleTestData.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row row=sheet.getRow(0);
		
		Cell cell=row.getCell(0);
		
		String testData=cell.getStringCellValue();
		
		System.out.println(testData);
		
		
	}

}
