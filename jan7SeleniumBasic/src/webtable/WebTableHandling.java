package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import shortcut.WebOpenShotCut;

public class WebTableHandling 
{
	@Test
	public void getAllValue()
	{
		WebDriver driver = WebOpenShotCut.launchbrowser("https://demo.guru99.com/test/web-table-element.php");
	
		int i=1;
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
	
		for(WebElement w:elements)
		{
			String allelements = w.getText();
			
//			System.out.println(allelements);
			
			System.out.print(allelements+" ");
			
			if(i==5)
			{
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

