package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Users_table")
public class UserEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int userId;

	@NotNull
	@Column(name = "Name")
	private String name;

	@NotNull
	@Column(name = "Password")
	private String password;

	@NotNull
	@Column(name = "Email")
	private String email;

	@NotNull
	@Column(name = "Contact_No")
	private String contactNo;

	@NotNull
	@Column(name = "Dob")
	private String dob;
	
	@Column(name = "User_Status")
	private String userStatus;

	

	public UserEntity() {

	}

	public UserEntity(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", Name=" + name + ", password=" + password + ", eMail=" + email
				+ ", contactNo=" + contactNo + ", DOB=" + dob + "]";
	}

}
