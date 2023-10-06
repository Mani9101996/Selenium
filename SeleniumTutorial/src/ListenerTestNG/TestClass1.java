package ListenerTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
	@Test 
	public void TestCase5() {
		System.out.println("testclass5");
		Assert.assertTrue(true);
	}
@Test 
public void TestCase6() {
	System.out.println("testclass6");
	Assert.assertTrue(true);
}

}
