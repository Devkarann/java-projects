package customer.management;

import java.util.ArrayList;
import java.util.List;

public class Checking {
	public static Customer checkingMail(String mail, List<Customer> customerList)throws ErrorMain {
		Customer c= new Customer(mail);
		int index = customerList.indexOf(c);
		if(index == -1) 
			throw new ErrorMain("Invalid mail id"); 
		return customerList.get(index);
		
	}
}
