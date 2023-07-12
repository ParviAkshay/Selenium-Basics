package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingJavaScreptExecutor 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
         WebElement clickelement = driver.findElement(By.xpath("//*[text()='Sign in securely']"));
		
//         clickelement.click();
         Thread.sleep(1000);
		
         js.executeScript("arguments[0].click()", clickelement);
	}

}
