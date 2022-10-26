package com.abc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	FileInputStream fis;
	Properties properties = new Properties();

	public ReadConfig() {

		try {
			fis = new FileInputStream(
					"/Users/rihad/eclipse-workspace/AutomationFramework/src/test/resources/properties/config.properties");
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			Log.info(e.getMessage());
		}

	}

	public String getTestSiteUrl() {
		String testSiteURL = properties.getProperty("testSiteURL");
		return testSiteURL;
	}

	public String getusername() {
		String username = properties.getProperty("username");
		return username;
	}

	public String getfirstname() {
		String firstname = properties.getProperty("firstname");
		return firstname;
	}

	public String getlastname() {
		String lastname = properties.getProperty("lastname");
		return lastname;
	}

	public String getPassword() {
		String passsword = properties.getProperty("passsword");
		return passsword;
	}

	public String getUserSql() {
		String usersqlString=properties.getProperty("usermysql");
		return usersqlString;
	}

	public String getPassSql() {
		String userpass=properties.getProperty("userpass");
		return userpass;
	}

}
