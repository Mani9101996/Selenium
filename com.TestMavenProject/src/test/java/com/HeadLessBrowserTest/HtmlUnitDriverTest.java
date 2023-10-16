package com.HeadLessBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {
	@Test	
	public void headLessBrowserTest() {
			 
		  WebDriver driver = new HtmlUnitDriver();
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("Test");
		  String titleString=driver.getTitle();
		  System.out.println("Page title is: "+titleString);
		  String urlString=driver.getCurrentUrl();
		  System.out.println("Page URL is: "+urlString);
		  driver.quit();
		 }
		}

	
