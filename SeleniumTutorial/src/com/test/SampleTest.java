package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver;
	
	@Test
		public void testcase1() throws InterruptedException {
		System.out.println("This is through Edge browser verification");
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		}
	@Test
		public void testcase2() throws InterruptedException {
		System.out.println("This is through Chrome browser verification");
		System.setProperty("WebDriver.Edge.driver","D://Softwares//Browser Drivers/msedgedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();	
		}
}
