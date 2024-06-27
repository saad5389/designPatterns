package com.qa.fluent;
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

	private LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage enterUsername(String user) {
		username.sendKeys(user);
		return this;
	}

	public LoginPage enterPassword(String pass) {
		password.sendKeys(pass);
		return this;
	}

	public void clickLogin() {
		loginBtn.click();
	}

	public static LoginPage using(WebDriver driver) {
		return new LoginPage(driver);
	}

}
