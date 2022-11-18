

package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {


	public static void main(String[] args) throws IOException  {

		XSSFWorkbook wb=new XSSFWorkbook("./data/dataSheet.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//int rowCount = sheet.getLastRowNum();
		//System.out.println(rowCount);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int columnCount = sheet.getRow(5).getLastCellNum();
		System.out.println(columnCount);
		
		for (int i = 1; i <=rowCount; i++) {
			 XSSFRow row = sheet.getRow(i);
//			System.out.println(row);
			
		for (int j = 1; j <columnCount; j++) {
				XSSFCell cell = row.getCell(j);
//			String cellValue = cell.getStringCellValue();
			System.out.println(cell);
			}
			
			
		
	}

}
}