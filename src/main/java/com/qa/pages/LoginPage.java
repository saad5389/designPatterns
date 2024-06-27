package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver;

	@FindBy(css = "#user-name")
	private WebElement email;

	@FindBy(css = "#password")
	private WebElement password;

	@FindBy(css = "#login-button")
	private WebElement signInBtn;

	public void login(String user, String pass) {		
		email.sendKeys(user);
		password.sendKeys(pass);
		signInBtn.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
