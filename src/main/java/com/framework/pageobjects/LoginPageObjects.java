package com.framework.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.testbase.TestBase;

public class LoginPageObjects extends TestBase {
	private static final Logger log = Logger.getLogger(LoginPageObjects.class.getName());

	// Locate webelements

	@FindBy(xpath = "//*[@class='login']")
	private WebElement btn_SignIn;

	@FindBy(id = "email")
	private WebElement txt_EmailAddress;

	@FindBy(id = "passwd")
	private WebElement txt_Password;

	@FindBy(name = "SubmitLogin")
	private WebElement btn_LoginSignIn;

	// Initilize web elements
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn_SignIn() {
		return btn_SignIn;
	}

	public WebElement getTxt_EmailAddress() {
		return txt_EmailAddress;
	}

	public WebElement getTxt_Password() {
		return txt_Password;
	}

	public WebElement getBtn_LoginSignIn() {
		return btn_LoginSignIn;
	}

	// Page Actions

	public void loginOperation(String email, String password) {
		getBtn_SignIn().click();
		log.info("click on sign In button");
		getTxt_EmailAddress().sendKeys(email);
		log.info("Enter email address");
		getTxt_Password().sendKeys(password);
		log.info("enter password");
		getBtn_LoginSignIn().click();
		log.info("click on user login button");
	}

}
