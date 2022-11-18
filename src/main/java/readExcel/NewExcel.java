package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcel {

	public static String[][]readExcel()  throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data1/readExcel.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int RowCount = sheet.getLastRowNum();
		short ColumnCount = sheet.getRow(0).getLastCellNum();
		String[][] data=new String[RowCount][ColumnCount];
		
		for (int i = 1; i>= RowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <ColumnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String CellValue = cell.getStringCellValue();
				System.out.println(CellValue);
				
				
				data[i-1][j]=CellValue;
				
			}
			
		}
		
         return data;		
		
		

	}

}
