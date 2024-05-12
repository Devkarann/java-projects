package customer.map;

import java.time.LocalDate;
import java.util.Map;

public class Validation {
	public static Customer validateAll(String firstName, String lastName, String email, String password,
			double registrationAmount, String date, String sType, Map<String, Customer> mapList) throws ErrorMain {
		
		Serviceplan type = Validatetype(sType);
		ValidateBalance(type, registrationAmount);
		ValidateEmail(email , mapList);
		return new Customer(firstName,  lastName,  email, password,
			registrationAmount, LocalDate.parse( date),  type);
		
	}
	public static Serviceplan Validatetype(String sType) throws ErrorMain {
		return Serviceplan.valueOf(sType.toUpperCase());	
	}
	
	public static void ValidateBalance(Serviceplan type, double registrationAmount ) throws ErrorMain {
		if(type.planAmount > registrationAmount){	
			throw new ErrorMain("garib hai tu");
			}
		else if(type.planAmount < registrationAmount) {
			throw new ErrorMain("Bhot amir hai bhaiii");
		}
		}
	
	public static void ValidateEmail(String email, Map<String, Customer> mapList) throws ErrorMain{
		if(mapList.containsKey(email)) {
			throw new ErrorMain("already exist email id");
		}
	}
}
