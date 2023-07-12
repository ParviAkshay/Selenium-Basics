package basicformulas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetips 
{
	public static WebDriver driver;
	
	public static void launchbrowser(String url)
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
	}

}
