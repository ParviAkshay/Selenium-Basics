package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) {
//		mouse hover
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='sub-menu']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hoverelement).perform();
		
	}

}
