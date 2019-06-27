package com.biz.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static Connection dbConn = null;
	
	static {
		String jdbDriver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String userName = "user5";
		String password = "1234";
		
		try {
			Class.forName(jdbDriver);
			dbConn = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end static
	
	public static Connection getDBConnection() {
		return dbConn;
	}
	
}
