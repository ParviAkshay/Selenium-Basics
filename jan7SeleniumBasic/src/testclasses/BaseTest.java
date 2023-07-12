package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageclasses.AddToCard;
import pageclasses.Search;
import pageclasses.SearchBox;
import pageclasses.Spirit;

public class BaseTest 
{ 
	static WebDriver driver;
	
	Search search;
	
	SearchBox searchbox;
	
	AddToCard addtocard;
	
	Spirit spirits;
	
	@BeforeSuite 
	public void initBrowser()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://livingliquidz.com/");
	}
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.close();
//	}
	
	@BeforeClass
	public void createObject()
	{
	  search = new Search(driver);
	  
	  searchbox = new SearchBox(driver);
	  
	  addtocard = new AddToCard(driver);
	  
	  spirits = new Spirit(driver);
	}

}

