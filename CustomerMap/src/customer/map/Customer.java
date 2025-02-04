package customer.map;

import java.time.LocalDate;


public class Customer {
	private static int id;
	private int cId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate date;
	private Serviceplan sType;
	
	static {
		id = 1;
	}
	
	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate date, Serviceplan sType) {
		super();
		this.cId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.date = date;
		this.sType = sType;
		id++;
	}
	
	
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", date=" + date
				+ ", sType=" + sType + "]";
	}
	


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Customer) {
			Customer c = (Customer) obj;
		return	this.email.equals(c.email);
		}
		return false;
	}


	


	public Customer(String email2) {
		// TODO Auto-generated constructor stub
		super();
		this.email = email2;
	}


	


	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Customer.id = id;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getRegistrationAmount() {
		return registrationAmount;
	}
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Serviceplan getsType() {
		return sType;
	}
	public void setsType(Serviceplan sType) {
		this.sType = sType;
	}
	
}
