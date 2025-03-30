package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myaccount;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;

	// Validate
	@FindBy(xpath = "//h1[text()='Register Account']")
	WebElement registeraccount;

	public void myaccount() throws InterruptedException {
		myaccount.click();
		Thread.sleep(1000);
	}

	public void register() throws InterruptedException {
		
		register.click();
		Thread.sleep(1000);
	}

	public boolean validate() {
		boolean validatetext = registeraccount.isDisplayed();
		return 	validatetext;
	}
	
	public String validateurl() {
		String actualurl = driver.getCurrentUrl();
		return 	actualurl;
	}
}
