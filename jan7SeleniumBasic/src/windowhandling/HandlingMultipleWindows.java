package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
//		String parentid = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id='privacy-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='privacy-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='privacy-link']")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
	 	
	    int numberofwindow = allwindows.size();
	    
	   String [] windowarray = new String[numberofwindow];
	   
	   int i= 0;
	   
	   for(String winid:allwindows)
	   {
		   windowarray[i]=winid;
	   i++;
	   }
	driver.switchTo().window(windowarray[2]);
	
	driver.get("https://www.amazon.in");
	
	driver.quit();
	}

}
