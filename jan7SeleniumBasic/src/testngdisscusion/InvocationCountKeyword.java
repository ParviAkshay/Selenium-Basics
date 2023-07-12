package testngdisscusion;

import org.testng.annotations.Test;

public class InvocationCountKeyword 
{
	@Test(priority=3)
	public void home()
	{
		System.out.println("home test case");
	}

	@Test(priority=-3)
    public void search()
    {
		System.out.println("search test case");
    }
    
	@Test(priority=-4)
	public void search2()
	{
		System.out.println("search2 test case");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("login test case");
	}
	
	@Test(priority=2,invocationCount = 3)
	public void logout()
	{
		System.out.println("logout test case");
	}

}
