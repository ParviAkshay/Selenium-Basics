package testngdisscusion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 
{
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After suite");
	}
	@Test
	public void TestCase3()
	{
		System.out.println("Test Case 3");
	}

}
