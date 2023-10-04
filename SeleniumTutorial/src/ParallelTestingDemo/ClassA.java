package ParallelTestingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ClassA {
	WebDriver driver;
@Test
	public void testcase1() throws InterruptedException {
		System.out.println("This is testcase1: "+Thread.currentThread().getId());
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		//driver.close();
}
	
	@Test
	public void testcase2() throws InterruptedException {
		System.out.println("This is testcase2: "+Thread.currentThread().getId());
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/Mani9101996");
		Thread.sleep(3000);
		//driver.close();
}
	
	public class ClassB {

		 @Test
		 public void testCase3() {

		  System.out.println("This is testcase3: "+Thread.currentThread().getId());

		 }
		 @Test

		 public void testCase4() {

		  System.out.println("This is testcase4: "+Thread.currentThread().getId());
		 }
		 }
}

