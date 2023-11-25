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

public class WindowHandle3 {
@Test
	public  void WindowHandle2() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		String ParentWindowID = driver.getWindowHandle();
		System.out.println("the parentwindowid is:"+ ParentWindowID);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1500)", 0);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://www.naukri.com/mnc-jobs?src=discovery_trendingWdgt_homepage_srch']")).click();
		driver.findElement(By.xpath("//span[@title='Startup']")).click();
		//driver.findElement(By.xpath("//a[@title='Marketing']")).click();

		Set<String> allWindIds = driver.getWindowHandles();
		
		System.out.println(allWindIds);
		System.out.println("1");

		ArrayList<String> list = new ArrayList<>(allWindIds);
		for(int i=0;i<allWindIds.size(); i++) {
			WebDriver str = driver.switchTo().window(list.get(i));
			System.out.println(str);
		}
		
		System.out.println("2");

		//driver.switchTo().window(list.get(0));
		driver.quit(); 	
		
	}

}
