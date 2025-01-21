package com.testclasses;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.pom.classes.RegisterationPage;

public class RegisterationPageTest extends RegisterTest{
	
	
	
	@Test
	public void registerationPageTest() throws InterruptedException {
		RegisterTest rt = new RegisterTest();
		rt.registerpage();
		RegisterationPage rp = new RegisterationPage(driver);
		rp.firstName(ran);
		
		rp.lastName();
		rp.mail();
		rp.telphone();
		rp.password();
		rp.confirmpass();
		rp.privacy();
		rp.clickcontinuebutton();
		rp.validateurlandtext();
		rp.sucesscontbtn();
	}

}
