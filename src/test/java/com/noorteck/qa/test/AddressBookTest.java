package com.noorteck.qa.test;

import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

		public static void main(String[] args) {
			String url="http://a.testaddressbook.com/sign_up";
			
			CommonUI commonUIObj=new CommonUI();
			
			commonUIObj.openBrowser("chrome");
			
			commonUIObj.navigate(url);
			
			ObjInitialize obj=new ObjInitialize();
			
			obj.initializeClassObj();
			
			AddressBookTest testObj=new AddressBookTest();
		
			testObj.AddressBookTestOne();
			testObj.AddressBookTestTwo();
			
			commonUIObj.quitBrowser();
			
		}
		
		public void AddressBookTestOne() {
		
		signUpObj.enterEmail("ZohnSena@gmail.com");
		signUpObj.enterPassword("1superStar");
		signUpObj.clickEnter();
		
		
	}  
		public void AddressBookTestTwo() {
			
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

