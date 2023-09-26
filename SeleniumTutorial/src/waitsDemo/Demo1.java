package waitsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo1 {
@Test
	public  void Demo1() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)", 0);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='testWait123']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@id='timeout_text']"));
		String text = ele.getText();
		System.out.println("the text is:"+text);
		
		driver.close();
	}

}
