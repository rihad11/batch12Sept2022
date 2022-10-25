package com.abc.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.abc.pages.BaseTest;
import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.util.Log;

public class LoginTest extends BaseTest {

	
	@Test(dataProvider = "logindata")
	public void logintest(String user, String pass) {
		
		
		  HomePage hPage=new HomePage(driver); 
		  LoginPage lp = hPage.signIn();
		  lp.SignorLogin(user, pass);
		  Log.info(user+"  "+pass);
	}
	
	
	
	
	
	@DataProvider(name="logindata")
	public String[][] getData() {
		
		
		String[][]logindata= {
				
				{"abcd@yahoo","pqrse!234"},
				{"abfggmail.com","xyzrt!234"},
				{"efgh@icloud.com","uopiy!234"}
				
				
		};
		return logindata;
		
		
	}
	
}
