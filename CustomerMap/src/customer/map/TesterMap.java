package customer.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import customer.management.BankDateComprator;

public class TesterMap {
	public static void main(String[] args) {
		Map<String,Customer> customerList = new HashMap<>();
		boolean exit = false;
		
		try(Scanner sc = new Scanner(System.in)){
			while(!exit) {
				
				System.out.println("Enter 1 for sign up customer");
				System.out.println("Enter 2 for diplaying the customer");
				System.out.println("Enter 3 for sign in into email");
				System.out.println("Enter 4 for changing the password");
				System.out.println("Enter 5 for deleting the password");
				System.out.println("Enter 6 for sorting by emailiId in asc order (key)");
				System.out.println("Enter 7 for sorting by emailiId in desc order (key)");
				System.out.println("Enter 8 for sorting by date (value)");
				System.out.println("Enter 9 for getting name by serviceplan");
				System.out.println("Enter 0 for exit");
				try {
				switch(sc.nextInt()) {
				case 1:
//					dev singh sdevkaran012@gmail.com dev 1500 2000-10-10 gold
					System.out.println("first name, last name, email, password, amount, date(yyyy-mm-dd), Service-type");
					Customer c =  Validation.validateAll(sc.next(),sc.next(),sc.next(), sc.next(), sc.nextDouble() ,sc.next(),sc.next(), customerList);
					customerList.put(c.getEmail(),c);
					System.out.println("Succesfully signed up");
					break;
				case 2:
					for(Customer c1: customerList.values()) {
						System.out.println(c1);
					}
					break;
					
				case 3:
					System.out.println("Enter email id and password");
					String mail = sc.next();
					String pass = sc.next();
					Customer check = Checking.findMyAccount(mail, customerList);
					if(check.getPassword().equals(pass)) {
						System.out.println("succesfully login");
					}
					else {
						System.out.println("invalid password");
					}
					break;
				case 4:
					System.out.println("Enter email id, password and password which you wany to set");
					Customer changePass =  Checking.findMyAccount(sc.next(), customerList);
					if(changePass.getPassword().equals(sc.next())) {
						changePass.setPassword(sc.next());
						System.out.println("Succesfully changed the password");
					}
					else {
						System.out.println("invalid password");
					}
					break;
					
				case 5:
					System.out.println("Enter your emailId");
					String Delmail = sc.next();
					Customer deletePass =  Checking.findMyAccount(Delmail, customerList);
					System.out.println("Enter password for deleting the account");
					String DelPass = sc.next();
					if(deletePass.getPassword().equals(DelPass)) {
						deletePass = customerList.remove(Delmail);
						if(deletePass == null) {
							System.out.println("invalid account ");
						}
						else {
							System.out.println("Account deleted succesfully");
						}
					}
					else {
						System.out.println("invalid password");
					}
					break;
					
				case 6:
					
					Map <String, Customer> sortMap = new TreeMap<>(customerList);
					for(Customer a: sortMap.values()) {
						System.out.println(a);
					}
					break;
					
				case 7:
					sortMap = new TreeMap<>(new BankAccountComprator());
					sortMap.putAll(customerList);
					for(Customer b: sortMap.values()) {
						System.out.println(b);
					}
					break;
					
				case 8:
					ArrayList <Customer> arrList = new ArrayList<>(customerList.values());
					Collections.sort(arrList, new BankDateComprator());
					for(Customer a : arrList)
						System.out.println(a);
					break;
					
				case 9:
					
					System.out.println("Enter service plan for getting the customer name ");
					String serviceType = sc.next();

					for(Customer customer : customerList.values()) {
					    if(customer.getsType().equals(serviceType)) {
					        System.out.print("Name of customer(s) with service plan " + serviceType + " is/are: ");
					        System.out.println(customer.getFirstName()+ customer.getLastName());
					    }
					}
					break;
					
				case 0:
					exit = true;
					break;
					
					
				}
				}catch(Exception e) {
					System.out.println(e);
				
			
		}
		}

	}


}

	
}
