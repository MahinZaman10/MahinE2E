package com.TestNgChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTEST {
	WebDriver driver;
		//Object is the Parent Class of java store all types of data. 
		@DataProvider(name="Autentication")
		public static Object[][] credentials(){
			return new Object[][] { {"tanvirpatwary12@gmail.com", "Tester01"},
									{"tanvirpatwary12@gmail.com", "Tester02"},
			                        {"tanvirpatwary12@gmail.com", "Tester03"},
			                        {"tanvirpatwary12@gmail.com", "Tester04"}};
			}
		@Test(dataProvider = "Autentication")
		public void getLogIn(String UserName, String Password) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.automationexercise.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(UserName);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			driver.quit();
		}
			
			}
			
	
