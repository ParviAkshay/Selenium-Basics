package navigationallibraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> yearelements = driver.findElements(By.xpath("//*[@id='year']//option"));
	
//		total element size
		int numberofelement = yearelements.size();
		
//		iterate start to end all values available in dropdown
		for(int i=0; i<numberofelement; i++)
		{
			WebElement element = yearelements.get(i);
			String yearvalue = element.getText();
			System.out.println(yearvalue);
		}
       

		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		for(int j=0; j<days.size(); j++)
		{
			String daysvalue = days.get(j).getText();
		    System.out.println(daysvalue);
		}
		
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
	     
		for(int k=0; k<months.size(); k++)
		{
		String element = months.get(k).getText();
			
			System.out.println(element);
			
		}
	
	}

}
