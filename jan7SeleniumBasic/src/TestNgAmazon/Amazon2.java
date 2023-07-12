package TestNgAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Amazon2 
{
	@Test(priority=3)
	public void search()
	{
		 Amazon1.driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	}

}
