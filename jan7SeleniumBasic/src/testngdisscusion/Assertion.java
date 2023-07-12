package testngdisscusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class Assertion 
{
	WebDriver driver;
	
	@Test
	public void logintest() throws InterruptedException
	{
		driver = WebOpenShotCut.launchbrowser("https://www.amazon.in");
	    
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	}
	
	@Test
	public void search()
	{
		String title = driver.getTitle();
		
		System.out.println(title);
		
		boolean ispresent = title.contains("mobile");
		
		System.out.println(ispresent);
		
//		Applying assertions
		
		System.out.println("Before asserfion code");
		
		Assert.assertEquals(title, "Amazon.in : mobiile");
		
		System.out.println("After asserfion code");
		
	}

}
