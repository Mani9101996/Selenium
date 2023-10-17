package com.TestMavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLessChrome {
@Test
	public void headlessTest() throws IOException {
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
		System.out.println("webbrowser is launched");
	
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("headless");
		chromeoptions.addArguments("window-size=1200x600");
		
		WebDriver driver= new ChromeDriver(chromeoptions);
		driver.get("https://www.google.com/");
		  System.out.println("Test Start");
		  System.out.println("Google title is: "+driver.getTitle());
		  System.out.println("Test End");
		  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File("D:\\Workspace_Eclipse\\WebDriverConcept3\\ScreenShot\\test.png"));
		  driver.close(); 
		
		
		
		
	}
	
	
}
