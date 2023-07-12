package testclasses;

import org.testng.annotations.Test;

public class SpiritTest extends BaseTest
{
	@Test(priority=3)
	public void spiritClick() 
	{
		spirits.clickIteam();
	}

}
