package com.abc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest  {

	
	
	LoginPage(WebDriver localDriver){
		driver=localDriver;
		PageFactory.initElements(localDriver, this);
		
	}
	
	
	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement signInbutton;
	
	
	public UserPage SignorLogin(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		//signInbutton.click();
		return new UserPage(driver);
		
	}
	
	
	
}
