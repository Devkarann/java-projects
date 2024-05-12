package hash.set;

import java.util.HashSet;

public class tester {
	public static void main(String[] args) {
		HashSet<Employee> employeeSet = new HashSet<Employee>();
		Employee e1 = new Employee("101", "devkaran");
		Employee e2 = new Employee("102", "devkaran");
		Employee e4 = new Employee("102", "devkaran");
		Employee e3 = new Employee("103", "devkaran");
		Employee e5 = new Employee("103", "devkaran");
		
		System.out.println(employeeSet.add(e1));
		System.out.println(employeeSet.add(e2));
		System.out.println(employeeSet.add(e4));
		System.out.println(employeeSet.add(e3));
		System.out.println(employeeSet.add(e5));
		
		
		
	}
}