package question_5;

public class Pet {
	private int petId;
	private String name;
	private Category categoryType;
	private double unitPrice;
	private int stock;
	
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", categoryType=" + categoryType + ", unitPrice=" + unitPrice
				+ ", stock=" + stock + "]";
	}

	public Pet(int petId, String name, Category categoryType, double unitPrice, int stock) {
		super();
		this.petId = petId;
		this.name = name;
		this.categoryType = categoryType;
		this.unitPrice = unitPrice;
		this.stock = stock;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Category categoryType) {
		this.categoryType = categoryType;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
}
