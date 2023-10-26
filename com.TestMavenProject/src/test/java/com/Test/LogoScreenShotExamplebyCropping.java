package com.Test;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogoScreenShotExamplebyCropping {
@Test
	 public  void LogoScreenShotExample() throws IOException {
    WebDriver driver;
	System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
	driver=new ChromeDriver();             
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	driver.manage().window().maximize();             
  
	//locating amazon logo  
    driver.get("https://www.airbnb.co.in/s/India/");  
	//driver.get("https://www.amazon.in/");  

	// Get entire page screenshot
	WebElement logo = driver.findElement(By.xpath("//div[@class='jcf8415 dir dir-ltr']"));
	//WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//Find location of the webelement logo on the page
	BufferedImage fullScreen = ImageIO.read(screenshot);
	//Find width and height of the located element logo
	org.openqa.selenium.Point location = logo.getLocation();
	 int width = logo.getSize().getWidth();
	 System.out.println(width);
     int height = logo.getSize().getHeight();
	 System.out.println(height);

     //Now the main point, which is cropping the full image to get only the logo screenshot 
     BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),width, height);
     ImageIO.write(logoImage, "png", screenshot); //copy the file to the desired location     
     FileUtils.copyFile(screenshot, new File("D:\\Trainings & Learnings\\Selenium Project\\Screenshots\\elementbycropping.png"));
     
     driver.quit();
	 }
	
	
}
