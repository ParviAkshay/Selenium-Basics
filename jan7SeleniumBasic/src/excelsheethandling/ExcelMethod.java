package excelsheethandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethod 
{
	public static void excel(int a,int b,int c,String s ) throws IOException
	{
       String path = System.getProperty("user.dir")+"\\"+s+".xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        
        XSSFSheet sheet = wb.getSheetAt(c);
        
        String data = sheet.getRow(a).getCell(b).getStringCellValue();
	
	    System.out.println(data);
	}
	
	public static void main(String[] args) throws IOException 
	{
		excel(1, 6, 3,"FnF Tracker - 7th Dec (Inbound)" );
		
	}
	
}
