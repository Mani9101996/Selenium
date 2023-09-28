package testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
@Test
public class OrangeHRMTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup(){
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver.exe");
		System.out.println("webbrowser is launched");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//@Test	
	public void launchapp(){
		driver.get("https://auth.geeksforgeeks.org/");
		boolean image = driver.findElement(By.xpath("//a[normalize-space()='']//img")).isDisplayed();
		AssertJUnit.assertTrue(image);	
	}
	
//	@Test	
	public void loginTest(){
		driver.findElement(By.xpath("//input[@id='luser']")).sendKeys("RajuAdmin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
		
		boolean image1 = driver.findElement(By.xpath("//a[@id='glogin']")).isDisplayed();
		AssertJUnit.assertTrue(image1);
	}
	
//	@Test	
	public void currentURL() throws InterruptedException {
		String actualUrl = driver.getCurrentUrl();
		String expectedURL = "https://auth.geeksforgeeks.org/";
		AssertJUnit.assertEquals(actualUrl, expectedURL);
		
		}
	
//	@Test	
	public void titleTest() throws InterruptedException {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Login GeeksforGeeks";
		AssertJUnit.assertEquals(ActualTitle, ExpectedTitle);
		}
	
//	@Test	
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(3000);
		String curURL = driver.getCurrentUrl();
		String ExpURl = "https://auth.geeksforgeeks.org/";
		AssertJUnit.assertEquals(curURL, ExpURl);

		}
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}
