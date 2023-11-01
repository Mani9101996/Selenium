package com.orangeHRM.pages;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By username = By.xpath("//input[@id='user_login']");
	By password = By.xpath("//input[@id='user_pass']");
	 By loginBtn = By.xpath("//input[@id='wp-submit']");
	 By logo = By.xpath("//a[normalize-space()='Powered by WordPress']");
	
	
	//Constructor to initialize current class objects 
	 public LoginPage(WebDriver driver) {
	  this.driver=driver;
	 }
	 
	//User Actions methods
	 public boolean validateLogo() {
	  driver.findElement(logo).isDisplayed();
	  return true;
	 }
	 
	 public HomePage login(String uname, String pswd) {
		  driver.findElement(username).sendKeys(uname);
		  driver.findElement(password).sendKeys(pswd);
		  driver.findElement(loginBtn).click();
		  return new HomePage();
		 }


}
