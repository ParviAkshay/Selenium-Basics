package pageclasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCard
{WebDriver driver;
JavascriptExecutor js;
WebDriverWait wait;

@FindBy(xpath="(//*[@class='nav-item d-flex dropdown dropdown-on-hover position-static'])[6]")
WebElement winesearch;

@FindBy (xpath="(//*[@class='list-unstyled']//*[text()='White Wine'])[1]")
WebElement whitewine;

@FindBy(xpath="//*[@id='term-255']")
WebElement brand;

@FindBy (xpath="//*[@id='term-4']")
WebElement grape;

@FindBy(xpath="//*[@id='term-7']")
WebElement grapetype;

@FindBy(xpath="//*[@id='term-516']")
WebElement region;

@FindBy(xpath="//*[@id='term-911']")
WebElement size;

@FindBy(xpath="//*[@id='term-23']")
WebElement style;

@FindBy(xpath="//*[@id='term-242']")
WebElement types;

@FindBy(xpath="//*[text()='APPLY']")
WebElement applybutton;

@FindBy(xpath="//*[text()='ADD TO CART']")
WebElement addtocardbutton;

	
	public AddToCard(WebDriver driver)
	{
this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		js = (JavascriptExecutor)driver;
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	}
	
	public void seachIteams() throws InterruptedException  
	{
        winesearch.click();
		
		whitewine.click();
		
		brand.click();
		
		grape.click();
		
		grapetype.click();
		Thread.sleep(2000);
	
		js.executeScript("window.scrollBy(0,600);");
		
		Thread.sleep(2000);
		
		region.click();
		
		size.click();
		
		style.click();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400);");
		types.click();
	}
	
	public void addToCardIteam() throws InterruptedException
	{
		Thread.sleep(2000);
		applybutton.click();
	
		Thread.sleep(2000);
		addtocardbutton.click();
	}
	
}
