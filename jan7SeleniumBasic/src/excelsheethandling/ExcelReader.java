package excelsheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	public static void main(String[] args) throws IOException 
	{
//		To locate the file path
	   String path = System.getProperty("user.dir")+("\\Book2.xlsx");
	   
//	   To handle the file path
	   File file = new File(path);
	   
//	   To perform read operation to use FileInputStream class   
	   FileInputStream fis = new FileInputStream(file);
	   
//	   To locate the Workbook
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	   
//	   To locate the Sheet
	   XSSFSheet sh1 = wb.getSheetAt(0);
	   
//	   To locate Row-getRow(row_no) Column-getcell(column_no)
	   String data = sh1.getRow(2).getCell(1).getStringCellValue();
	   
	   System.out.println(data);
	   
	   int rowcount = sh1.getLastRowNum();
	   
	   System.out.println("Total no. of Row "+rowcount);
	   
	   int columncount = sh1.getRow(10).getLastCellNum();
	   
	   System.out.println("Total no. of Column "+columncount);
	
		
	}

}
