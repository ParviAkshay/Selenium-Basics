package navigationallibraries;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalbasics 
{
	public static void main(String[] args) 
	{
// launch browser		
	 ChromeDriver driver = new ChromeDriver();
	 
// maximize the browser
	 
	 driver.manage().window().maximize();
	 
// Navigate the url
	 
	 driver.get("https://www.youtube.com");

// Navigate to another url
	 
	 driver.get("https://www.flipkart.com");
	 
//  Perform back operation
	 
	 driver.navigate().back();
	 
// Perform forward operation
	 
	 driver.navigate().forward();
	 
// perform refresh operation
	 
	 driver.navigate().refresh();
	 
// Perform browser closed
	 
	 driver.close();
	 
	 
	 
		
	}

}
