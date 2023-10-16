package com.HeadLessBrowserTest;

import java.io.File;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {

	 @Test
	 public void headLessBrowserTest() {
	  File file = new File("\"D:\\Trainings & Learnings\\Selenium Project\\Selenium libraries\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\"");
	  System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
	  WebDriver driver = new PhantomJSDriver();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("Test");
	  String titleString = driver.getTitle();
	  System.out.println("Page title is: " + titleString);
	  String urlString = driver.getCurrentUrl();
	  System.out.println("Page URL is: " + urlString);
	  driver.quit();
	}
	 }

