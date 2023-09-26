package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScrollDownByEndofPage {
@Test
	public void ScrollDownByVisibilityOfElement() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement ele = driver.findElement(By.xpath("//button[@id='simpleAlert' and text()='Simple Alert']"));
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)",0);
		Thread.sleep(3000);
		driver.close();
	}

}
