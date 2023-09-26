package waitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo2 {
@Test
	public  void Demo2() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//PageLoadTimeout 
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3900)", 0);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='testWait123']")).click();
		//Thread
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//div[@id='timeout_text' and text()='Welcome To Automation Testing Insider']"));
		String text = ele.getText();
		System.out.println("the text is:"+text);
		
		driver.close();
	}

}
