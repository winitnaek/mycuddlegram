/**
 * 
 */
package com.my.cuddlegram.rest.ws.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author c0naivi
 *
 */
public class CgramDBUtil {

	public boolean validateUser(String userName, String password){
		boolean isValudUser = false;
		try {
			Connection conn = MyConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("SELECT * FROM cuddlegram.cgram_user where cgram_username="+userName+" and password="+password);
			System.out.println(res);
			while (res.next()) {
				isValudUser = true;
			}
			conn.close();
		} catch (Exception e) {
			isValudUser = false;
		}
		return isValudUser;
	}
}
