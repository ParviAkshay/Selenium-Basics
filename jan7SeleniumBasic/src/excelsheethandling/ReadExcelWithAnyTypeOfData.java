package excelsheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelWithAnyTypeOfData 
{
	public static void main(String[] args) throws IOException  {

	String path = System.getProperty("user.dir")+"\\Book1.xlsx";
	File file = new File(path);
	
	FileInputStream fis = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheetAt(0);
	
	DataFormatter df = new DataFormatter();
	
	String data =df.formatCellValue(sh1.getRow(5).getCell(1));
	
	System.out.println(data);
	
	int rowcount = sh1.getLastRowNum();
	
	System.out.println(rowcount);
	
	int columncount = sh1.getRow(0).getLastCellNum();
	
	System.out.println(columncount);
	}
}
