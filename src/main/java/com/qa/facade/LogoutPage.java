package com.qa.facade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(css = "#react-burger-menu-btn")
	private WebElement breadCrumb;

	@FindBy(css = "#logout_sidebar_link")
	private WebElement logout;

	public void logout() throws InterruptedException {
//		driver.wait(5000);
		breadCrumb.isDisplayed();
		breadCrumb.click();
//		driver.wait(5000);
		logout.isDisplayed();
		logout.click();
	}
	
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
