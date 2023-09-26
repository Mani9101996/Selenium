package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UploadFileUsingAutoIT {
@Test
	public void UploadFileUsingAutoIT() throws InterruptedException, IOException {
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
		
		Runtime.getRuntime().exec("D:\\GIT Repository\\AutoIT Scripts\\UploadFileusingusingAutoIT\\UploadFIle.exe");
		
		driver.close();
	}

}
