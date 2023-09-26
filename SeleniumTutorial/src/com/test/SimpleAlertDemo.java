package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SimpleAlertDemo {
@Test
	public void SimpleAlertDemo() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Thread.sleep(3000);
		System.out.println("Alert text is: " + alertText);
		Thread.sleep(3000);
		alert.accept();
		driver.close();
		
	}

}
