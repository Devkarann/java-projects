package fruit.details;

public class Apple extends Fruit{

	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);	
	}
	
	public String taste() {
		return "Sweet and sour";
	}
	public String pulp() {
		return super.getName()+" "+ super.getWeight()+" "+ super.getColor()+ "Making jam!!";
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
