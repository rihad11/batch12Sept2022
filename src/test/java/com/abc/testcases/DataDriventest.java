package com.abc.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.abc.pages.BaseTest;
import com.abc.pages.HomePage;
import com.abc.pages.LoginPage;
import com.abc.util.ExcelReader;
import com.abc.util.Log;

public class DataDriventest extends BaseTest{
	
	//apache POI jars/dependency
	//have excel sheet with data in your project space
	//create a class for reading data from excel sheet
	
	@Test(dataProvider = "ddt")
	public void ddt(String user, String pass) {
		
		 HomePage hPage=new HomePage(driver); 
		 hPage.loginFb(user, pass);
		 
		
		//Log.info(user+"   "+pass);
	}
	
	
	
	
	
	@DataProvider(name="ddt")
	public String[][] getddt() throws Exception {
		
		String path="/Users/rihad/eclipse-workspace/AutomationFramework/src/test/resources/excel/loginDDT.xlsx";
		int rowNum=ExcelReader.getRowCount(path, "Sheet1");
		int colcount=ExcelReader.getCellCount(path, "Sheet1", 1);
		
		String [][]loginData= new String[rowNum][colcount];
		
		for (int i = 1; i <= rowNum; i++) {
			
			for (int j = 0; j < colcount; j++) {
				
				
				loginData[i-1][j]=ExcelReader.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
		
	}
	
	
}
