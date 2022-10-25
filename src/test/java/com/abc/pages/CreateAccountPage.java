package com.abc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.util.Log;

public class CreateAccountPage extends BaseTest{
	//WebDriver driver;
	public CreateAccountPage(WebDriver localDriver) {
		driver=localDriver;
		PageFactory.initElements(localDriver, this);
	}
	
	
	@FindBy(id="username")
	WebElement usernameOrEmail;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="phone")
	WebElement phoneNo;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="createAccount")
	WebElement createAccount;
	
	
	public void createAccount(String uname,String fname,String lname, String pass) {
		usernameOrEmail.sendKeys(uname);
		Log.info(uname);
		
		firstname.sendKeys(fname);
		Log.info(fname);
		lastname.sendKeys(lname);
		Log.info(lname);
		password.sendKeys(pass);
		Log.info(pass);
		//createAccount.click();
	}
	
	
	
}
