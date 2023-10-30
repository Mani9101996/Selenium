package com.baseClass;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.utility.Log;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	 public void beforeSuite() {
		  DOMConfigurator.configure("log4j.xml");
		  Log.info("This is beforeSuite Method");
		 }
	@BeforeMethod
	 public void setup() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  	}
	 
	 @AfterMethod
	 public void tearDown() {
	  driver.close();
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	  Log.info("This is afterSuite Method");
	 }
	}