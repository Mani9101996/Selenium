package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleandRightClick {
	@Test

	public void DoubleandRightClick() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		
		WebElement doubleclickBtn = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(doubleclickBtn).build().perform();
		System.out.println("double clicked");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		WebElement RightclickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Thread.sleep(3000);
		act.contextClick(RightclickBtn).build().perform();
		System.out.println("right clicked");
		Thread.sleep(3000);
		
		driver.close();
		}

}
