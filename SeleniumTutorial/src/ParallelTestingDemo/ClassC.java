package ParallelTestingDemo;

import org.testng.annotations.Test;

public class ClassC {
	@Test

	 public void testcase3() {

	  System.out.println("This is testcase3: "+Thread.currentThread().getId());
	 }
	@Test

	public void testcase4() {

		  System.out.println("This is testcase4: "+Thread.currentThread().getId());

		 }
}
