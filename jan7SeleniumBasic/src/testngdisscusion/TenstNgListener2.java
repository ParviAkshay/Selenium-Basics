package testngdisscusion;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TenstNgListener2 implements ITestListener	 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	  System.out.println("Start "+result.getName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Success "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Fail "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Skipped "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Start "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("Finish "+context.getName());
	}

}
