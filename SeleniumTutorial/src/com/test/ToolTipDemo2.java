package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipDemo2 {
@Test
	public  void ToolTipDemo() throws InterruptedException{
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		Thread.sleep(3000);
		
		WebElement google = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		String tooltip1 = google.getAttribute("title");
		System.out.println("tooltip text is:"+ tooltip1);
		Thread.sleep(3000);
		
		WebElement github = driver.findElement(By.xpath("//div[@class='socialbtns']//div//a[@title='Github']"));
		String tooltip2 = github.getAttribute("title");
		System.out.println("tooltip text is:"+ tooltip2);
		Thread.sleep(3000);
		
		WebElement youtube = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
		String tooltip3 = youtube.getAttribute("title");
		System.out.println("tooltip text is:"+ tooltip3);
		Thread.sleep(3000);
		
		
		driver.quit();

	}

}
