package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CSSDemo {
	@Test
	public void CSSDemo() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		//Launch		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Url is launched");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Admin");
	//	driver.findElement(By.cssSelector("input[name^=usern]")).sendKeys("Admin");
	//	driver.findElement(By.cssSelector("input[name*=usern]")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=password][name=password]")).sendKeys("admin123");
	//	driver.findElement(By.cssSelector("input[type=password][name$='word']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	//	driver.findElement(By.cssSelector("button[type*='mit']")).click();
		Thread.sleep(4000);
		driver.close();
}
}
