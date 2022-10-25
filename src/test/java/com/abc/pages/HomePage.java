package com.abc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.util.Log;

public class HomePage extends BaseTest {

	
	//for every page - create single class
	//create constructor to initialize webelements using Pagefactory
	//add locators
	//add methods
	
	
	public HomePage(WebDriver localDriver) {
		
		driver=localDriver;
		PageFactory.initElements(localDriver, this);
		
	}
	
	
	@FindBy(id = "email")
	WebElement userNamefb;
	
	@FindBy(id="pass")
	WebElement passwordfb;
	
	
	@FindBy(xpath = "//*[@id=\"headerPrimary\"]/a[4]/span")
	WebElement signInLinkfromHomepage;
	
	@FindBy(xpath = "//*[text()='Create Account']")
	WebElement creatAccount;
	
	@FindBy(xpath = "//*[@id=\"listaccountNav-signIn\"]/a/span")
	WebElement signInfromNavigation;
	
	public CreateAccountPage goToCreateAccountPage() {
		signInLinkfromHomepage.click();
		creatAccount.click();
		return new CreateAccountPage(driver);
	}
	
	
	public LoginPage signIn() {
		signInLinkfromHomepage.click();
		Log.info(signInLinkfromHomepage.getText());
		signInfromNavigation.click();
		return new LoginPage(driver);
		
	}
	
	
	public void loginFb(String user, String pass) {
		userNamefb.sendKeys(user);
		Log.info(user);
		passwordfb.sendKeys(pass);
		Log.info(pass);
		driver.navigate().refresh();
		Log.info("page got refreshed");
	}
	
	
}
