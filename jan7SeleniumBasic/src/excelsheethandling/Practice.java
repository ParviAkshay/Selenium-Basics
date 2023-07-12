package excelsheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice 
{
	public static void main(String[] args) throws IOException {
		
	
	String path = System.getProperty("user.dir")+("\\Book2.xlsx");
	
	File file = new File(path);
	
	FileInputStream fis = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheetAt(0);
	
	String data = sh1.getRow(5).getCell(1).getStringCellValue();
	
	System.out.println(data);
	
	int rows = sh1.getLastRowNum();
	
	System.out.println("Total no. of Rows "+rows);
	
	int column = sh1.getRow(0).getLastCellNum();
	
	System.out.println("Total no. of column "+column);
	
//	for (int i=0; i<rows;i++)
//	{
//		for(int j=0; j<column; j++)
//		{
//			String sh2 = sh1.getRow(i).getCell(j).getStringCellValue();
//			System.out.println(sh2);
//		}
//	}
	
	DataFormatter df = new DataFormatter();
	
	String data1 = df.formatCellValue(sh1.getRow(7).getCell(0));

	System.out.println(data1);
	
	}
}