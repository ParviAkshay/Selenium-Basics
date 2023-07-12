package testngdisscusion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClasses1
{
	@Test
	public void testcase1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
	}

	@Test
	public void testcase2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	

}
