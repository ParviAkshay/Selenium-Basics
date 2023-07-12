package testclasses;

import org.testng.annotations.Test;

import pageclasses.SearchBox;

public class SearchTestCase extends BaseTest
{
	@Test
	public void SearchProduct()
	{
		searchbox.SearchElement();
	}

}
