package com.POM_Framework.testscripts;

import org.testng.annotations.Test;

import com.framework.pageobjects.LoginPageObjects;
import com.framework.testbase.TestBase;

import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;

public class TC001_VerifyLoginPageTest extends TestBase {

	private static final Logger log = Logger.getLogger(TC001_VerifyLoginPageTest.class.getName());

	@Test
	public void verifyLoginOperation() {
		log.info("*************Verify Login Page Test started ***********");
		LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
		loginPageObjects.loginOperation(getData("username"), getData("password"));
		log.info("*************Verify Login Page Test completed ***********");
	}

	@BeforeMethod
	public void testStart() {
		init();
	}
}
