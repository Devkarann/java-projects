package question_6;

import java.time.LocalDate;

public class Employee {
	private static int cId;
	static {
		cId  =1;
	}
	private int id;
	private String name;
	private LocalDate date;
	private String phone;
	private String number; 
	private String Aadhaar;
	private double monthSalary;
	private double hourSalary;
	public Employee(String name, LocalDate date, String phone, String aadhaar, double monthSalary,
			double hourSalary) {
		super();
		this.id = cId;
		this.name = name;
		this.date = date;
		this.phone = phone;
		Aadhaar = aadhaar;
		this.monthSalary = monthSalary;
		this.hourSalary = hourSalary;
		cId++;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", date=" + date + ", phone=" + phone + ", number=" + number
				+ ", Aadhaar=" + Aadhaar + ", monthSalary=" + monthSalary + ", hourSalary=" + hourSalary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			
			return this.getAadhaar().equals(e.getAadhaar());
		}
		
		return false;
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAadhaar() {
		return Aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		Aadhaar = aadhaar;
	}
	public double getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	public double getHourSalary() {
		return hourSalary;
	}
	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}
	
	
}
