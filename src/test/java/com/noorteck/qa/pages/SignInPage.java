package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {
	
	@FindBy(xpath = "//*[@id='session_email']")
	WebElement emailIdField;

	@FindBy(xpath = "//*[@id='session_password']")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Sign in']")
	WebElement signInButton;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String emailID) {

		enter(emailIdField, emailID);
	}
	
	public void enterPassword(String pwID) {
		enter(passwordField,pwID);
	}

	public void clickEnter() {
		click(signInButton);
	}


}
