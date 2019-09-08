package com.cg.frs.dto;

import java.math.BigInteger;

import sun.security.util.Password;

public class User 
{
	private String userType;
	private BigInteger userId;
	private String userName;
	private Password userPassword;
	private BigInteger userPhone;
	private String email;
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Password getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(Password userPassword) {
		this.userPassword = userPassword;
	}
	public BigInteger getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(BigInteger userPhone) {
		this.userPhone = userPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userType=" + userType + ", userId=" + userId + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", email=" + email + "]";
	}
	

}
