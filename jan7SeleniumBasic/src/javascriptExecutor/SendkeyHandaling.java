package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SendkeyHandaling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
// using normal sendkey method
		
//		driver.findElement(By.xpath("//div//*[@id='pass']")).sendKeys("ppshirbhate123@gmail.com");
		
//	using action class	
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//div//*[@id='email']"));
//		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys("pShirbhate@gmail.com").sendKeys(Keys.TAB).sendKeys("P123455").build().perform();	
//		
//		Thread.sleep(2000);
//		
//		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
//		.sendKeys(Keys.ENTER).build().perform();
		
//  javascriptexecutor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement search = driver.findElement(By.xpath("//div//*[@id='email']"));
		
		js.executeScript("arguments[0].value='pppshirbhate@gmail.com'", search);
		
		
		
		
	}

}
