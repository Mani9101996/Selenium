package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandlleWindoeAuthentication1 {
@Test
	public void HandlleWindoeAuthentication() throws InterruptedException, IOException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://admin:admmin@the-internet.herokuapp.com/basic_auth");
		
		//driver.get("http://username:password@test.com");

		Thread.sleep(3000);
		
		//Runtime.getRuntime().exec("C:\\Users\\manit\\OneDrive\\Desktop\\Authenticate.exe");
		driver.close();
		
	}

}
