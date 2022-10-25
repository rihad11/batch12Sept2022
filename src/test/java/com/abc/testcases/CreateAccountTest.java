package com.abc.testcases;

import org.testng.annotations.Test;


import com.abc.pages.BaseTest;
import com.abc.pages.CreateAccountPage;
import com.abc.pages.HomePage;

public class CreateAccountTest extends BaseTest{

		
		@Test
		public void createAccTest() {
			
			HomePage hp= new HomePage(driver);
			CreateAccountPage cap = hp.goToCreateAccountPage();
			cap.createAccount(readConfig.getusername(), readConfig.getfirstname(), readConfig.getlastname(), readConfig.getPassword());	
			
		}
	
	
		
		
		


}
