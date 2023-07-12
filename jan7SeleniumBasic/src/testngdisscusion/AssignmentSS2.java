package testngdisscusion;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import actionclass.ScreenShot;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import shortcut.ScreenShort;

public class AssignmentSS2 extends AssignmentSS1 implements ITestListener
{

	

	@Override
	public void onTestFailure(ITestResult result)
	{
	System.out.println("Test case "+result.getName()+" has failed");
	
	try {
		ScreenShort.screenshot(driver, result.getName()+1);
	} catch (IOException e) {
		System.out.println("Exception arrived while capturing the screenshot");
	}

		
		
	}

	
	
}
