package com.camicode.restapi.socialmedia.socialmediaapi.user;

import java.time.LocalDate;

public class User {
	
	private Integer userId;
	private String userName;
	private LocalDate userBirthDate;
	
	public User(Integer userId, String userName, LocalDate userBirthDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userBirthDate = userBirthDate;
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

	public LocalDate getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(LocalDate userBirthDate) {
		this.userBirthDate = userBirthDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userBirthDate=" + userBirthDate + "]";
	}
}
