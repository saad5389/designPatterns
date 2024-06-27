package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	WebDriver driver;

	@FindBy(css = "#logout_sidebar_link")
	private WebElement logout;

	@FindBy(css = "#react-burger-menu-btn")
	private WebElement breadCrumb;
	
	public void logout() {
		breadCrumb.click();
		logout.isDisplayed();
		logout.click();
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
