package com.basemethod;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public RandomStringUtils rsu;

	@BeforeSuite
	public void setup() {

		String URL = "https://tutorialsninja.com/demo/";

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get(URL);
	}

	public String getRandomString() {
	     return RandomStringUtils.randomAlphanumeric(6);
	}
	
	public void generateRandomnumber() {
         RandomStringUtils.randomNumeric(10);
    }
	

	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
