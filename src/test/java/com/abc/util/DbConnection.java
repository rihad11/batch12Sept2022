package com.abc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.abc.pages.BaseTest;

public class DbConnection  extends BaseTest{
	static Connection connection;
	@Test
	public void dbConnection() throws SQLException {
		
		 connection= DriverManager.getConnection("jdbc:mysql://localhost/ecommerce",readConfig.getUserSql() ,readConfig.getPassSql());
		Log.info("connection eshtablished");
		List<String> storedataforList 	=DbConnection.getQuery("select * from Customers");
		
		for(int i=0; i<storedataforList.size();i++) {
			String dbdata=storedataforList.get(i);
			Log.info(dbdata);
			
		}
		
		
		
	}
	
	
	public static List<String> getQuery(String query) throws SQLException {
		
		List<String> data= new ArrayList<String>();
		
		Statement stmnt = connection.createStatement();
		ResultSet rs = stmnt.executeQuery(query);
		
		while (rs.next()) {
			
			
			data.add(rs.getString(1));
			data.add(rs.getString(2));
			
			
			}
		return data;
		
		
		
		
		
	}
			

						
	
	
	
}
