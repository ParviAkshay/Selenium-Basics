package actionclass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		String expectedmonth = "June 2022";
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		 
		while(true)
		{
			String months = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
		if(!(months.equals(expectedmonth)))
		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else
		{
			break;
		}
		
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']"));
	   
		Thread.sleep(2000);
		
		for(int i=0; i<list.size(); i++)
		{
			driver.findElement(By.xpath("//*[@class=' ']//*[text()='13']")).click();
		}
	
	}

}
