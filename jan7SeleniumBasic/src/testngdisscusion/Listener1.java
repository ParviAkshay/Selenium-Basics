package testngdisscusion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener1
{

	@Test(priority=1)
	public void getDetails()
	{
		System.out.println("getDetails");
	}
	
	@Test(priority=2)
	public void setDetails()
	{
		System.out.println("setDetails");
		
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=3,dependsOnMethods = "setDetails")
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=4)
	public void home()
	{
		System.out.println("home");
	}
	
	@Test(priority=5,dependsOnMethods = "login")
	public void logout()
	{
		System.out.println("logout");
	}

}
