package waitsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Demo5 {
	@Test
	public  void Demo5() throws InterruptedException {
		  System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
			System.out.println("webbrowser is launched");
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3900)", 0);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='testWait123']")).click();
		  String xpath="//div[text()='Welcome To Automation Testing Insider']";
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(Duration.ofSeconds(20))
		    .pollingEvery(Duration.ofSeconds(2))
		    .ignoring(Exception.class);

		       WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
		         public WebElement apply(WebDriver driver) {
		           return driver.findElement(By.xpath(xpath));
		         }
		       });
		  String text = ele.getText();
		  System.out.println("The msg is: " + text);
		  driver.close();
		 }
		}

