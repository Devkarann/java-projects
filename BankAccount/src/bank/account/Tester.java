package bank.account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class Tester {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList <BankAccount> account = new ArrayList<>();
			boolean exit = false;
			
			try {
				while(!exit) {
					System.out.println("Enter 1 for adding accounts");
					System.out.println("Enter 2 for displaying account accounts");
					System.out.println("Enter 3 for adding funds to account");
					System.out.println("Enter 4 for withdrawing funds from account");
					System.out.println("Enter 0 for exit");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("write acctNo, firstName, lastName,  acType, dob(yr-mon-day), balance");
						BankAccount b = Validate.validateAll(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
						account.add(b);
						break;
						
					case 2:
						for(BankAccount a : account) {
							System.out.println(a);
						}
						break;
					case 3:
						System.out.println("How many many you want to DEPOSITE and write your ACCOUNT NUMBER also");
						double deposite = sc.nextDouble();
						int accountNumber = sc.nextInt();
						for(BankAccount a : account) { 
							   if( a.getAcctNo()== accountNumber) { 
								   a.setBalance(a.getBalance()+deposite);
							   }
							}
						break;
					
					case 4:
						System.out.println("How many many you want to WITHDRAW and enter ACCOUNT NUMBER also");
						double withdraw = sc.nextDouble();
						int acntNumber = sc.nextInt();
						for(BankAccount a : account) { 
							   if( a.getAcctNo()== acntNumber) { 
								   a.setBalance(a.getBalance()-withdraw);
							   }	   
						}
						break;
						
				}
			}
					
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
 }
	
	


