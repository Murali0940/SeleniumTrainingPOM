package com.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.basemethod.BaseClass;
import com.pom.classes.RegisterPage;

public class RegisterTest extends BaseClass{
	
	@Test
	public void registerpage() throws InterruptedException {
		RegisterPage rp = new RegisterPage(driver);
		rp.myaccount();
		rp.register();
		boolean validate = rp.validate();
		Assert.assertTrue(validate);
//		String validateurl = rp.validateurl();
//		//
//		
//		String validateurl2 = rp.validateurl();
//		
//		boolean contains = validateurl2.contains("register");
//		Assert.assertTrue(contains);
	}
	
	
	
	
	

}
