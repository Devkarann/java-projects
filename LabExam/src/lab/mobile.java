package lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class mobile {
	public static void main(String[] args) {
		Map<String,Phone> phoneList = new HashMap<>(); 
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		while(!false) {
			System.out.println("Enter 1 for adding the phone number");
			switch(sc.nextInt()) {
			
			case 1:
				
				System.out.println("Enter how many number you want to store");
				int size = sc.nextInt();
				List<String> number= new ArrayList<>();
				for(int i=0; i<size; i++) {
					String num = sc.next();
					number.add(num);
				}
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter dob");
				String dob = sc.next();
				System.out.println("Enter mail");
				String mail = sc.next();
				
				String key = name+dob;
				Phone p = validation.validateAll(number, name, dob, mail, key, phoneList );
				phoneList.put(p.getKey(), p);
				System.out.println("Phone added succesfully");
				
				break;
			case 2:
				for(Phone p1 : phoneList.values()) {
					System.out.println(p1);
				}
				break;
			case 3:
				System.out.println("Enter name");
				String n = sc.next();
				System.out.println("Enter dob");
				String s = sc.next();
				
				String k = n+s;
				Phone p3 = findMyAccount.findKey(k, phoneList);
				System.out.println("Which number you want to change");
				String numb = sc.next();
				System.out.println("What numb you want to place");
				String numbReplace = sc.next();
				
				
			}
		}
				
	}
}
