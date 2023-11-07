package com.orangeHRM.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;

public class LoginPageTest {
	
	 public static WebDriver driver;
	 LoginPage loginPage;
	 HomePage homepage;

	 
	@BeforeMethod
	 public void setUp() {
		 System.setProperty("WebDriver.chrome.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/chromedriver-win64/chromedriver.exe");
			WebDriver  driver= new ChromeDriver();
			loginPage= new LoginPage(driver);
			driver.manage().window().maximize();
			driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	 }
	 
	@Test
	 public void verifyLogo() {
	
	boolean flag = loginPage.validateLogo();
	Assert.assertTrue(flag);
	 }
	
	 @Test
	 public void verifyLogin() {
	  homepage =  loginPage.login("Admin", "admin123");
	  String actualURL= driver.getCurrentUrl();
	  System.out.println("URL is:" +actualURL);
	  String expectedURL= "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
	  Assert.assertEquals(actualURL, expectedURL);
	 }
	 
	
	 
	 @AfterMethod
	 public void tearDown() {
	  driver.close();
	 }
}
