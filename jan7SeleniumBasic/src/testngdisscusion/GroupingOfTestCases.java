package testngdisscusion;

import org.testng.annotations.Test;

public class GroupingOfTestCases 
{
	@Test(priority=1,groups = {"sanity","funtional"})
	public void getDetails()
	{
		System.out.println("Get Details ");
	}
	
	@Test(priority=2,groups = "funtional")
	public void setDetails()
	{	
		System.out.println("Set Details");
	}

	@Test(priority=3,groups = {"regression","funtional"})
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=4,groups = "sanity")
	public void home()
	{
		
		System.out.println("home");
	}
	
	@Test(priority=5,groups = "funtional")
	public void profile()
	{
		System.out.println("profile");
	}
	
	@Test(priority=6,groups = {"sanity","regression"})
	public void logout()
	{
		System.out.println("logout");
	}
	
}
