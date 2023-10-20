package com.datePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleDatePciker {
 WebDriver driver;

 @BeforeMethod
 public void setup() {
  System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
 }

 @Test
 public void datePicker() throws InterruptedException {

  String month = "October 2019";
  String day = "09";

  driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]//input")).click();

  while (true) {

   String textString = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]"))
     .getText();

   if (textString.equals(month)) {
    break;
   } else {
    driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
   }
  }
  driver.findElement(By.xpath("//table/tbody/tr/td[contains(text()," + day + ")]")).click();
  Thread.sleep(5000);
  driver.close();
 }
}