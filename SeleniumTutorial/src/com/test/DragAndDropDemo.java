package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo {
	@Test
	public void DragAndDropDemo() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://demoqa.com/droppable");
		Thread.sleep(3000);
		
	WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement to = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
	
	Actions act = new Actions(driver);
	Actions act1 = new Actions(driver);
	Actions act2 = new Actions(driver);
	Actions act3 = new Actions(driver);
	Thread.sleep(3000);

	act.dragAndDrop(from, to).build().perform();
	Thread.sleep(3000);
	driver.navigate().refresh();
	act1.dragAndDropBy(from, (int) 138.4, 24).build().perform();
	Thread.sleep(3000);
	driver.navigate().refresh();
	act2.clickAndHold(from).moveToElement(to).release().build().perform();
	
//	WebElement droppedmessage = driver.findElement(By.xpath("//p[normalize-space()='Dropped!']"));
//	if(droppedmessage.isDisplayed()) {
//		System.out.println("success");
//		System.out.println("message is:"+droppedmessage.getText());
//	}else
//	{
//		System.out.println("Failed");
//	}
	
	      
	  	driver.quit();
	}


}
