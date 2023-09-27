package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class OrangeHRMTest2 {
	WebDriver driver;
	
	@BeforeClass
	public void setup(){
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver.exe");
		System.out.println("webbrowser is launched");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority = -1,description = "Launch the application")	
	public void testcase1(){
		driver.get("https://auth.geeksforgeeks.org/");
		boolean image = driver.findElement(By.xpath("//a[normalize-space()='']//img")).isDisplayed();
		Assert.assertTrue(image);	
	}
	
	@Test(priority = 2,description = "entering text fields")		
	public void testcase2(){
		driver.findElement(By.xpath("//input[@id='luser']")).sendKeys("RajuAdmin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
		
		boolean image1 = driver.findElement(By.xpath("//a[@id='glogin']")).isDisplayed();
		Assert.assertTrue(image1);
	}
	
	//@Ignore
	@Test(priority = 3,description = "title test",dependsOnMethods = "testcase3",enabled = true,alwaysRun = true)		
	public void testcase4() throws InterruptedException {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Login GeeksforGeeks";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		}
	
	@Test(priority = 4,description = "verifying URl",invocationCount = 5)		
	public void testcase3() throws InterruptedException {
		String actualUrl = driver.getCurrentUrl();
		String expectedURL = "https://auth.geeksforgeeks.org/";
		Assert.assertEquals(actualUrl, expectedURL);
		
		}
	
	@Test(priority = 5,description = "Logout test")		
	public void testcase5() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(3000);
		String curURL = driver.getCurrentUrl();
		String ExpURl = "https://auth.geeksforgeeks.org/";
		Assert.assertEquals(curURL, ExpURl);

		}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}
