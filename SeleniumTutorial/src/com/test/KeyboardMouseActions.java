package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardMouseActions {
	@Test
	public void KeyboardMouseActions() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		
		WebElement googlesearch = driver.findElement(By.name("q"));
		Actions act= new Actions(driver);
		
		act.keyDown(googlesearch,Keys.SHIFT).sendKeys("selenium").build().perform();
		Thread.sleep(3000);

		act.keyUp(googlesearch, Keys.SHIFT).build().perform();
		Thread.sleep(3000);

		act.keyDown(googlesearch,Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(3000);

		act.keyDown(googlesearch,Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(6000);
		
		act.keyDown(googlesearch,Keys.CONTROL).sendKeys("v").build().perform();
		Thread.sleep(6000);

		googlesearch.clear();
		
		
		Actions action= new Actions(driver);
		
		action.keyDown(googlesearch,Keys.SHIFT).sendKeys("selenium").build();
		Thread.sleep(3000);

		action.keyUp(googlesearch, Keys.SHIFT).build();
		Thread.sleep(3000);

		action.keyDown(googlesearch,Keys.CONTROL).sendKeys("a").build();
		Thread.sleep(3000);

		action.keyDown(googlesearch,Keys.CONTROL).sendKeys("x").build();
		Thread.sleep(6000);
		
		action.keyDown(googlesearch,Keys.CONTROL).sendKeys("v").build();
		Thread.sleep(3000);
		
		action.perform();
	}


}
