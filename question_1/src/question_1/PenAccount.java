package question_1;

import java.time.LocalDate;

public class PenAccount {
	
	private static int staticInt;
	private static LocalDate updateDate;
	private int id;
	private String brand;
	@Override
	public String toString() {
		return "PenAccount [id=" + id + ", brand=" + brand + ", color=" + color + ", inkcolor=" + inkcolor
				+ ", materialType=" + materialType + ", availStock=" + availStock + ", updateDate=" + updateDate
				+ ", ListingDate=" + ListingDate + ", price=" + price + ", discount=" + discount + "]";
	}

	private String color;
	private String inkcolor;
	private Material materialType;
	private int availStock;
	//private LocalDate updateDate;
	private LocalDate ListingDate;
	private double price;
	private double discount;
	static {
		staticInt = 1;
		updateDate = LocalDate.now();
	}
	
	public PenAccount(String brand, String color, String inkcolor, Material materialType, int availStock,
			LocalDate listingDate, double price, double discount) {
		super();
		this.id = staticInt;
		this.brand = brand;
		this.color = color;
		this.inkcolor = inkcolor;
		this.materialType = materialType;
		this.availStock = availStock;
		this.updateDate = updateDate;
		this.ListingDate = listingDate;
		this.price = price;
		this.discount = discount;
		staticInt++;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInkcolor() {
		return inkcolor;
	}
	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}
	public Material getMaterialType() {
		return materialType;
	}
	public void setMaterialType(Material materialType) {
		this.materialType = materialType;
	}
	public int getAvailStock() {
		return availStock;
	}
	public void setAvailStock(int availStock) {
		this.availStock = availStock;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	public LocalDate getListingDate() {
		return ListingDate;
	}
	public void setListingDate(LocalDate listingDate) {
		ListingDate = listingDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
		
		
	
}
