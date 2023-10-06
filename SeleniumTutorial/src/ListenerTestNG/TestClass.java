package ListenerTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(ListenerClass.class)
public class TestClass {
	@Test 
	public void TestCase1() {
		System.out.println("testclass1");
		Assert.assertTrue(true);
	}
@Test 
public void TestCase2() {
	System.out.println("testclass2");
	Assert.assertTrue(true);
}
@Test 
public void TestCase3() {
	System.out.println("testclass3");
	Assert.assertTrue(false);
}
@Test(dependsOnMethods = "TestCase3")
public void TestCase4() {
	System.out.println("testclass4");
	Assert.assertTrue(false);
}
	
}
