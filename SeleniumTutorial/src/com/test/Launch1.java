	package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Launch1 {
	@Test
	public void TestLaunch() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver();
		//Launch		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("Raju@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Password@12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
