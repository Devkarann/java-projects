package bank.account;

import java.time.LocalDate;

public class BankAccount {
	private int acctNo;
	private String firstName;
	private String lastName;
	private AccountType acType;
	private LocalDate dob;
	private LocalDate creationDate;
	private double balance;

	// ctor : to init complete state of the acct
	public BankAccount(int acctNo, String firstName, String lastName, AccountType acType, LocalDate dob,
			double balance) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.acType = acType;
		this.dob = dob;
		this.creationDate = LocalDate.now();
		this.balance = balance;
	}
	//add overoaded ctor to wrap PK
	public BankAccount(int acctNo) {
		super();
		this.acctNo = acctNo;
	}

	// override toString to ret a/c details
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", acType="
				+ acType + ", dob=" + dob + ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}

	
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// override equals method to replace ref equality
	// by UID(acct no) equality
	@Override
	public boolean equals(Object o) {
		System.out.println("in acct's equals");
		if (o instanceof BankAccount) {
			BankAccount a = (BankAccount) o;
			return this.acctNo == a.acctNo;
		}
		return false;
	}
}
