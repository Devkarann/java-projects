package question_5;

public class Order {
	
	private static int oId;
	static {
		oId = 1;
	}
	private  int orderId;
	private int petId;
	private int quantity;
	private Status statusType;
	
	public Order(int petId, int quantity, Status statusType) {
		super();
		this.orderId = oId;
		this.petId = petId;
		this.quantity = quantity;
		this.statusType = statusType;
		oId++;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", statusType="
				+ statusType + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatusType() {
		return statusType;
	}

	public void setStatusType(Status statusType) {
		this.statusType = statusType;
	}
		
	
}
