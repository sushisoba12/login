package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.util.DBConnector;


public class LoginDAO {
	public String username;
	public String password;
	 public boolean select(String username,String password){
		 DBConnector db = new DBConnector();
		 //説j族状態を保持
		 Connection con = db.getConnection();
		 String sql = "select * from uers where username = ? and password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()){
				username=rs.getString("username");
				username=rs.getString("password");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return true;

	 }

}
