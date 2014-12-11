package com.my.cuddlegram.rest.ws.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Java2MySql {

	public Java2MySql() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Connection conn = MyConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("SELECT * FROM cgram_user_type");
			while (res.next()) {
				int id = res.getInt("idcgram_user_type");
				String msg = res.getString("cgram_user_type");
				System.out.println(id + "\t" + msg);
			}
			conn.close();
			
			CgramDBUtil util = new CgramDBUtil();
			boolean isP = util.validateUser("cvinit", "cvinit");
			System.out.println(isP);
		} catch (Exception e) {

		}
	}

}
