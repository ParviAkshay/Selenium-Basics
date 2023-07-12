package navigationallibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonXPathLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("men shirt");
		
		Thread.sleep(1000);
		
		WebElement search1 = driver.findElement(By.id("nav-search-submit-text"));
		
		search1.click();
		
		Thread.sleep(1000);
		
		WebElement brand = driver.findElement(By.id("p_89-title"));
		
		brand.click();
		
		Thread.sleep(1000);
		
		WebElement brand1 = driver.findElement(By.id("p_89/Amazon Brand - Inkast Denim Co."));
		
		brand1.click();
		
		Thread.sleep(1000);
		
		WebElement price = driver.findElement(By.id("p_36-title"));
		
		price.click();
		
		Thread.sleep(1000);
		
		WebElement price1 = driver.findElement(By.id("p_n_specials_match/21618256031"));
		
		price1.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
