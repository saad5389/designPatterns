package com.qa.facade;

import org.openqa.selenium.WebDriver;

public class PlaceOrderFacade {

	WebDriver driver;
	LoginPage lp;
//	LogoutPage hp;

	public String testcase(WebDriver driver) throws InterruptedException {
		lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
//		hp = new LogoutPage(driver);
//		hp.logout();
		return null;
	}
}
