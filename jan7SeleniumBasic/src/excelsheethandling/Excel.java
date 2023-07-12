package excelsheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static void main(String[] args) throws IOException {
		
	
	String path = System.getProperty("user.dir")+("\\Book2.xlsx");
	
	File file = new File(path);
	
	FileInputStream fis = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis); 
	
	XSSFSheet sh1 = wb.getSheetAt(0);
	
	String data = sh1.getRow(10).getCell(1).getStringCellValue();
	
	System.out.println(data);
	   
	   int rowcount = sh1.getLastRowNum();
	   
	   System.out.println("Total no. of Row "+rowcount);
	   
	   int columncount = sh1.getRow(2).getLastCellNum();
	   
	   System.out.println("Total no. of Column "+columncount);
	
	}
}
