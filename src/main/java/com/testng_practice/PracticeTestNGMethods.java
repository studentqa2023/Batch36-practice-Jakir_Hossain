package com.testng_practice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class PracticeTestNGMethods {
	
	
	
	@Test(priority=0, groups= {"Smoke"})//same test multiple time
	public void logIn() {
		System.out.println("this is login method");
	}
	
	//same test multiple time
//	@Test(priority=0, groups= {"Smoke"}, invocationCount = 5)//same test multiple time
//	public void logIn() {
//		System.out.println("this is login method");
//	}
	
	@Test(priority=1, groups= {"Regression", "Smoke"}, dependsOnMethods = "logIn")
	public void dress() {
		System.out.println("This is dress method");
	}
	
	//run only failed test cases
//	@Test(priority=1, groups= {"Regression", "Smoke"})
//	public void dress() {
//		2System.out.println("This is dress method");
//	}
	
	@Test(priority=2, groups= {"Smoke"}, dependsOnMethods = "dress")
	public void cart() {
		System.out.println("This is cart method");
	}
	
	//run test when pass it's before test(dependsOnMethods="")
//	@Test(priority=2, groups= {"Smoke"}, dependsOnMethods = "dress")
//	public void cart() {
//		System.out.println("This is cart method");
//	}
	
	@Test(priority=3)
	public void payment() {
		System.out.println("This is payment method");
	}
	
	//Not run any test cases
//	@Test(priority=3, enabled = false)
//	public void payment() {
//				System.out.println("This is payment method");
//	}
	
	@Test(priority=4)
	public void placeOrder() {
		System.out.println("This is place order method");
	}
	
	
	

}

//<groups>
//<run>
//	<include name="Smoke"></include>
//  <include name="Regression"></include>   together multiple test cases
//  </run>
//</groups>
