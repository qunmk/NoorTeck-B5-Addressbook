package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	@FindBy(id = "user_email")
	WebElement emailField;

	@FindBy(id = "user_password")
	WebElement passwordField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement signUpButton;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String emailID) {
		enter(emailField, emailID);
	}

	public void enterPassword(String passwordID) {
		enter(passwordField, passwordID);

	}

	public void clickEnter() {
		click(signUpButton);
	}

}
