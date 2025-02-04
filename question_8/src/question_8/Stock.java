package question_8;

import java.io.Serializable;
import java.time.LocalDate;

public class Stock implements Serializable{
	private String id;
	private String name;
	private String companyName;
	private double price;
	private LocalDate date;
	private double quan;
	private double originalQuant;
	
	public Stock(String id, String name, String companyName, double price, LocalDate date, double quan) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.date = date;
		this.quan = quan;
	}
	
	public double getOriginalQuant() {
		return originalQuant;
	}

	public void setOriginalQuant(double originalQuant) {
		this.originalQuant = originalQuant;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", companyName=" + companyName + ", price=" + price + ", date="
				+ date + ", quan=" + quan + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Stock) {
			Stock sto = (Stock)obj;
			
			return this.getCompanyName().equals(sto.getCompanyName());
		}
		
		return false;
	}

	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getQuan() {
		return quan;
	}
	public void setQuan(double quan) {
		this.quan = quan;
	}
	
}
