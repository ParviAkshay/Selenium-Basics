package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class WebTablePractice 
{
	@Test
	public void getAllValue()
	{
		int i=1; 
		
		WebDriver driver=WebOpenShotCut.launchbrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
	
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='customers']//tbody//tr//td"));
		
		for(WebElement w: element)
		{
			String text=w.getText();
			
			System.out.print(text+" ");
			
			if (i==3)
			{
				System.out.println();
				System.out.println();
				i=1;
			}
			else
			{
				i++;
			}
		}
	
	}

}
