package com.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ElementScreenshotbyAShotAPI {
	WebDriver driver;
	@Test
	 public  void ElementScreenshotbyAShotAPI() {
	System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
	driver=new ChromeDriver();             
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	driver.manage().window().maximize();             
    driver.get("https://opensource-demo.orangehrmlive.com");  
    WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	
  //Create the object of AShot() class and get the image co-ordinates 
    //by coordsProvider method and take screenshot using takeScreenshot method
    Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,element);

    //Copy the element screenshot to desired location
try {
	ImageIO.write(screenshot.getImage(),"PNG",new File("D:\\Trainings & Learnings\\Selenium Project\\Screenshots\\elementbyASHOT.png"));
} catch (Exception e) {
	e.getMessage();
	e.printStackTrace();
	// TODO: handle exception
	
	
}
driver.close();

	 }	
}
