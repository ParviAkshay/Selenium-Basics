package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox
{
	WebDriver driver;
	
	@FindBy(xpath="(//*[@class='nav-item d-flex dropdown dropdown-on-hover position-static'])[6]")
	WebElement winesearch;
	
	@FindBy (xpath="(//*[text()='White Wine'])[1]")
	WebElement whitewine;

public SearchBox(WebDriver driver)
{
	this.driver= driver;
	
	PageFactory.initElements(driver, this);
}

public void SearchElement()
{
	winesearch.click();
	
	whitewine.click();
}

}