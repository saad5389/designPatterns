package com.qa.facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	@FindBy(css = "#user-name")
	private WebElement username;

	@FindBy(css = "#password")
	private WebElement password;

	@FindBy(css = "#login-button")
	private WebElement loginBtn;

	public void login(String user, String pass) {		
		username.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
