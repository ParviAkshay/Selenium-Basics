package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		
		String alearttext = driver.switchTo().alert().getText();
		
	    System.out.println(alearttext);
	    
	    driver.switchTo().alert().accept();
	
	}

}
