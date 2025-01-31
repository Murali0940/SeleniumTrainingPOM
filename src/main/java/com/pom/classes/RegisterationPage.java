package com.pom.classes;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterationPage {
	public WebDriver driver;

	public RegisterationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-firstname")
	WebElement firstname;

	@FindBy(id = "input-lastname")
	WebElement lastname;

	@FindBy(id = "input-email")
	WebElement email;

	@FindBy(id = "input-telephone")
	WebElement telephone;

	@FindBy(id = "input-password")
	WebElement pass;

	@FindBy(id = "input-confirm")
	WebElement confirmpass;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacychkbox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement sucesscontinuebtn;
	
// you should not used reusable method inside pom 
	public void firstName() throws InterruptedException {
		firstname.clear();
		String randomfname = RandomStringUtils.randomAlphabetic(6); // put in base class
		firstname.sendKeys(randomfname.toLowerCase());
		System.out.println("Firstname "+randomfname.toLowerCase());
		Thread.sleep(1000);

	}

	public void lastName() throws InterruptedException {
		lastname.clear();
		String randomlname = RandomStringUtils.randomAlphabetic(6);// put in base class
		lastname.sendKeys(randomlname.toLowerCase());
		System.out.println("Lastname: "+randomlname.toLowerCase());
		Thread.sleep(1000);

	}

	public void mail() throws InterruptedException {
		email.clear();
		String randommailletter = RandomStringUtils.randomAlphabetic(3);// put in base class
		String randommailnumber = RandomStringUtils.randomNumeric(2);// put in base class

		email.sendKeys(randommailletter + randommailnumber + "@gmail.com".toLowerCase());
		System.out.println("E-mail: "+randommailletter + randommailnumber + "@gmail.com".toLowerCase());
		Thread.sleep(1000);

	}

	public void telphone() throws InterruptedException {
		telephone.clear();
		String randomtel = RandomStringUtils.randomNumeric(10);// put in base class

		telephone.sendKeys(randomtel);
		System.out.println("Telephone: "+randomtel);
		Thread.sleep(1000);
		

	}

	public void password() throws InterruptedException {
		pass.clear();
		pass.sendKeys("murali123"); // --> do not hard code the datas 
		Thread.sleep(1000);

	}

	public void confirmpass() throws InterruptedException {
		confirmpass.clear();
		confirmpass.sendKeys("murali123");
		Thread.sleep(1000);
	}
	
	public void privacy() throws InterruptedException {
		privacychkbox.click();
		Thread.sleep(1000);
	}
	
	public void clickcontinuebutton() throws InterruptedException {
		continuebtn.click();
		Thread.sleep(1000);
	}
	
	public void sucesscontbtn() throws InterruptedException {
		sucesscontinuebtn.click();
		Thread.sleep(2000);
	}
	
	
	
	public void validateurlandtext() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualurl = driver.getCurrentUrl();
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/success";
		
		Assert.assertEquals(expectedUrl, actualurl);
		
		By confrimmsg = By.xpath("//h1[text()='Your Account Has Been Created!']");
		WebElement msg = driver.findElement(confrimmsg);
		System.out.println("your account is created " + msg.isDisplayed());
		String text = msg.getText();
		System.out.println(text);
		
	}

}
