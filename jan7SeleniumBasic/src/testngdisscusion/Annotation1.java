package testngdisscusion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 
{
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@Test
	public void Testcase1() 
	{
		System.out.println("Test Case 1");
	}
	
	@Test
	public void Testcase2()
	{
		System.out.println("Test case 2");
	}

}
