package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseClass {
	WebDriver driver;	
	public void initialize()
	{
	System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://amazon.in");
	}
	
	public void capturescreenshot(String methodname) throws IOException {
		try {
			File  file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(file,new File("C:\\Users\\manit\\git\\Selenium\\SeleniumTutorial\\Screenshot\\Screenshot3.png"));
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	
	}
	
}
