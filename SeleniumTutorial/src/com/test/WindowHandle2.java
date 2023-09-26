package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowHandle2 {
@Test
	public  void WindowHandle2() throws InterruptedException {
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
		
		ArrayList<String> list = new ArrayList<>(allWindIds);
		driver.switchTo().window(list.get(0));
		driver.close(); 	
		
	}

}
