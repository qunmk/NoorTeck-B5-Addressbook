package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//a[contains(@data-test,'home')]")
	WebElement homeButton;

	@FindBy(xpath = "//a[contains(@data-test,'addresses')]")
	WebElement addressButton;

	@FindBy(xpath = "//a[contains(@data-test,'sign-out')]")
	WebElement signoutButton;

	@FindBy(xpath = "//h1[contains(text(),'Welcome to Address Book')]")
	WebElement mainMessage;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHome() {

		click(homeButton);
	}

	public void clickAddress() {
		click(addressButton);
	}

	public void clickSignOut() {
		click(signoutButton);
	}

	public String welcome() {

		return getText(mainMessage);
	}

}
