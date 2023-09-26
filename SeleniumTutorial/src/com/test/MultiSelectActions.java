package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MultiSelectActions {
@Test
	public void MultiSelectActions() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MovingItems.aspx");
		Thread.sleep(3000);
	
		Actions act = new Actions (driver);
		List<WebElement>list = driver.findElements(By.xpath("//table[@id='ContentHolder_lbAvailable_LBT']/tr"));
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(2)).click(list.get(3)).click(list.get(5)).click(list.get(7))
		.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()='Add >']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
