package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
		Thread.sleep(1000);
		register.click();
	}

	public void validate() {
		boolean text = registeraccount.isDisplayed();
		System.out.println("register account text is " + text);	
	}
	
	public void validateurl() {
		String actualurl = driver.getCurrentUrl();
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/register";
		
		Assert.assertEquals(expectedUrl, actualurl);
		
	}
}
