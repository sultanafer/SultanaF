package readExcel;

import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RepeatExcel {

	public static void main(String[] args) {
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sheet = wb.getSheet("./data/NewExcel.xlsx");
    XSSFRow row = sheet.getRow(0);
    XSSFCell cell = row.getCell(0);
    Date cellValue = cell.getDateCellValue();
    System.out.println(cellValue);
	
	
	}

}


