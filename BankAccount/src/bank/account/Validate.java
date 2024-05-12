package bank.account;

import java.time.LocalDate;

public class Validate {
	
	public static BankAccount validateAll(int acctNo, String firstName, String lastName, String acType, String dob,
			double balance) throws ErrorMain {
		
		AccountType acnt = validateAccount( acType) ;
		validateMinbalance(acnt, balance);
		
		
		return new BankAccount(acctNo, firstName, lastName, acnt, LocalDate.parse(dob), balance);
	}
	
	public static AccountType validateAccount(String acType) throws ErrorMain{
		return AccountType.valueOf(acType.toUpperCase());
			
	}
	public static void validateMinbalance(AccountType type, double Balance) throws ErrorMain {
		if(type.getMinBalance() > Balance) {
			throw new ErrorMain("bhot garib ho bhai");
		}
	}
	
	

	

	
	

}
