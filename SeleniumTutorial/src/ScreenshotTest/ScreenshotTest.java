package ScreenshotTest;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

/////How to capture Screen Shot for failed test cases directly
public class ScreenshotTest {
	WebDriver driver;
	@Test
		public void setup() throws InterruptedException, IOException 
		{
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			System.out.println("webbrowser is launched");
			driver.manage().window().maximize();
			driver.get("https://amazon.in");	
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ScreenShot Demo");
			Thread.sleep(5000);
			Assert.assertTrue(false);		
			//Assert.assertTrue(true);		
			  File  f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					Files.copy(f,new File("C:\\Users\\manit\\git\\Selenium\\SeleniumTutorial\\Screenshot\\Screenshot3.png"));

				  driver.close();	
				 


}
}
