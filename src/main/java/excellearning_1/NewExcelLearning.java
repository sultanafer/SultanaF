package excellearning_1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelLearning {

	public static void main(String[] args) throws IOException {
		
		
		
        XSSFWorkbook  wb =new XSSFWorkbook("./data/NewExcel.xlsx");
        XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		
		System.out.println(cellValue);
		
		
	}
	

	
}
