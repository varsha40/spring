package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	private int iduser;
	private String username;
	private String password;
	public int getId() {
		return iduser;
	}
	public void setId(int iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
