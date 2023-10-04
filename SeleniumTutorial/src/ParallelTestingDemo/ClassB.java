package ParallelTestingDemo;

import org.testng.annotations.Test;

public class ClassB {
	@Test

	public void testcase1() {

		  System.out.println("This is testcase1: "+Thread.currentThread().getId());

		 }
	
	@Test

	public void testcase2() {

		  System.out.println("This is testcase2: "+Thread.currentThread().getId());

		 }	
}
