package testngdisscusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestTag2 
{WebDriver driver;
	@Test(priority=1)
	public void testcase2()
	{
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}

	@Test(priority=2)
	public void testcase21()
	{
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	}
}
