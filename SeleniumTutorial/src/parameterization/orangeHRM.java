package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class orangeHRM {
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver.exe");
		System.out.println("webbrowser is launched");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("this is beforetest method");
		driver.get("https://auth.geeksforgeeks.org/");
		boolean image = driver.findElement(By.xpath("//a[normalize-space()='']//img")).isDisplayed();
		AssertJUnit.assertTrue(image);	
	}
	@Parameters({"username","password"})
	@Test	
	public void logintest(@Optional("admin")String uname,@Optional("admin123") String password) throws InterruptedException{
//	public void logintest(@Optional String uname,@Optional String password) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='luser']")).sendKeys(uname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(3000);
		boolean image1 = driver.findElement(By.xpath("//a[@id='glogin']")).isDisplayed();
		AssertJUnit.assertTrue(image1);
	}
	

	@AfterMethod

	public void tearDown()
	{
		System.out.println("This is After Test method");
		driver.close();
	}
}
