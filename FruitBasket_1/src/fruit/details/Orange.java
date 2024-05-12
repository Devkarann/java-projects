package fruit.details;

public class Orange extends Fruit{

	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	
	public String taste() {
		return "Sour";
	}
	public String pulp() {
		return super.getName() +" "+super.getWeight()+" "+ super.getColor()+"extracting juice!!";
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
