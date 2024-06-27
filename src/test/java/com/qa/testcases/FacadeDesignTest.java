package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.facade.PlaceOrderFacade;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacadeDesignTest {
	WebDriver driver;
	PlaceOrderFacade facade;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		facade = new PlaceOrderFacade();
	}

	@Test
	public void placeOrder() throws InterruptedException {
		facade.testcase(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
