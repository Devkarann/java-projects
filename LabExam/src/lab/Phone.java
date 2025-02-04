package lab;

import java.time.LocalDate;
import java.util.List;

public class Phone {
	private List<String> mobileNumber;
	private String name;
	private LocalDate date;
	private String email;
	private String key;
	
	public Phone(List<String> mobileNumber, String name, LocalDate date, String email, String key) {
		super();
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.date = date;
		this.email = email;
		this.key = key;
		
	}
	
	
	@Override
	public String toString() {
		return "Phone [mobileNumber=" + mobileNumber + ", name=" + name + ", date=" + date + ", email=" + email + "]";
	}


	public List<String> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<String> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
	
	
	
	
	
	

}
