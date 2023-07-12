package testngdisscusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import shortcut.WebOpenShotCut;

public class SoftAssertTestNg 
{
	WebDriver driver;
	@Test
	public void loginTest()
	{
		 driver = WebOpenShotCut.launchbrowser("https://www.amazon.com");
		
		 driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		 driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
	     String titleofpage = driver.getTitle();
	     
	     System.out.println(titleofpage);
	     
//	     Applying Assertion
	     
	     System.out.println("Before Assertion code");

	     SoftAssert sa = new SoftAssert();
	    
	     sa.assertEquals(titleofpage, "Amazon.com : mobiile");
	    
	     sa.assertAll();
	    
	     System.out.println("After Assertion code");
	     
	     
	     

}
}
