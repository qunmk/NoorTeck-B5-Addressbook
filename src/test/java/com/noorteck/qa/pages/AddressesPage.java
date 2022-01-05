package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {

	@FindBy(xpath = "//a[contains(text(),'New Address')]")
	WebElement newAdressButton;

	@FindBy(xpath = "//input[@id='address_first_name']")
	WebElement fNameField;

	@FindBy(xpath = "//input[@id='address_last_name']")
	WebElement lNameField;

	@FindBy(xpath = "//input[@id='address_street_address']")
	WebElement addressOneField;

	@FindBy(xpath = "//input[@id='address_secondary_address']")
	WebElement addressTwoField;

	@FindBy(xpath = "//input[@id='address_city']")
	WebElement cityField;

	@FindBy(xpath = "//select[@id='address_state']")
	WebElement stateDropdown;

	@FindBy(xpath = "//input[@id='address_zip_code']")
	WebElement zipcodeField;

	@FindBy(xpath = "//input[@id='address_country_us']")
	WebElement countryUSRadio;

	@FindBy(xpath = "//input[@id='address_age']")
	WebElement ageField;

	@FindBy(xpath = "//input[@id='address_website']")
	WebElement websiteField;

	@FindBy(xpath = "//input[@id='address_phone']")
	WebElement phoneField;

	@FindBy(xpath = "//input[@id='address_interest_dance']")
	WebElement interestCheckbox;

	@FindBy(xpath = "//textarea[@id='address_note']")
	WebElement noteField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement createAddressButton;

	@FindBy(xpath = "//div[contains(text(),'Address was successfully created.')]")
	WebElement message;

	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement editButton;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement listButton;

	public AddressesPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickAddress() {
		click(newAdressButton);
	}

	public void enterFirstName(String firstName) {
		enter(fNameField, firstName);

	}

	public void enterLastName(String lastName) {
		enter(lNameField, lastName);
	}

	public void enterAddress(String addressOne) {
		enter(addressOneField, addressOne);

	}

	public void enterAddressTwo(String addressTwo) {
		enter(addressTwoField, addressTwo);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void selectStateDropdown(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropdown, methodName, indexTextValue);

	}

	public void enterZipcode(String zipcode) {
		enter(zipcodeField, zipcode);

	}

	public void clickCountry() {
		click(countryUSRadio);

	}

	public void enterAge(String age) {
		enter(ageField, age);

	}

	public void enterWebsite(String website) {
		enter(websiteField, website);
	}

	public void enterPhone(String phone) {
		enter(phoneField, phone);

	}

	public void interestCheck() {
		click(interestCheckbox);

	}

	public void enterNote(String note) {
		enter(noteField, note);

	}

	public void clickCreateAddress() {
		click(createAddressButton);

	}
	
	public String textAddress() {
		return getText(message);
	}

	public void clickEdit() {
		click(editButton);

	}

	public void clickList() {
		click(listButton);

	} public String getFirstName() {
		return getText(fNameField);
	}
	
	public String getLastName() {
		return getText(lNameField);
	}

	public String getCity() {
		return getText(cityField);
	}
	
	public String getState(){
		return getText(stateDropdown);
	}

}