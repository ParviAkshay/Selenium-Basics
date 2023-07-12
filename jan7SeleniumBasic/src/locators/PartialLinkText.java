package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		WebElement fpw = driver.findElement(By.partialLinkText("Forgot passw"));
		
		fpw.click();
		
	}

}
