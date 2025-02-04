package fruit.details;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruit(String color, double weight, String name,boolean fresh) {
		super();
		this.color= color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}
	
	//getter to get the value 
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public boolean getFresh() {
		return fresh;
	}
	
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	//display method
	@override
	public String toString() {
		return getName()+" "+ getWeight(); 
	}
	/*
	 public String displayPerticular() {
		return getName()+ " "+ getColor()+" "+getWeight();
	}
	*/
	
}
