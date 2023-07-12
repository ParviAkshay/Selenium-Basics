package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverByAmazon {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement hover = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hover).perform();
		
		driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']")).click();

//		right click using action class
		
//	    WebElement continuebutton = driver.findElement(By.xpath("//*[@id='continue-announce']"));
//		
//		act.contextClick(continuebutton).perform();
		
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("7709963554");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='continue']//*[@class='a-button-inner']")).click();
	
        driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("7709963554");
        
        driver.findElement(By.xpath("//*[@id='auth-signin-button']")).click();
	}

}
