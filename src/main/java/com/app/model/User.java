package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usertab")
public class User {

	@Id
	@GeneratedValue(generator="sample")
	@SequenceGenerator(name="sample",sequenceName="USER_SEQ")
	@Column(name="uid")
	private int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", userMobile=" + userMobile
				+ ", userAddress=" + userAddress + "]";
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public User(int userId) {
		super();
		this.userId = userId;
	}
	public User() {
		super();
	}
	@Column(name="uname")
	private String userName;
	@Column(name="uemail")
	private String userEmail;
	@Column(name="umobile")
	private String userMobile;
	@Column(name="uaddrs")
	private String userAddress;
}
