package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in");
		
		driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Login/Register']")).click();
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("Velocity@pune.com");
		
		driver.findElement(By.xpath("//*[@class='lils382ContinueBtn']")).click();
		
		
		
	}

}
