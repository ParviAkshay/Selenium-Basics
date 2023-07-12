package testngdisscusion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Testclass2 extends Testclass1
{
	
		@Test(priority=3)
		public void search()
		{
			 driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		}


}
