package customer.map;

public enum Serviceplan {
SILVER(1000), GOLD(1500), DIAMOND(2000);
	
	public double planAmount;
	
	private Serviceplan(double planAmount) {
		this.planAmount = planAmount;
	}

	public double getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(double planAmount) {
		this.planAmount = planAmount;
	}
	
	
	@Override
	public String toString() {
		return name()+" "+planAmount;
	}

	Serviceplan gettingType(String type) {
		
		return Serviceplan.valueOf(type);
	}

	
		
}
