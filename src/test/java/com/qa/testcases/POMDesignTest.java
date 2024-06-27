package com.qa.testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.POM.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class POMDesignTest {
	WebDriver driver;
	LoginPage lp;
	HomePage hp;

	@BeforeTest
	public void setUp() {
		driver = BaseClass.init();
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}

	@Test(priority = 1)
	public void validLogin() {
		lp.login("standard_user", "secret_sauce");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		hp.logout();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}	
}
