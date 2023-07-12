package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class TestngUsingSelenium 
{
	public WebDriver driver;
	
	@Test(priority=1)
	public void home() 
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
    }
	@Test(priority=2,dependsOnMethods = {"home"})
	public void facebook() throws InterruptedException
	{
		WebElement fb= driver.findElement(By.xpath("//*[@name='q']"));
		
		fb.sendKeys("facebook");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//*[@id='ERWdKc']"));
		
		Actions act = new Actions(driver);
		 act.moveToElement(search).click().perform();
	}
	
	@Test(priority=3)
	public void enter()
	{
		driver.findElement(By.xpath("//*[@class='CCgQ5 vCa9Yd QfkTvb N8QANc MUxGbd v0nnCb']")).click();	}

}
