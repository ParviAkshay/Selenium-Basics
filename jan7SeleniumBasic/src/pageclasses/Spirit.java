package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spirit
{
	WebDriver driver;
	
	
	 @FindBy(xpath="(//*[normalize-space(text())='SPIRITS'])[2]")
	 WebElement spiritbutton;
	
	
	@FindBy(xpath="(//*[text()='Malt Whiskey'])[2]")
	WebElement maltwiskey;
	
	@FindBy(xpath="//*[@id='term-656']")
	WebElement brand;
	
	@FindBy(xpath="//*[@id='term-5']")
	WebElement size;
	
	public Spirit (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void clickIteam()
	{
		spiritbutton.click();
		maltwiskey.click();
		brand.click();
		size.click();
	}
}
