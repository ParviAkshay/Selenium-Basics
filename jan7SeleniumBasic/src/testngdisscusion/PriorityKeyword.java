package testngdisscusion;

import org.testng.annotations.Test;

public class PriorityKeyword 
{
	@Test(priority = 2)
	public void home()
	{
		System.out.println("Home test case");
	}
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
	}
	
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("Logout test case");
	}

}
