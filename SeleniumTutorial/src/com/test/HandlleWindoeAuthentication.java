package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HandlleWindoeAuthentication {
@Test
	public void HandlleWindoeAuthentication() throws InterruptedException, IOException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\GIT Repository\\AutoIT Scripts\\HandlleWindoeAuthentication\\Authenticate.exe");
		driver.close();
		
	}

}
