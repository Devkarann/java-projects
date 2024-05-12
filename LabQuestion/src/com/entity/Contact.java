package com.entity;

import java.time.LocalDate;
import java.util.List;

public class Contact {

	private List<String> number;
	private String name;
	private LocalDate dateOfBirth;
	private String email;

	public Contact(List<String> number, String name, LocalDate dateOfBirth, String email) {
		super();
		this.number = number;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getNumber() {
		return number;
	}

	public void setNumber(List<String> number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [number=" + number + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ "]";
	}

}
//.matches("^[0-9]{10}$")