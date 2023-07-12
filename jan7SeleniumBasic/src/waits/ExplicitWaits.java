package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class ExplicitWaits 
{
	@Test
	public void expilicitWaits()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//		The button will be enabled in 10 Seconds
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
//		Alert opens in : 5 Seconds
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		WebDriverWait Wait1 = new WebDriverWait(driver, Duration.ofSeconds(120));
		
		Wait1.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
//	Selenium Webdriver will be populated inplace of "site" 10 Seconds
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		wait2.until(ExpectedConditions.textToBe(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
	
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
//		The button will be Displayed in 0 Seconds
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		WebElement enabletext = driver.findElement(By.xpath("//*[@id='hidden']"));
		
		wait3.until(ExpectedConditions.visibilityOf(enabletext));
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
//		The checkbox will be checked in 0 Seconds
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait4.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id='ch']")));
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
	}

}
