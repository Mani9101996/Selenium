package ParallelTestingDemo;

import org.testng.annotations.Test;

public class ClassE {
	@Test(threadPoolSize = 2, invocationCount = 3, timeOut = 1000)

	 public void testcase1() {

	  System.out.println("This is testcase1: "+Thread.currentThread().getId());
	 }
}
