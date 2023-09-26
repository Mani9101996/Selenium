package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Launch {
	@Test
	public void Launch() throws InterruptedException {
		
			System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe"); 
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			driver.manage().window().maximize();
			//driver.findElement(By.className("name")).sendKeys("maniteja");
			//firstname
			driver.findElement(By.xpath("//label[text()='First Name ']/following::input[1]")).sendKeys("Mani Teja");
			Thread.sleep(3000);
			//lastname
			driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]")).sendKeys("Vajinapally");
			Thread.sleep(3000);
			//emailid
			driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("maniteja9101996@gmail.com");
			Thread.sleep(3000);
			//password
			driver.findElement(By.xpath("//label[text()='Repeat Password']/preceding-sibling::div/input")).sendKeys("Mani@12345");
			Thread.sleep(3000);
			//repeat password
			driver.findElement(By.xpath("//label[text()='Repeat Password']/following::input[1]")).sendKeys("Mani@12345");
			Thread.sleep(3000);
			//register
			driver.findElement(By.xpath("//label[text()='Repeat Password']/following::div/button[text()='Register']")).sendKeys("Mani@12345");
			Thread.sleep(3000);
//			driver.findElement(By.xpath("//button[text()='Register']")).click();
//			Thread.sleep(3000);
			//Clear
			driver.findElement(By.xpath("//button[text()='Reset']/preceding::button[1]")).click();
			Thread.sleep(3000);
			//reset
			driver.findElement(By.xpath("//div[@class='container']/child::div/button[3]")).click();
			Thread.sleep(3000);
			//refresh
			driver.findElement(By.xpath("//button[text()='Clear']/following::input[1]")).click();
			//reset
			driver.findElement(By.xpath("//div[@class='container signin']/preceding::div/button[3]")).click();
			Thread.sleep(3000);
			
			//Sign In
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();
			Thread.sleep(3000);
			//webDriver.navigate().back();
			//driver.execute_script("window.history.go(-1)");
			driver.navigate().back();
			Thread.sleep(3000);
			driver.quit();
		
	}

}
