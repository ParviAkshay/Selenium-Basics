package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsLocator 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		WebElement Country = driver.findElement(By.xpath("//button[contains(@type,'button')]"));
		
		Country.click();
	}

}
