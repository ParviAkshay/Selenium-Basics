package shortcut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOpenShotCut 
{
	public static WebDriver driver;
	
	public static WebDriver launchbrowser(String url)
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	
		return driver;
	}
}
