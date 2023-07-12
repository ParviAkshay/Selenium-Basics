package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameterazation 
{
	@Parameters({"browser"})
	@Test(priority=1)
	public void getDetails(String browsername)
	{
		System.out.println("xml file name is "+browsername);
		System.out.println("Get Details test case");
	}
    
	@Parameters ({"browser","env"})
	@Test(priority=2)
	public void launchBrowser(String browsername,String s)
	{
		System.out.println(s);
		
		WebDriver driver;
		if(browsername.equals("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		}
        @Parameters({"tagname"})
		@Test(priority=4)
		public void login(String tag)
		{
			System.out.println("xml value is "+tag);
		}
		
	
	


}
