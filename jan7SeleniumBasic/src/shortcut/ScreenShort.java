package shortcut;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShort 
{
	public static void screenshot(WebDriver driver, String filename) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	String path = "C:\\Users\\BMS\\Desktop\\jan7SeleniumBasic\\ScreenShot\\"+filename+".png";
	
	File file = new File(path);
	
	FileHandler.copy(source, file);
	}

}
