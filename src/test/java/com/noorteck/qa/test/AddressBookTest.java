package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.SignUpPage;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {
	
	

		public static void main(String[] args) {
			String url="http://a.testaddressbook.com/sign_up";
			
			
			
			CommonUI.openBrowser("chrome");
			
			CommonUI.navigate(url);
			
			initializeClassObj();
		
			AddressBookTestOne();
			AddressBookTestTwo();
			
			CommonUI.quitBrowser();
			
		}
		
		public static void AddressBookTestOne() {
		
		signUpObj.enterEmail("ZohnSena@gmail.com");
		signUpObj.enterPassword("1superStar");
		signUpObj.clickEnter();
        homeObj.welcome();
		
		String expMessage="Welcome to Address Book";
		String actMessage=homeObj.welcome();
		
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(expMessage, actMessage);
		softAssert.assertAll();
		
	}  
		public static void AddressBookTestTwo() {
			
			signInObj.enterEmail("ZohnSena@gmail.com");
			signInObj.enterPassword("1superStar");
			signInObj.clickEnter();
			
			addressesObj.clickAddress();
			addressesObj.enterFirstName("Zohn");
			addressesObj.enterLastName("Sena");
			addressesObj.enterAddress("123 Sesame Street");
			addressesObj.enterCity("Reston");
		    addressesObj.selectStateDropdown("value", "AL");
		    addressesObj.clickCountry();
		    addressesObj.enterAge("22");
		    addressesObj.enterPhone("123-2334-3434");
		    addressesObj.interestCheck();
		    addressesObj.enterNote("Automation is Fun");
		    addressesObj.clickCreateAddress();
		    addressesObj.clickList();
		    
		    String expFname="Zohn";
		    String actFname=addressesObj.getFirstName();
		    
		    SoftAssert softAssert2= new SoftAssert();
			softAssert2.assertEquals(expFname, actFname);
			softAssert2.assertAll();
			
			String expLname="Sena";
		    String actLname=addressesObj.getLastName();
		    
		    SoftAssert softAssert3= new SoftAssert();
			softAssert3.assertEquals(expLname, actLname);
			softAssert3.assertAll();
			
			String expCity="Reston";
		    String actCity=addressesObj.getCity();
		    
		    SoftAssert softAssert4= new SoftAssert();
			softAssert4.assertEquals(expCity, actCity);
			softAssert3.assertAll();
			
			String expState="AL";
		    String actState=addressesObj.getState();
		    
		    SoftAssert softAssert5= new SoftAssert();
			softAssert5.assertEquals(expState, actState);
			softAssert5.assertAll();
		}
		
		
}

/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

