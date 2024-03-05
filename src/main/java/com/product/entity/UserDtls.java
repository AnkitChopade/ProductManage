package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "UserDtls")
public class UserDtls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String FullName;
	private String DOB;
	private String Address;
	private String EmailAddress;
	private int Password;
	@Override
	public String toString() {
		return "UserDtls [FullName=" + FullName + ", DOB=" + DOB + ", Address=" + Address + ", EmailAddress="
				+ EmailAddress + ", Password=" + Password + "]";
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}
	public UserDtls(String fullName, String dOB, String address, String emailAddress, int password) {
		super();
		FullName = fullName;
		DOB = dOB;
		Address = address;
		EmailAddress = emailAddress;
		Password = password;
	}
	
	
	
}
