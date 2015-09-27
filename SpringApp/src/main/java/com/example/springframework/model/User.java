package com.example.springframework.model;

import org.apache.log4j.Logger;

public class User {

	Logger logger = Logger.getLogger(getClass());

	private String userId;
	private int age;
	private String name;
	private long mobileNo;

	public User() {
		logger.info("Empty User()");
	}

	public User(String userId) {
		this.userId = userId;
		logger.info("User(userId)");
	}

	public User(String userId, String name) {
		this.userId = userId;
		this.name = name;
		logger.info("User(userId, name)");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", age=" + age + ", name=" + name
				+ ", mobileNo=" + mobileNo + "]";
	}

}
