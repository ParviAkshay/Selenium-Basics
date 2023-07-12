package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
//		1st method to select the value from select dropdown
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select selday = new Select(day);
		
		selday.selectByVisibleText("15");
		
//		2nd method to select the value from select dropdown
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selmonth = new Select(month);
		
		selmonth.selectByIndex(8);
		
//		3rd method to select the value from select dropdown
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select selyear = new Select(year);
		
		selyear.selectByValue("9");
		
		
	}

}
