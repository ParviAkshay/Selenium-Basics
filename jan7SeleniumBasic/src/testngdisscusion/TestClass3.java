package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass3 
{
	WebDriver driver;
	
	@Parameters({"browser1"})
	@Test(priority=1)
	public void login(String browseropen)
	{
		 driver = new ChromeDriver();
	}
	
	@Parameters({"browser2"})
	@Test(priority=2)
	public void search(String browseropen)
	{
		driver = new EdgeDriver();
	}
	
	
	

}
