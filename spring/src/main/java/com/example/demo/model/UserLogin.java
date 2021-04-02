package com.example.demo.model;

public class UserLogin {
	
	private String loginEmail;
	private String loginPassword;
	
	public UserLogin()
	{
		
	}
	
	public UserLogin(String loginEmail, String loginpassword) {
		super();
		this.loginEmail = loginEmail;
		this.loginPassword = loginpassword;
	}
	
 
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	
}
