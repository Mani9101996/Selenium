package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

@Given("user is on login page")
public void user_is_on_login_page() {
	System.out.println("Step1: User is on Login Page");
	WebDriverManager.chromedriver().setup();
	System.out.println("webbrowser is launched");
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_in");
	
}

@When("user enters username and password")
public void user_enters_username_and_password() {
//	this.driver = driver;
	System.out.println("Step2: User enters Username and Password");
	driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("admin123");	
}

@And("click on login button")
public void click_on_login_button() {
	System.out.println("Step3: User clicks on Login Button");

    driver.findElement(By.xpath("//input[@id='user_submit']")).click();
	
}

@Then("user should land on homepage")
public void user_should_land_on_homepage() {
	System.out.println("Step4: User lands on Home page");
    driver.close();
	
}

}