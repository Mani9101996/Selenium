package com.testPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestClass extends BaseClass {
	@Test
	 public void testCase3() {
		setup();
	  driver.findElement(By.name("q")).sendKeys("ScreenShot Demo");
	  Assert.assertTrue(true);
	 }
	 @Test
	 public void testCase4() {
		 setup();
	  Assert.assertTrue(false);
	 }
	 @AfterMethod
	 public void teardown() {
		 driver.close();
	 }
}
