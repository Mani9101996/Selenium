package com.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenShot {
	@Test
	public void FullScreenShot() {
		 WebDriver driver;
		 // String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		 // String filename = null;

	System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
	driver=new ChromeDriver();             
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	driver.manage().window().maximize();             
    driver.get("https://www.airbnb.co.in/s/India/");  
    
    //take screenshot of the entire page 
    
    Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	try {
		ImageIO.write(screenshot.getImage(),"PNG",new File("D:\\Trainings & Learnings\\Selenium Project\\Screenshots\\fullScreenshot4.png"));
	//	ImageIO.write(screenshot.getImage(),"PNG",new File("user.dir")+"\\Screenshot\\"+filename+"_"+dateName+".png"));

	} catch (Exception e) {
		e.getMessage();
		e.printStackTrace();
		// TODO: handle exception
	}
	driver.quit();
}
}

