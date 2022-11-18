package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practiceExcel {

	public static void main(String[] args)throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/usedata.xlsx");
		XSSFSheet sheet = wb.getSheet("empid");
		XSSFRow row = sheet.getRow(3);
		
		XSSFCell cell = row.getCell(4);
		//System.out.println(cell);
		String stringCellValue = cell.getStringCellValue();
		//String cellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}

}
