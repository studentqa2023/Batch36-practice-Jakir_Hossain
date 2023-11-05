package com.testng_practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTstNGStudy {
	//@Test(priority=0 , groups= {"Smoke"})
	//@Parameters({"myName", "b"})
	
//	public void getLogin(String myName, int b) {
//		System.out.println(myName);
//		System.out.println(b);
		//System.out.println("this is log in method");
	//}
	
	@Test(priority=0 , groups= {"Smoke"})
	public void getLogin() {
		System.out.println("this is log in method");
	}
	
	@Test(priority=1, groups= {"Smoke"}, dependsOnMethods = "getLogin")
	public void getDress() {
		System.out.println("this is dress method");
	}
	
	@Test(priority=2, enabled = false)
 public void getCart() {
	 System.out.println("this is cart method");
 }
 @Test(priority=3, groups= {"Smoke"}, invocationCount= 5)
 public void getPayment() {
	 System.out.println("this is payment method");
 }
}
