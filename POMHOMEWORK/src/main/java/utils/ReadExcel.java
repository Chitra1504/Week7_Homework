package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static  String[][] readData(String filePath) throws IOException{
		XSSFWorkbook wbook=new XSSFWorkbook("./Data/"+filePath+".xlsx");
		XSSFSheet sheetAt=wbook.getSheetAt(0);
		int rowCount=sheetAt.getLastRowNum();
		int cellCount=sheetAt.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String stringCellValue=sheetAt.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
		}
		wbook.close();
		return data;
	}

}
