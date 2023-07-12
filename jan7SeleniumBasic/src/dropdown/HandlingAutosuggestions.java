package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutosuggestions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> search = driver.findElements(By.xpath("//*[text()='selenium']"));
		
//		for(int i=0; i<search.size(); i++)
//		{
//			String searchvalue = search.get(i).getText();
//			
//			System.out.println(searchvalue);
//		}
			
		for(WebElement ser : search)
		{
			String serelement = ser.getText();
			System.out.println(serelement);
		}
				
				
				
		
	}

}
