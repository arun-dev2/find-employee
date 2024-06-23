package com.findemployee.dto;

public class UserRegistrationDTO {

	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] skill;
	private String gender;

	public String[] getSkill() {
		return skill;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSkill(String[] skill) {
		this.skill = skill;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

}
