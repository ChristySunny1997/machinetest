package com.faith.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class User {

	// instance variables

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	private String userName;
	private String passWord;
	private String userType;
	//private int empId;
	
//	@JoinColumn(name="empId",insertable=false,updatable=false)
//	@ManyToOne
//	private Employee employee;
//	
	

	// default constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterilized constructor
	public User(int loginId, String userName, String passWord, String userType) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
	}

	// getters and setters
	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	//to string function
	@Override
	public String toString() {
		return "User [loginId=" + loginId + ", userName=" + userName + ", passWord=" + passWord + ", userType="
				+ userType + "]";
	}

}
