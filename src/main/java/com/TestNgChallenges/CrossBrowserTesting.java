package com.TestNgChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import smarttech.ny.basepage.ParentClass;

public class CrossBrowserTesting extends ParentClass {

	@BeforeMethod //Coming from TestNG
	@Parameters("CrossBrowser") //TestNG Advanced annotation  which we use to run Cross Browser testing. 
								//(@parameter connects with XML file)
	
	public void initialization(String broswer) {
		if (broswer.equalsIgnoreCase("Chrome")) {
			System.out.println("Test Will execute with Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (broswer.equalsIgnoreCase("Edge")) {
			System.out.println("Test Will execute with Egde Browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (broswer.equalsIgnoreCase("FireFox")) {
			System.out.println("Test Will execute with FireFox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}

	public void testCase() {
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester01");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	}

	@AfterMethod
	public void getCloseBrowser() {
		driver.quit();
		System.out.println("Browser Closed");
	}

	@Test //Same test case will run in multiple browser
	public void getLogIn() {

		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Log in to the Application");
	}
}
