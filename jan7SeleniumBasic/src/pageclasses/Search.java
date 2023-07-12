package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search 
{
	WebDriver driver;
	
	By searchbox =By.xpath("//*[@name='q']");
	
	By searresult = By.xpath("//*[@class='typeahead__list']//*[@class='title']");

public Search(WebDriver driver)
{
	this.driver= driver;
}

public void searchIteams(String searchtext)
{
	driver.findElement(searchbox).sendKeys(searchtext);
}

public String getTitleOfPage()
{
	String titleofpage=driver.getTitle();
	return titleofpage;
}
}
