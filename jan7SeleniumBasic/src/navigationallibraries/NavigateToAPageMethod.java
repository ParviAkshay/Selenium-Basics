package navigationallibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAPageMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
//		both are use for navigate url
		
		driver.get("https://paytm.com/recharge");
		
		driver.navigate().to("https://paytm.com/recharge");
		
		
	}

}
