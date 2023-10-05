package com.CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v115.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserDemo {

	//purpose --expose errors in front end functionality

	WebDriver driver;
	 @Parameters("browser")
	 @Test

	 public void launchApp(String browser) throws InterruptedException {
	  if (browser.equalsIgnoreCase("Chrome")) {

	   System.setProperty("webdriver.chrome.driver",

	     "D:\\Trainings & Learnings\\Selenium Project\\Selenium browser drivers\\chromedriver-win64\\chromedriver.exe");

	   driver = new ChromeDriver();

	  } else if (browser.equalsIgnoreCase("Edge")) {

	   System.setProperty("WebDriver.Edge.driver",

			   "D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");

	   driver = new EdgeDriver();

	  }

	  driver.manage().window().maximize();

	  driver.get("https://www.automationtestinginsider.com/");

	  Thread.sleep(2000);

	  driver.close();

	 }
		

}
	

