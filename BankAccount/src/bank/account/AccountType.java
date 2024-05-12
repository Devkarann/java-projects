package bank.account;

public enum AccountType {
	SAVING(10000), FD(20000), TRADING(8000);
	
	public double minBalance;
	
	AccountType(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
			}
	public String toString() {
		return name()+" "+minBalance;
	}
}
