package stack.pacakge;

public class Customer {
	 public int id;
	 public String name;
	 public String address;
	public Customer(int nextInt, String next, String next2) {
		this.id = nextInt;
		this.name =next;
		this.address = next2;
	}
	@Override
	public String toString() {
		return "Customer [id=" + this.id + ", name=" + this.name + ", address=" + this.address + "]";
	}
}
