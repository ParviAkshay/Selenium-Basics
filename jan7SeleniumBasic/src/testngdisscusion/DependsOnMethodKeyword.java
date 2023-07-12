package testngdisscusion;

import org.testng.annotations.Test;

public class DependsOnMethodKeyword
{
	@Test(priority=1)
	public void loginToApp()
	{
		System.out.println("login test case");
	}

	@Test(priority=100, dependsOnMethods = {"loginToApp"})
	public void homepage()
	{
		System.out.println("homepage test case");
		
	}
     
	@Test(priority=101, dependsOnMethods = {"homepage","loginToApp"})
	public void logOutToApp()
	{
		System.out.println("logout test case");
	}


	
	
//	@Test(priority=1)
//	public void loginToApp()
//	{
//		System.out.println("login test case");
//	}
//
//	@Test(priority=100, dependsOnMethods = {"loginToApp"})
//	public void homepage()
//	{
//		System.out.println("homepage test case");
//		throw new ArithmeticException();
//	}
//     
//	@Test(priority=101, dependsOnMethods = {"homepage","loginToApp"})
//	public void logOutToApp()
//	{
//		System.out.println("logout test case");
//	}
}
