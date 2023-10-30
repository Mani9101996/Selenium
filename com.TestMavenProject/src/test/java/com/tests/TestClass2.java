package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.utility.Log;

public class TestClass2 extends BaseClass{
	 @Test
	 public void wordPressTest() throws InterruptedException {
	//WebDriver driver = null;

	  Log.startTestCase("wordPressTest");
	  Log.info("Entering User Name");
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  Thread.sleep(3000);
	  Log.info("Entering User Password");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  Thread.sleep(3000);
	  Log.info("Click on Login Button");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();	
	  Thread.sleep(3000);
	  Log.info("Home Page");
	  Log.info("Get Current URL");
	  String urlString=driver.getCurrentUrl();
	  Log.info("Validate the URL");
	  String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  Assert.assertEquals(urlString, expectedURL);
	  Log.info("URL Matches");
	  Log.endTestCase("wordPressTest");
	 }

	}