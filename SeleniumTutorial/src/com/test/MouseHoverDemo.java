package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo {
@Test
	public void MouseHoverDemo() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
	WebElement logoutoption = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
	Thread.sleep(3000);
	act.moveToElement(logoutoption).click().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	Thread.sleep(3000);
	driver.close();
	
	}

}
