package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		WebElement email = driver.findElement(By.className("btn1"));
		
		email.click();
		
		WebElement FirstName = driver.findElement(By.id("firstName"));
		
		FirstName.sendKeys("Ram");
		
		WebElement LastName = driver.findElement(By.id("lastName"));
		
		LastName.sendKeys("Kulkarni");
		
		WebElement Email = driver.findElement(By.id("userEmail"));
		
		Email.sendKeys("RK@gmail.com");
		
		WebElement PhoneNo = driver.findElement(By.id("userMobile"));
		
		PhoneNo.sendKeys("8765435678");
		
		
		
		
		
		
	}

}
