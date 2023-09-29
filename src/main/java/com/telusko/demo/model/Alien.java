package com.telusko.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Id
	String email;
	String password;
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Alien [email=" + email + ", password=" + password + "]";
	}
	
}
