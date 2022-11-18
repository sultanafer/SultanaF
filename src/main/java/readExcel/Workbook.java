package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workbook {

	public static void main(String[] args)throws IOException   {

		// Open/Enter the workbook				
		XSSFWorkbook wb = new XSSFWorkbook("./SeleniumProject/src/test/resources/testdata/Testdata.xlsx");			
		
		//Get Sheet			
		XSSFSheet sheet = wb.getSheet("Sheet 1");
		
		//1.Get row count
			
				/*int rowCount = sheet.getLastRowNum();
				System.out.println(rowCount);

		//2.Get column count
				int columnCount = sheet.getRow(0).getLastCellNum();
				System.out.println(columnCount);*/
		
		//Get row
		XSSFRow row = sheet.getRow(4);
					
		//Get column
		  XSSFCell cell = row.getCell(1);
		
		//Action- Read/print particular CellValue
		 String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);}} 
		
	


