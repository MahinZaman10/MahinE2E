package com.TestNgChallenges;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(dependsOnMethods = "getOpenBroswer")
	public void getOpenBrowser() {
		System.out.println("getOpenBrowser");
	}
	
	@Test(dependsOnMethods = "getLogIn")
	public void getLogIn () {
		System.out.println("getLogIn");
	}
	@Test(dependsOnMethods = "getCloseBrowser")
	public void getCloseBrowser() {
		System.out.println("getCloseBrowser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
