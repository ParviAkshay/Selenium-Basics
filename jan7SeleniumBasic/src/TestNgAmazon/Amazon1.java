package TestNgAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class Amazon1 
{
	static WebDriver driver;
	
	@Test(priority=1)
	public void navToUrl()
	{
		driver = WebOpenShotCut.launchbrowser("https://www.amazon.in");
	}
	
	@Test(priority=2)
	public void loginToApp() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
	Thread.sleep(2000);
	}

}
