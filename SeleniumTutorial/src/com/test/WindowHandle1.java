package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowHandle1 {
@Test
	public  void WindowHandle1() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/p/java-qa.html");
		Thread.sleep(3000);
		
		String ParentWindowID = driver.getWindowHandle();
		System.out.println("the parentwindowid is:"+ ParentWindowID);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", 0);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Java Questions Part1 - Basic Questions']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Java Questions Part2 - OOPS Concept, Constructors,')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Java Questions Part3 - Exception Handling and Mult')]")).click();

		
		
		

		Set<String> allWindIds = driver.getWindowHandles();
		System.out.println("Total Window size:" +allWindIds.size());
		System.out.println("all windows Ids are:-");
		for(String allIds:allWindIds) {
			System.out.println(allIds);
		}
		
		Iterator<String> itr = allWindIds.iterator();
		while(itr.hasNext()) {
			String childWindID = itr.next();
			if(!ParentWindowID.equalsIgnoreCase(childWindID)) {
				driver.switchTo().window(childWindID);
				System.out.println("child window Id is:" + childWindID);
				System.out.println("child window url is:" + driver.getCurrentUrl());
				System.out.println(("child window title is:" + driver.getTitle()));
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindowID);		
		driver.quit();
		
	}

}
