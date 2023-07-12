package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class FluentWaits 
{
	@Test
	public void validateCheckBox()
	{
		WebDriver driver = WebOpenShotCut.launchbrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
	
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
										.pollingEvery(Duration.ofMillis(120))	
										.withTimeout(Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
//		Alert opens in : 5 Seconds
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
											.pollingEvery(Duration.ofMillis(150))
											.withTimeout(Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		
	
	}

}
