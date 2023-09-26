package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
@Test
	public void NavigationCommands() throws InterruptedException {
			System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
			System.out.println("webbrowser is launched");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			//Navigate to
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
			//backward
			driver.navigate().back();
			Thread.sleep(3000);
			
			//forward
			driver.navigate().forward();
			Thread.sleep(3000);
			
			//refresh
			driver.navigate().refresh();
			
			driver.close();
	}
}
