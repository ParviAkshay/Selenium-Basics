package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		WebElement fpw = driver.findElement(By.linkText("Forgot password?"));
		
		fpw.click();
		
//		WebElement Email = driver.findElement(By.id("useremail"));
//		
//		Email.sendKeys("Rohan");
		
		WebElement Passward = driver.findElement(By.id("userPassword"));
		
		Passward.sendKeys("12345");
		
		WebElement ConPass = driver.findElement(By.id("confirmPassword"));
		
		ConPass.sendKeys("54321");
		
		
		
	}

}
