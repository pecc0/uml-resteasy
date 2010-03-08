package com.musicShop.forms;

public class LoginForm {
	@javax.ws.rs.FormParam(value = "user")
	private String userName;
	@javax.ws.rs.FormParam(value = "pass")
	private String password;

	public String toString() {
		return "\nname: " + userName + "\npass: " + password;
	}

	public void setUserName(String aUserName) {
		this.userName = aUserName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setPassword(String aPassword) {
		this.password = aPassword;
	}

	public String getPassword() {
		return this.password;
	}
}