package customer.management;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		ArrayList <Customer> customerList = new ArrayList<>();
		boolean exit = false;
		
		try(Scanner sc = new Scanner(System.in)){
			while(!exit) {
				System.out.println("Enter 1 for sign up customer");
				System.out.println("Enter 2 for diplaying the customer");
				System.out.println("Enter 3 for sign in into email");
				System.out.println("Enter 4 for changing the password");
				System.out.println("Enter 5 for deleting the password");
				System.out.println("Enter 0 for exit");
				
				switch(sc.nextInt()) {
				case 1:
//					dev singh sdevkaran012@gmail.com dev 1500 2000-10-10 gold
					System.out.println("first name, last name, email, password, amount, date(yyyy-mm-dd), Service-type");
					Customer c =  Validation.validateAll(sc.next(),sc.next(),sc.next(), sc.next(), sc.nextDouble() ,sc.next(),sc.next());
					customerList.add(c);
					System.out.println("Succesfully signed up");
					break;
				case 2:
					for(Customer c1: customerList) {
						System.out.println(c1);
					}
					break;
					
				case 3:
					System.out.println("Enter email id and password");
					String mail = sc.next();
					String pass = sc.next();
					Customer check = Checking.checkingMail(mail, customerList);
					if(check.getPassword().equals(pass)) {
						System.out.println("succesfully login");
					}
					else {
						System.out.println("invalid password");
					}
					break;
				case 4:
					System.out.println("Enter email id, password and password which you wany to set");
					Customer changePass =  Checking.checkingMail(sc.next(), customerList);
					if(changePass.getPassword().equals(sc.next())) {
						changePass.setPassword(sc.next());
						System.out.println("Succesfully changed the password");
					}
					else {
						System.out.println("invalid password");
					}
					break;
					
				case 5:
					System.out.println("Enter your emailId and pass for deleting the account");
					Customer deletePass =  Checking.checkingMail(sc.next(), customerList);
					if(deletePass.getPassword().equals(sc.next())) {
						customerList.remove(deletePass);
						System.out.println("Succesfully deleted the account");
					}
					else {
						System.out.println("invalid password");
					}
					break;
				case 0:
					exit = true;
					break;
					
					
				}
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

	

}
