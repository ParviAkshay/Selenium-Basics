package testngdisscusion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class AssignmentSS1 
{
	static WebDriver  driver;
	
	@Test
	public void searchFlight() throws InterruptedException
	{
		 driver = WebOpenShotCut.launchbrowser("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		
		WebElement searchbutton = driver.findElement(By.xpath("//*[text()='Search1']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", searchbutton);
	
	}
	
}
