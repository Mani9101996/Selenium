package screenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerClass extends BaseClass implements ITestListener{

	@Test
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test is Failed");
		
		try {
			capturescreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
}
