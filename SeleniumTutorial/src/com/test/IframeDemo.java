package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class IframeDemo {
@Test
	public  void IframeDemo() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(3000);
		System.out.println("Frame ID's are:-");
		
		List<WebElement> IframeList = driver.findElements(By.tagName("iframe"));
		int count = IframeList.size();
		System.out.println("the total no of frames:" + count);
		
		WebElement ele = driver.findElement(By.id("iframe01"));
		
		System.out.println("Frame Names are:-");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2700)", 0);
		Thread.sleep(3000);

		for(WebElement iframe:IframeList) {
			System.out.println("Frame Ids are:"+ iframe.getAttribute("name"));
			if(iframe.getAttribute("name").equals("iframe_b")) {
			
				driver.switchTo().frame(ele);
				driver.findElement(By.id("searchInput")).sendKeys("Selenium iframe testing");
				Thread.sleep(3000);
				//driver.switchTo().defaultContent();
				driver.switchTo().parentFrame();
			}
		}
		boolean buttonmainframe = driver.findElement(By.xpath("//form[@target='_blank']//input[@type='submit']")).isDisplayed();
		System.out.println("button displayed");
		driver.findElement(By.xpath("//form[@target='_blank']//input[@type='submit']")).click();
		driver.quit();
	}

}
