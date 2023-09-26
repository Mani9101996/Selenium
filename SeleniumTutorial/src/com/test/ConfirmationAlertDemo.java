package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ConfirmationAlertDemo {
@Test
	public void ConfirmationAlertDemo() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();		
		//Thread.sleep(3000);
  		
		
		
		
		if(IsAlertPresent(driver)) {
			System.out.println("Alert is present");
			
		}else {
			System.out.println("Alert is not Present");
		}
		driver.close();
		
	}
	
	public static boolean IsAlertPresent(WebDriver ldriver) 
	{
		try {
			Alert alert = ldriver.switchTo().alert();
			String alerteTxt = alert.getText();
		    alert.accept();
		} catch (NoAlertPresentException e) 
		{
		}
		return false;
		
	}

}
