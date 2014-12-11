/**
 * 
 */
package com.my.cuddlegram.rest.ws.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author c0naivi
 * 
 */
public class MyConnectionManager {
	public static Connection getConnection() throws SQLException,
			ClassNotFoundException {
		String dbURL = "jdbc:mysql://localhost:3306/";
		String dbName = "cuddlegram";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "cgram";
		String password = "cgram";
		Class.forName(driver);
		return DriverManager.getConnection(dbURL + dbName, userName, password);
	}

}
