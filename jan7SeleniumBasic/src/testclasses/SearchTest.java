package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest
{
	@Test(priority=1)
	public void verifyTitle()
	{
		String title= search.getTitleOfPage();
		
		boolean ispresent =title.contains("Mumbai");
		
		Assert.assertEquals(ispresent, true);
	}
	
		@Test(priority=2)
		public void searchProduct()
		{
		search.searchIteams("malt");
		}

}
