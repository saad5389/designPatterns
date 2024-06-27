package com.qa.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.fluent.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentDesignTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void register() {
		LoginPage.using(driver)
		.enterUsername("standard_user")
		.enterPassword("secret_sauce")
		.clickLogin();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
