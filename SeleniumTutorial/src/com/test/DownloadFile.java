package com.test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;
import java.util.Scanner;

public class DownloadFile<JavascriptExecuter> {
@Test
	public  void DownloadFile() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String downloadFilepath = "D:\\GIT Repository";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);
        EdgeOptions options = new EdgeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--test-type");
        options.addArguments("--disable-extensions"); //to disable browser extension popup
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        driver = new EdgeDriver(options);  
                 driver.get("http://www.seleniumhq.org/download/");
                 Thread.sleep(3000);
                 driver.manage().window().maximize();
                 System.out.println("reached till this");
                 //handling element click intercepted error
                 driver.findElement(By.xpath("//a[text()='64 bit Windows IE']")).click();
//              WebElement button = driver.findElement(By.xpath("//a[text()='64 bit Windows IE']")).click();
//              JavascriptExecuter executer = (JavascriptExecuter)driver;
//              executer.executescript("arguments[0].click()",button);
//              driver.execute_script("arguments[0].click()",button);
	}

}
