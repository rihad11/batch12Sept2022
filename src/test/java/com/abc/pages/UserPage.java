package com.abc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends BaseTest{

	public UserPage(WebDriver localDriver) {
		driver=localDriver;
		PageFactory.initElements(localDriver, this);
	}
	
}
