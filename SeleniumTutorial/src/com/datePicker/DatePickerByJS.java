package com.datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerByJS {
	 WebDriver driver;

	@BeforeMethod
	 public void setup() {
	  System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
	 }

	@Test
	 public void datePcikerTestbyJS() throws InterruptedException {
	  WebElement element=driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]//input"));
	  String dateString="09/10/1996";
	  datePcikerByJS(driver, dateString, element);
	  Thread.sleep(5000);
	  driver.close();
	 }
	
	 public void datePcikerByJS(WebDriver driver, String date,WebElement element) {
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].setAttribute('value','"+date+"')", element);
		 }
	
}
