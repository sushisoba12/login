package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.login.util.DBConnector;


public class LoginDAO {
	 public boolean select(String username,String password){
		 DBConnector db = new DBConnector();
		 Connection con = db.getConnection();
		 String sql = "select * from uers where username = ? and password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			}
	 }

}
