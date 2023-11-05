package com.testng_practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {

	@Test
	//@Parameters("myName") ==>for single parameter
	@Parameters({"myName" ,"a" , "solo"}) //for multiple parameters
	public void practiceParameter(String myName ,int a, String solo) {
		System.out.println(myName);
		System.out.println(a);
		System.out.println(solo);
	}
}
