package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AutoSugesstion {
@Test
	public  void AutoSugesstion() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		Thread.sleep(3000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for(int i=0; i<suggestions.size(); i++)
		{
			System.out.println(suggestions.get(i).getText());
			
			String SearchText = suggestions.get(i).getText();
			
			if(SearchText.equals("selenium testing"))
			{
				suggestions.get(i).click();
				break;
			}
			
		}
					driver.close();
	}

}
