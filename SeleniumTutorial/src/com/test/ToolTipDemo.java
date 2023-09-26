package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipDemo {
@Test
	public  void ToolTipDemo() throws InterruptedException{
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/");
		Thread.sleep(3000);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		String tooltip = searchbox.getAttribute("title");
		System.out.println("tooltip text is:"+ tooltip);
		Thread.sleep(3000);
		
		driver.get("https://www.automationtestinginsider.com/");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
