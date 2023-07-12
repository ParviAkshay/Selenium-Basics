package shortcut;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonUsingShotMethodAndTestNG 
{
	WebDriver driver;
	@Test(priority=1)
	public void search()
	{
		driver = WebOpenShotCut.launchbrowser("https://www.amazon.in");
		
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
	}
	
	@Test(priority=2)
	public void email()
	{
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("7709963554");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	}
	
	@Test(priority=3)
	public void password()
	{
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("7709963554");
     	driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	}

}
