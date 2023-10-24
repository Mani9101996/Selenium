package ScreenshotTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {
@Test
	public void testcase1() throws InterruptedException, IOException {
		
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		System.out.println("webbrowser is launched");
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		File  f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\manit\\git\\Selenium\\SeleniumTutorial\\Screenshot\\Screenshot1.png"));
		
		driver.close();
}
}
