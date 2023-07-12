package navigationallibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
//		getTitle()
   
		String title = driver.getTitle();
		
		System.out.println(title);
		
//		getCurrentUrl()
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		
	}

}
