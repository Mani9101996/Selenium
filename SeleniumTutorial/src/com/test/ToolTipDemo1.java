package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipDemo1 {
@Test
	public  void ToolTipDemo() throws InterruptedException{
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		WebElement mousehover = driver.findElement(By.xpath("//a[contains(text(),'➤ SAP SD')]"));
		Thread.sleep(3000);
		
		act.moveToElement(mousehover).perform();
		
		WebElement tooltipmsg = driver.findElement(By.xpath("//img[@src='/images/home/Rlogo.png']"));
		
		System.out.println("the tooltip text is:" + mousehover.getText());
		Thread.sleep(3000);

		driver.quit();

	}

}
