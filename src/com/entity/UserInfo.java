package com.entity;

import java.util.Date;

/**
 * 	用户类
 * @author Rain
 *
 */
public class UserInfo {
	private Integer userId;
	
	protected String userName;
	
	public Date userBirth;

	public UserInfo() {
		System.out.println("UserInfo -> 空构造函数");
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}
}
