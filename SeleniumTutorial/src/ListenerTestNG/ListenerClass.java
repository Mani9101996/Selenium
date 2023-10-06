package ListenerTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test Method " +result.getName()+ " Starts");	
	}
	@Override
	public void onTestSuccess(ITestResult result) { 
	System.out.println("Test Method " +result.getName()+ " Passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Test Method " +result.getName()+ " Failed");
	}
	public void OnTestSkipped(ITestResult result) {
	System.out.println("Test Method " +result.getName()+ " Skipped");

	}
	public void OnTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}
	public void OnStart(ITestContext context) {
	System.out.println("Test " +context.getName()+ " Starts");

	}
	public void OnFinish(ITestContext context) {
		System.out.println("Test " +context.getName()+ " Ends");

	}
	
	
	
}
