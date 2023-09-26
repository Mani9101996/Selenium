package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UploadFileUsingRobotClass {
@Test
	public  void UploadFileUsingRobotClass() throws InterruptedException, AWTException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(3000);
		
		Actions act =  new Actions(driver);
		
		WebElement ChooseFile = driver.findElement(By.xpath("//input[@id='fileupload1']"));
		
		act.moveToElement(ChooseFile).click().perform();
		Thread.sleep(3000);	
		
		UploadFIle("D:\\GIT Repository\\New Text Document.txt");
	}

	public static void SetClipBoard(String file) {
		
		
		StringSelection obj = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	
	public static void UploadFIle(String filePath) throws AWTException {
		SetClipBoard(filePath);
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);	
		rb.keyRelease(KeyEvent.VK_ENTER);	
	}
}
