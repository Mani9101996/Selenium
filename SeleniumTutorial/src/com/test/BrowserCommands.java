package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	@Test
	public void BrowserCommands() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		
		//get
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Url is launched");
		Thread.sleep(2000);
		
		//maximize window
		driver.manage().window().maximize();
		
		//delete Cookies
		driver.manage().deleteAllCookies();
		
		//get current URL
		String URL = driver.getCurrentUrl();
		System.out.println("the url is:"+URL);	
		if(URL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
		{
		System.out.println("Test Case Passed");
		}else
		{
			System.out.println("Test Case Failed");
		}
		Thread.sleep(2000);
		//get title
		String text = driver.getTitle();
		System.out.println("The title name is:"+text);
		Thread.sleep(2000);
		
		//get page source
		driver.getPageSource();
		Thread.sleep(2000);
		
		//close
		driver.close();
		
		//quit
		driver.quit();
	}
	
	
	
	


}
