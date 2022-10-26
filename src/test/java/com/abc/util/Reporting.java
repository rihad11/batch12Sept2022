package com.abc.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.abc.pages.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends BaseTest implements ITestListener {

	public ExtentSparkReporter htmlReport;// create html report
	public ExtentTest test;// logging purpose
	public ExtentReports extent;// attaching html report
	
	
	
	public void onStart(ITestContext context) {
		
		htmlReport=new ExtentSparkReporter("ExtentReport.html");
		htmlReport.config().setEncoding("utf-8");
		htmlReport.config().setDocumentTitle("testreport");
		htmlReport.config().setReportName("Test Automation report");
		htmlReport.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports();
		extent.attachReporter(htmlReport);
		
	}

	public void onTestStart(ITestResult result) {
		// not implemented
	}

	public void onTestSuccess(ITestResult result) {
		extent.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		Log.info("test passes form reporting class");
	}

	public void onTestFailure(ITestResult result) {
		extent.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
	}

	public  void onTestSkipped(ITestResult result) {
		// not implemented
	}
	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }

}
