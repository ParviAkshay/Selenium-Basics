package testclasses;

import org.testng.annotations.Test;

public class AddToCardTest extends BaseTest
{
	
	@Test(priority=4)
	public void selectIteam() throws InterruptedException
	{
		addtocard.seachIteams();
	}

	@Test(priority=5)
	public void verifyAddToCard() throws InterruptedException
	{
		addtocard.addToCardIteam();
	}
}
