package dropdown;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/recharge");
		
		driver.findElement(By.xpath("//*[@class='_1exI']//*[@type='text']")).click();
		
		driver.findElement(By.xpath("//*[@class='_3xI1']//*[text()='BSNL']")).click();
		
		
	}

}

