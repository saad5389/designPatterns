package com.qa.testcases;
import java.util.concurrent.TimeUnit;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.factory.DriverManager;
import com.qa.factory.DriverManagerFactory;
import com.qa.factory.DriverType;

public class FactoryDesignTest {

	DriverManager driverManager;
	WebDriver driver;
	LoginPage lp;
	HomePage hp;

	@BeforeTest
	public void beforeTest() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver=driverManager.getDriver();
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
	}
	
	@Test
	public void verifyBStackDemoAddToCart() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		lp.login("standard_user", "secret_sauce");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		hp.logout();
	}
	
	@AfterTest
	public void afterMethod() {
		driver.quit();
	}
}