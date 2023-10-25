package com.testPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.base.BaseClass;

//@Listeners(com.utility.ListenerClass.class)
public class ScreenShotTest extends BaseClass {
	@Test
	 public void testCase1() {
		setup();
	  driver.findElement(By.name("q")).sendKeys("ScreenShot Demo");
	  Assert.assertTrue(false);
	 }
	 @Test
	 public void testCase2() {
		 setup();
	  Assert.assertTrue(false);
	 }
	 @AfterMethod
	 public void teardown() {
		 driver.close();
	 }
}
