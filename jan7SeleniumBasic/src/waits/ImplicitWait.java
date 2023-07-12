package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ImplicitWait 
{
	@Test
	public void clickOnLink()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("india");
	
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a//*[text()='Air India'])[1]")).click();
		
		
	
	}

}
