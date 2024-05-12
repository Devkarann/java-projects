package hash.set;

public class Employee {
	private String id;
	private String name;
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
	public Employee(String string, String name) {
		super();
		this.id = string;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equal");
		if(obj instanceof Employee) {
			return this.id.equals(((Employee)obj).getId());
		}
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("in hash");
		return 69;
	}
	@Override
	public String toString() {
		return "Employee id "+ id +" Employee name"+ name;
	}
	
	
}
