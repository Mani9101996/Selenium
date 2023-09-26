package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AxesDemo {
	@Test
	public  void AxesDemo() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		//Launch		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Url is launched");
		Thread.sleep(2000);
		
		//Ancestor
		driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']/ancestor::div[@id='app']"));
		Thread.sleep(3000);		
		
		//parent
		driver.findElement(By.xpath("//input[@id='pass' and @title='Password']/parent::div[@class='userform']"));
		Thread.sleep(3000);
		
		//child
		driver.findElement(By.xpath("//td[@class='left']/child::a[text()='Jasmine.Morgan']"));
		Thread.sleep(3000);

		//following
		driver.findElement(By.xpath("//a[text()='Jasmine.Morgan']//following::td[17]"));
		//thead/following::a[text()='Joe.Root']
		//thead/following::tbody//*[text()='Jordan.Mathews']
		Thread.sleep(3000);
		
		//following-sibling
		driver.findElement(By.xpath("//td[text()='Admin']/following-sibling::td[text()='Enabled']"));
		Thread.sleep(3000);
		
		//preceding
		driver.findElement(By.xpath("//td[text()='Admin']/preceding::td[text()='Enabled'][1]"));
		Thread.sleep(3000);
		
		//preceding sibling
		driver.findElement(By.xpath("//td[text()='Admin']/preceding-sibling::td[1]"));
		
		//descendant
		driver.findElement(By.xpath("//td[@class='left']/child::a[text()='Jasmine.Morgan']"));
		Thread.sleep(3000);
		
		//self
		driver.findElement(By.xpath("//input[@id='userId']/self::input[@id='userId']"));
		//input[@id='userId']/self::*
		Thread.sleep(3000);
	}


}
