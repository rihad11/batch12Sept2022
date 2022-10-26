package com.abc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.abc.pages.BaseTest;

public class DbConnection  extends BaseTest{

	@Test
	public void dbConnection() throws SQLException {
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/ecommerce",readConfig.getUserSql() ,readConfig.getPassSql());
		Statement stmnt = connection.createStatement();
		String query="select * from Customers where CustomerID=1";
		ResultSet rs = stmnt.executeQuery(query);
		
		while (rs.next()) {
			
		//	Log.info(rs.getString("City"));
			Log.info(rs.getString(2));
		}
		
	}
			

						
	
	
	
}
