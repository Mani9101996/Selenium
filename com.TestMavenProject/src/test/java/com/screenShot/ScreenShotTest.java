package com.screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTest {
WebDriver driver;

@Test
	public void testcase1() throws InterruptedException {
	
	System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
	//System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
	System.out.println("webbrowser is launched");
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.name("q")).sendKeys("ScreenShot Demo");		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  try {
			   FileUtils.copyFile(source, new File(System.getProperty("C:\\Users\\manit\\git\\repository\\com.TestMavenProject\\ScreenShot\\ScreenShot1.png")));
			  } catch (Exception e) {
			   // TODO Auto-generated catch block
			   e.getMessage();
			  }
		  Thread.sleep(5000);
  driver.close();
	}
}
