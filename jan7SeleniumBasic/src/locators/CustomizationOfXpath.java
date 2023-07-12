package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizationOfXpath 
{
	public static void main(String[] args)
	{
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com/signup");
	 
//		contains()
	 
	 WebElement firstname = driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]"));
	
	 firstname.sendKeys("Akshay Parvi");
	 
//	 indexing
	 
	WebElement mobile = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
	 
	mobile.sendKeys("8767676545");
	
//	text()
	
	WebElement text = driver.findElement(By.xpath("//div[text()='Create a new account']"));
	
	String textvalue = text.getText();
	
	System.out.println(textvalue);
	
	
	}

}
