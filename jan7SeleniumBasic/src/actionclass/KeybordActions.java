package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordActions 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//*[@name='firstname']")).click();
		
		Actions act = new Actions(driver);
		
		act.sendKeys("Velocity").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Corporate").
		
		sendKeys(Keys.TAB).sendKeys("9898989876").
		
		sendKeys(Keys.TAB).sendKeys("ABC1234").build().perform();
		
	}

}
