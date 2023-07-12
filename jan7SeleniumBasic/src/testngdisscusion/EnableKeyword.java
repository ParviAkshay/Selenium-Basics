package testngdisscusion;

import org.testng.annotations.Test;

public class EnableKeyword 
{
	@Test(priority=1)
	public void login()
	{
	 System.out.println("login test case");
	}

	@Test (priority=-3)
	public void search()
	{
		System.out.println("search test case");
	}
	
	@Test(priority=4, enabled=false)
	public void home()
	{
		System.out.println("home test case");
	}
	
	@Test(priority=3)
	public void button()
	{
		System.out.println("button test case");
	}
	
	@Test(priority=2)
	public void logout()
	{
		System.out.println("logout test case");
	}
}
