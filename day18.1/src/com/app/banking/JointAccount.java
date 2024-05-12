package com.app.banking;

import static java.lang.Thread.currentThread;

import java.util.Random;

public class JointAccount {
	private double balance;
	private static Random randomNoGenerator;
	static {
		randomNoGenerator=new Random();
	}

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance
	public  synchronized   void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName());
		balance = balance + amt;
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(randomNoGenerator.nextInt(100)+200);//200 -- 299
		balance = balance - amt;
		System.out.println("Updations over by " + currentThread().getName());
	}

	// chk balance
	public  synchronized double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
		Thread.sleep(randomNoGenerator.nextInt(100)+200);
		return balance;

	}

}
