package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAssignment 
{
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void launchBrowser(String browsername)
	{
	driver = new ChromeDriver();
	}
	
	@Parameters({"browser01"})
	@Test
	public void launchBrowser1(String browsername)
	{
	driver = new EdgeDriver();	
	}

}
