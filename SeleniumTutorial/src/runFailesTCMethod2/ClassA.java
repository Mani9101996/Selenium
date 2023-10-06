package runFailesTCMethod2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	@Test(retryAnalyzer = RetryAnalyzerTest.class)
	public void Testcase1() {
		System.out.println("This is Test case 1");
		Assert.assertTrue(true);
	}

@Test
public void Testcase2() {
	System.out.println("This is Test case 2");
	Assert.assertTrue(false);
}
}
