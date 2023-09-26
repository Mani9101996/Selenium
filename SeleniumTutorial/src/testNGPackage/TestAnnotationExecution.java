package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationExecution {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite is executed");
	}
	@AfterSuite
	public void aftersuitee() {
		System.out.println("after suite is executed");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test is executed");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test is executed");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class is executed");
	}
	@AfterClass
	public void AterClass() {
		System.out.println("after class is executed");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method is executed");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method is executed");
	}
	
	@Test
	public void testmethod1() {
		System.out.println("test method1 is executed");
	}
	@Test
	public void testmethod2() {
		System.out.println("test method2 is executed");
	}
	
}
