package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class AmazonTestNgAndSelenium 
{
	WebDriver driver;
	
	@Test
	public void url() throws InterruptedException
	{
		driver = WebOpenShotCut.launchbrowser("https://amazon.in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("shoes");
	}
    
	@Test
	public void search() 
	{
	   List<WebElement> list = driver.findElements(By.xpath("//*[@id='navbar']//*[@class='s-suggestion-container']"));
	   Actions act = new Actions(driver);
	   
        WebElement element = driver.findElement(By.xpath("(//*[@class='s-suggestion s-suggestion-ellipsis-direction'])[5]"));
	   
        act.moveToElement(element).click().build().perform();
	   
	for(WebElement totallist:list)
	{
		String list1 = totallist.getText();
		System.out.println(list1);
	}
	}
}