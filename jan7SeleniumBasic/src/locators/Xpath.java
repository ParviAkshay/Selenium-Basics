package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.manage().window().maximize();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@type='email']"));
		
		UserName.sendKeys("shyam@gmail.com");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		Pass.sendKeys("12345");
		
		WebElement Login = driver.findElement(By.xpath("//input[@value='Login']"));
		
		Login.click();
		
		Thread.sleep(3000);
		
		WebElement fpw = driver.findElement(By.linkText("Forgot password?"));
		
		fpw.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		
		Email.sendKeys("ram123@gmail.com");
		
		WebElement Passward = driver.findElement(By.xpath("//input[@id='userPassword']"));
	 
	    Passward.sendKeys("67890");
	    
	    WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@type='password']"));
	    
	    ConfirmPassword.sendKeys("12345678");
	    
	    WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
	
	    save.click();
	}

}
