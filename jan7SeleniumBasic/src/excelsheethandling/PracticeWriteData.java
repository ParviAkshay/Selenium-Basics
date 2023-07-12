package excelsheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeWriteData
{
	public static void writedata() throws IOException 
	{
		String path = System.getProperty("user.dir")+"\\Book3.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(2).getCell(0).setCellValue("New Record");
		
		sh1.createRow(21).createCell(5).setCellValue("Create New Record");
		
		wb.write(fos);
		
		
	}
public static void main(String[] args) throws IOException 
{
	writedata();
}
}
