package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunchInChrome {
@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.close();
		
	}

}
