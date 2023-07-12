package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement username = driver.findElement(By.name("email"));
		
		username.sendKeys("rock@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("12345");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1500);
		
		driver.close();
		
		
	}

}
