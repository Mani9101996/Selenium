package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
@Test
	public  void WindowHandle() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
	//	driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.get("https://www.naukri.com/");
	
		Thread.sleep(3000);
		
		String ParentWindowID = driver.getWindowHandle();
		System.out.println("the parentwindowid is:"+ ParentWindowID);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,4100)", 0);
//		WebElement ele = driver.findElement(By.xpath("//button[@id='windowhandling1']"));
//		ele.click();
		
		driver.findElement(By.xpath("//a[@href='https://www.naukri.com/mnc-jobs?src=discovery_trendingWdgt_homepage_srch']")).click();
		driver.findElement(By.xpath("//span[@title='Startup']")).click();
		driver.findElement(By.xpath("//span[@title='Fortune 500']")).click();
		
		Thread.sleep(3000);
		

		Set<String> allWindIds = driver.getWindowHandles();
		System.out.println("all windows Ids are:-");
		System.out.println("Total Window size:" +allWindIds.size());
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
				
				//driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("selenium testing");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindowID);		
		driver.quit();
		
	}

}
