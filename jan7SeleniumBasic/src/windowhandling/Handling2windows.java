package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling2windows 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
			
		String parentwindowid = driver.getWindowHandle();
	
	    System.out.println("Parent Window Id : "+parentwindowid);
	
	    driver.findElement(By.xpath("//*[@id='terms-link']")).click();
	    
	    Set<String> allwindowsid = driver.getWindowHandles();
	  
	    for(String ids:allwindowsid)
	    {
	    	System.out.println(ids);
	    	
	    	if(!(parentwindowid.equals(ids)))
	    	{
	    		driver.switchTo().window(ids);
	    	}
	    		
	    	
	    }
	    
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Velocity");
	    
	}

}
