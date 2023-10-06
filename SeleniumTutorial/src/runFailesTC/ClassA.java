package runFailesTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
@Test
	public void Testcase1() {
		System.out.println("This is Test case 1");
		Assert.assertTrue(false);
	}

@Test
public void Testcase2() {
	System.out.println("This is Test case 2");
	Assert.assertTrue(false);
}

}
