package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;

public class ListenerClass extends BaseClass implements ITestListener{
		
		 public void onTestStart(ITestResult result) {
		  // TODO Auto-generated method stub
		 }
		 public void onTestSuccess(ITestResult result) {
		  // TODO Auto-generated method stub 
		 }
		 public void onTestFailure(ITestResult result) {
		  screenShot(result.getName()); 
		 }
		 public void onTestSkipped(ITestResult result) {
		  // TODO Auto-generated method stub
		 }
		 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		  // TODO Auto-generated method stub 
		 }
		 public void onStart(ITestContext context) {
		  // TODO Auto-generated method stub
		 }

		 public void onFinish(ITestContext context) {
		  // TODO Auto-generated method stub
		  
		 }
	
}
