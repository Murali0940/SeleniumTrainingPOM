package com.testclasses;

import org.testng.annotations.Test;

import com.basemethod.BaseClass;
import com.pom.classes.RegisterPage;

public class RegisterTest extends BaseClass{
	
	@Test
	public void registerpage() throws InterruptedException {
		RegisterPage rp = new RegisterPage(driver);
		rp.myaccount();
		rp.register();
		rp.validate();
		rp.validateurl();
	}
	
	
	
	
	

}
