package com.AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	SoftAssert obj= new SoftAssert();

	 SoftAssert obj1= new SoftAssert();
	 
	 @Test
	 public void testCase1() {
	  System.out.println("==================================");
	  System.out.println("Test1 Start");
	  obj.assertTrue(true);
	  obj.assertEquals("Hi", "Hi");
	  System.out.println("Test1 End");
	  System.out.println("==================================");
	  obj.assertAll();

	 }
	 @Test
	 public void testCase2() {
	  System.out.println("==================================");
	  System.out.println("Test2 Start");
	  obj1.assertTrue(true);
	  obj1.assertEquals("HELLO", "HELLO");
	  System.out.println("Test2 End");
	  System.out.println("==================================");
	  obj1.assertAll();

	 }

	}
