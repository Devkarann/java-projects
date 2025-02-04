package question_6;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tester {
	
	public static void main(String[] args) {
		Map<Integer, Employee> empList = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		boolean check = false;
		while(!check) {
			try {
				System.out.println("Enter 1 for adding permanent employee");
				System.out.println("Enter 2 for adding hourly based employee");
				System.out.println("Enter 3 for deliting the employee by id");
				System.out.println("Enter 4 for displaying by aadhar card");
				System.out.println("Enter 5 for sorting as per the date");
				System.out.println("Enter 0 for exit ");
				
				switch(sc.nextInt()) {
				
				case 1:
					System.out.println("Enter  name, date,  phone number,  aadhaar,  monthSalary, hourSalary in case permanent emp put 0 in hoursalary");
					Employee e = validation.validationAll(sc.next(), sc.next(), sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble() , empList);
					empList.put(e.getId(), e);
					break;
					
				case 2:
					System.out.println("Enter  name, date,  phone number,  aadhaar,  monthSalary, hourSalary in case temp emp put 0 in permanent salary");
					Employee e2 = validation.validationAll(sc.next(), sc.next(), sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble() , empList);
					empList.put(e2.getId(), e2);
					break;
					
				case 3:
					System.out.println("Enter id");
					Employee e3 = findMyAccount.findId(sc.nextInt(), empList);
					empList.remove(e3.getId(), e3);
					break;
					
				case 4:
					System.out.println("Enter aadhar card number");
					String Aadhar = sc.next();
					for(Employee e4: empList.values()) {
						if(e4.getAadhaar().equals(Aadhar) ){
							System.out.println(e4.toString());
						}
					}
					break;
					
				case 5:
					ArrayList<Employee> sortEmp = new ArrayList<>(empList.values());
					Collections.sort(sortEmp, new bankDateComparator());
					for(Employee e5: sortEmp) {
						System.out.println(e5);
					}
					break;
					
				case 0:
					check = true;
					break;
					
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	
	
}
