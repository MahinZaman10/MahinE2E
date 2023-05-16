package com.TestNgChallenges;

import org.testng.annotations.Test;

// Without Priority how does test cases will execute?
// By alphabetical order

//How to set up priority in test cases?
//-1,0,1,2,3,4,5,6 or (A,B,C,D....)
public class PriorityTest {
	@Test(priority = 6)
	public void GetMethod1() {
		System.out.println("GetMethod1");
	}

	@Test(priority = 5)
	public void GetMethod2() {
		System.out.println("GetMethod2");
	}

	@Test(priority = 4)
	public void GetMethod3() {
		System.out.println("GetMethod3");
	}

	@Test(priority = 2)
	public void GetMethod4() {
		System.out.println("GetMethod4");
	}

	@Test(priority = 3)
	public void GetMethod5() {
		System.out.println("GetMethod5");
	}

	@Test(priority = 0)
	public void GetMethod6() {
		System.out.println("GetMethod6");
	}

}
