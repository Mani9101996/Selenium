package ParallelTestingDemo;

import org.testng.annotations.Test;

public class ClassD {
	@Test

	 public void testcase1() {

	  System.out.println("This is testcase1: "+Thread.currentThread().getId());
	 }
	

@Test

public void testcase2() {

 System.out.println("This is testcase1: "+Thread.currentThread().getId());
}
}

