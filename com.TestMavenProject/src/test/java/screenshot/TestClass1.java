package screenshot;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(screenshot.ListenerClass.class)
public class TestClass1 extends BaseClass{
@BeforeTest
public void setup()
{
	initialize();
}
@Test
public void testMethod() {
	   driver.findElement(null);
}

@AfterTest
public void tearDown() {
	driver.quit();
}
	
}
