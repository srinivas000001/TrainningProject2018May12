package com.niit.trainningprojectbackend.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;





@Entity
public class Employee {

	
	@Id
	@GeneratedValue
	private int employId;
	
	@NotNull
	private String employFName;
	private String employLName;
	
	private char gendar;
	
	@NotNull
	private String mobileNumber;


	@Email
	private String emailId;
	private String role;
	
	@NotNull
	private String password;

	public int getEmployId() {
		return employId;
	}

	public void setEmployId(int employId) {
		this.employId = employId;
	}

	public String getEmployFName() {
		return employFName;
	}

	public void setEmployFName(String employFName) {
		this.employFName = employFName;
	}

	public String getEmployLName() {
		return employLName;
	}

	public void setEmployLName(String employLName) {
		this.employLName = employLName;
	}

	public char getGendar() {
		return gendar;
	}

	public void setGendar(char gendar) {
		this.gendar = gendar;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
