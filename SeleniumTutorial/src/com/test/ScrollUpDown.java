package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScrollUpDown {
@Test
	public void ScrollUpDown() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.automationtestinginsider.com/");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1000,0)", 0);
		Thread.sleep(3000);
		driver.close();
	}

}
