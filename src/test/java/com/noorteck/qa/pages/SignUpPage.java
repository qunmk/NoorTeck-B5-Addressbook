package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	@FindBy(xpath="//*[@id='user_email']")
	WebElement emailField;

	@FindBy(xpath = "//*[@id='user_password']")
	WebElement passwordField;

	@FindBy(xpath = "//*[@value='Sign up']")
	WebElement signUpButton;
	
	@FindBy(xpath="//div[@class='row']//a[@data-test='sign-in']")
	WebElement signInButton;
	
	
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
	 public void clickSignIn() {
		 click(signInButton);
	
	}

}
