package com.base;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	 public void setup() {
		 System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
	 }
	 public void screenShot(String filename) {
	  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	  try {
	   FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+"_"+dateName+".png"));
	  // FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+"_"+dateName+".png"));

	  } catch (Exception e) {
	   // TODO Auto-generated catch block
	   e.getMessage();
	  }
	 }
	
	
}
