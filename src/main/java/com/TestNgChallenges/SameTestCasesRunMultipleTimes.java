package com.TestNgChallenges;

import org.testng.annotations.Test;




public class SameTestCasesRunMultipleTimes {

@Test(invocationCount = 10)
public void GetMethod () {
	System.out.println("GetMethod");
}

	
	
	
	
	
	
	
	
	
	
/*
	@Test (dependsOnMethods = "getOpenBroswer")
	public void getOpenBrowser() {
		System.out.println("getOpenBrowser");
	}
	
	@Test (dependsOnMethods = "getLogIn")
	public void getLogIn () {
		System.out.println("getLogIn");
	}
	@Test (dependsOnMethods = "getCloseBrowser")
	public void getCloseBrowser() {
		System.out.println("getCloseBrowser");
	}
	*/
	
}
