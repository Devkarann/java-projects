package customer.management;

import java.util.Comparator;

public class BankDateComprator implements Comparator<Customer>{
	@Override
	public int compare(Customer o1, Customer o2) {
		return o2.getDate().compareTo(o2.getDate());
	}
}
