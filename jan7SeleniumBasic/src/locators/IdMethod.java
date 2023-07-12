package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
	 WebElement cardclick = driver.findElement(By.id("nav-cart")); 
		
	  cardclick.click();
	  
	  WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	 
	  search.sendKeys("Men Shirt");
	  
	  WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
	  
	  searchbutton.click();
	  
	  Thread.sleep(2000);
	  
	  driver.close();
	  
	}

}
