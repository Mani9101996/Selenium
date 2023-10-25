//capture the screen shots By using @AfterMethod annotation method in test class.
package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotDemo {

	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Set implicit wait of 3 seconds
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	//Tests google calculator
	public void googleCalculator() throws IOException{
		
		//Launch google
		driver.get("http://www.google.co.in");
		
		//Write 2+2 in google textbox
		WebElement googleTextBox = driver.findElement(By.id("lst-ib"));
		googleTextBox.sendKeys("2+2");
		
		//Hit enter
		googleTextBox.sendKeys(Keys.ENTER);
		
		//Get result from calculator
		WebElement calculatorTextBox = driver.findElement(By.id("cwtltblr"));
		String result = calculatorTextBox.getText();
		
		//Intentionaly checking for wrong calculation of 2+2=5 in order to take screenshot for failing test
		Assert.assertEquals(result, "5");
	}
	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getStatus());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D:\\Trainings & Learnings\\Selenium Project\\Screenshots\\Screenshot1.jpg"));
	   }        
	}
	
}
