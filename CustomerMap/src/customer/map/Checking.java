package customer.map;

import java.util.Map;

public class Checking {
	public static Customer findMyAccount(String email, Map<String, Customer> mapList) throws ErrorMain{
		Customer c = mapList.get(email);
		if(c== null) {
			throw new ErrorMain("Email is not present");
			}
		else{
			return c;
		}
		}
	
	
		
		
	}

