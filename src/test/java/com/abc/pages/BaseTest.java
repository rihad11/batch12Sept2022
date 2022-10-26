package com.abc.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.abc.util.Log;
import com.abc.util.ReadConfig;
import com.aventstack.extentreports.ExtentTest;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
//I am in BaseTest
	public static WebDriver driver;
	public static ReadConfig readConfig=new ReadConfig();
	public static ExtentTest test;
	
	@Parameters("browser")
	@BeforeSuite
	public void setup(@Optional("chrome")String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Log.info("launching chrome");

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Log.info("launching firefox");
		}

		else {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("launching MS Edge");

		}
		
		
		driver.get(readConfig.getTestSiteUrl());
		Log.info(readConfig.getTestSiteUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterSuite
	public void tearDown() {
		if(driver!=null)
			Log.info("driver quiting");
			driver.quit();
	}
	
}
