package question_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Map<Integer, Pet> petList  = new HashMap<>();
		 Pet p1  = new Pet(1, "bull dog" , Category.valueOf("DOG"), 20000,10);
		 petList.put(p1.getPetId(), p1);
		 Pet p2  = new Pet(2, "simbha" , Category.valueOf("CAT"), 1000,30);
		 petList.put(p2.getPetId(), p2);
	
		
		Map<Integer, Order> orderList = new HashMap<>();
		
		
		Map<String, CustomerLogin> customerLoginList = new HashMap<>();
		
		Map<String, AdminLogin> adminLogin = new HashMap<>();
		AdminLogin a = new AdminLogin("sdevkaran012@gmail.com", "0000@@@@");
		adminLogin.put(a.getEmailId(), a);
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = false;
		while(!check) {
			try {
				System.out.println("Enter 1 for add petList");
				System.out.println("Enter 2 for Order the pet");
				System.out.println("Enter 3 for display the Pet List");
				System.out.println("Enter 4 for display the Order list");
				System.out.println("Enter 5 for update the Pet list");
				System.out.println("Enter 0 exit");
				System.out.println("");
				switch(sc.nextInt()) {
				//int petId, String name, Category categoryType, double unitPrice, int stock
				case 1:
					System.out.println("enter pet id , name , category, unitprice , stock");
					Pet p = validation.validateAll(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
					petList.put(p.getPetId(), p);
					System.out.println("Pet added succesfully");
					break;
					
				case 2:
					//int petId, int quantity, Status statusType
					System.out.println("enter pet id , quantity  , status");
					Order o = validation.validateOrderALL(sc.nextInt(), sc.nextInt(), sc.next(), petList);
					orderList.put(o.getOrderId(), o);
					System.out.println("Order added succesfully ");
					break;
					
				case 3:
					for(Pet pet: petList.values()) {
						System.out.println(pet);
					}
					break;
					
				case 4:
					for(Order or: orderList.values()) {
						System.out.println(or);
					}
					break;
					
				case 5:
					System.out.println("Enter admin email id");
					String email = sc.next();
					AdminLogin find = findMyAccount.findEmail(email, adminLogin);
					System.out.println("Enter admin password");
					String pass = sc.next();
					
					find.getPassword().equals(pass);
					
					//AdminLogin find2 = findMyAccount.findPass(pass, adminLogin);
					System.out.println("Login succesfully now you can update the pet list");
					System.out.println("Enter for which Pet if you want to updation");
					int findPetId = sc.nextInt();
					Pet find3 = findMyAccount.findPetId(findPetId, petList);
					System.out.println("Enter the update name");
					find3.setName(sc.next());
					System.out.println("updation succesfull");
					break;
				case 0:
					check = true;
					System.out.println("Exited");
					break;
				
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		
		
	}
}
