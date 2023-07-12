package testngdisscusion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestTag1
{
	static WebDriver driver;
 @Test(priority=1)
 public void testcase1()
 {
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.makemytrip.com");
 }
 
 @Test(priority=2)
 public void testcase11()
 {
	 driver.findElement(By.xpath("//*[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
 }
}
