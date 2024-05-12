package fruit.details;

public class Mango extends Fruit {

	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		
	}
	
	public String taste() {
		return "sweet";
	}
	public String pulp() {
		return super.getName()+" "+super.getWeight()+" "+super.getColor()+ "Creating pulp!!";
	}
	
	
	@override
	public String toString() {
		return super.toString(); 
	}
	/*
	 public String displayPerticular() {
		return getName()+ " "+ getColor()+" "+getWeight();
	}
	*/
	
}
