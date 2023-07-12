package assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import shortcut.ScreenShort;
import shortcut.WebOpenShotCut;

public class Sample 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = WebOpenShotCut.launchbrowser("https://www.facebook.com");
		
		ScreenShort.screenshot(driver, "facebook");
		
	}

}
