package com.example.angular.model;

public class UserModel {
	
	private String firstName;
	private String lastName;
	private String email;
	private String language;
	
	public UserModel() {}
	
	public UserModel(String firstName,String lastName,String email,String language) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.email = email;
		this.language = language;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
