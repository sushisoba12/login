package com.internousdev.login.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.login.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport implements SessionAware{


	private String username;
	private String password;
	private Map <String,Object> session;

	public String execute(){
		String ret = ERROR;

		LoginDAO dao=new LoginDAO();
		boolean b=dao.select(username,password);
		if(b==true){
			if(username.equals(dao.username)){
				if(password.equals(dao.password)){
					session.put("username","taro");
					System.out.println((String)session.get("username"));
					session.put("password","123");
					System.out.println((String)session.get("password"));

					session.put("username","jiro");
					System.out.println((String)session.get("username"));
					session.put("password","456");
					System.out.println((String)session.get("password"));

					session.put("username","hanako");
					System.out.println((String)session.get("username"));
					session.put("password","789");
					System.out.println((String)session.get("password"));

					ret=SUCCESS;
				}
			}
		}
		if(username.equals("dao.username")){
			if(password.equals("dao.password")){
				ret = SUCCESS;
			}
		}
		return ret;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
