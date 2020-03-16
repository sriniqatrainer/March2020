package com.ExcelOpeations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream(".//src//com//ExcelTestDataFiles//MultipleTestData.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// identifying the number of active Rows in the Sheet
		int rowCount=sheet.getLastRowNum();
		
		for(int k=0;k<=rowCount;k++) // to goto all the active Row's
		{
				Row row=sheet.getRow(k);// to goto an active Row
			
int cellCount=row.getLastCellNum(); //to goto an active Row and find the total number of active cells 
			
		for(int p=0;p<cellCount;p++)// to goto an active Row and get all the active Cell values
		{
			Cell cell=row.getCell(p); // goes to an active row of the active cell 
			String data=cell.getStringCellValue(); // get the value from Row of a cell
			System.out.print(data+" ");
		}
		System.out.println();
   }
}

}
