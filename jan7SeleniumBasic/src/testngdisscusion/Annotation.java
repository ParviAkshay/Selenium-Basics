package testngdisscusion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation
{
	@BeforeMethod
	public void beforMethod()
	{
		System.out.println("Before Method ");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method ");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test Case 01 ");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test Case 02 ");
	}

}
