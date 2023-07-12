package regularpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import shortcut.WebOpenShotCut;

public class Ss 
{
	static WebDriver driver;
public static void main(String[] args) throws IOException 
{
	driver = WebOpenShotCut.launchbrowser("https://www.instagram.com");
	
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("RockStar");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File Source = ts.getScreenshotAs(OutputType.FILE);
	
	String path = System.getProperty("user.dir"+"\\ScreenShot.insta.jpg");
	
	File file = new File(path);
	
	FileHandler.copy(Source, file);

}
}
