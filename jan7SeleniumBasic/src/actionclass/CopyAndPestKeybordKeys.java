package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPestKeybordKeys 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		Actions act = new Actions(driver);
		
		act.click(firstname).perform();
		
		act.sendKeys("velocity")
		.keyDown(Keys.CONTROL).sendKeys("a")
		.keyUp(Keys.CONTROL)
		.keyDown(Keys.CONTROL).sendKeys("c")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.TAB)
		.keyDown(Keys.CONTROL).sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		
		
		

		
	}
	
}
