package popuphandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class AmazonExplicitWaits 
{
	@Test
	public void carouselTest()
	{
//	WebDriver driver = new ChromeDriver();
//	
//	driver.manage().window().maximize();
//	
//	driver.get("https://www.amazon.in/");
//	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nFISUYKD-7Tm9yPEUQ-kzQ']")));
//	
//	WebElement carouselselecte = driver.findElement(By.xpath("//*[@id='nFISUYKD-7Tm9yPEUQ-kzQ']"));
//	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	
//	js.executeScript("arguments[0].click()", carouselselecte);
	
	WebDriver driver = WebOpenShotCut.launchbrowser("https://www.amazon.in/");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='a-carousel']//*[@class='a-link-normal'])[4]")));
	
	WebElement carouselelement = driver.findElement(By.xpath("(//*[@class='a-carousel']//*[@class='a-link-normal'])[4]"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", carouselelement);

	
	

}
}

