package waitsDemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo4 {
@Test
	public  void Demo4() throws InterruptedException {
		/*
		 * System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		 * System.out.println("webbrowser is launched"); WebDriver driver = new
		 * EdgeDriver();
		 * 
		 * driver.manage().window().maximize(); driver.get(
		 * "https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html"
		 * ); Thread.sleep(3000);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,3900)", 0); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//input[@id='testWait123']")).click();
		 * 
		 * 
		 * String xpath =
		 * "//div[@id='timeout_text' and text()='Welcome To Automation Testing Insider']"
		 * ; WebElement ele=findElement(driver,xpath,5);
		 */
		
		 //Explicit wait. 
//		 WebDriverWait wait= new WebDriverWait(driver,
//		 Duration.ofSeconds(5)); WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='timeout_text' and text()='Welcome To Automation Testing Insider']")));

	/*	String text = ele.getText();
		System.out.println("the msg is:"+text);
		
		driver.close();
	}
	  public Static WebElement findElement(WebDriver driver1, String xpath1, Duration timeout) {
		  WebElement ele=new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		  return ele;
}*/
	}}
