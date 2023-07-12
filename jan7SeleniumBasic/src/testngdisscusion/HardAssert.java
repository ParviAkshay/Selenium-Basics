package testngdisscusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class HardAssert 
{WebDriver driver;
	@Test
	public void loginTest()
	{
		driver = WebOpenShotCut.launchbrowser("https://www.amazon.com");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		 driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
	     String titleofpage = driver.getTitle();
	     
	     System.out.println(titleofpage);
	
	     boolean ispresent = titleofpage.contains("mobile");
	
	     //Applying Assertion
	     
	     Assert.assertEquals(ispresent, true);
	     
	     Assert.assertEquals(titleofpage, "Amazon.com : mobile");
	     
	}

	
}
