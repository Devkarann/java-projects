package customer.management;

import java.time.LocalDate;

public class Validation{
	public static Customer validateAll(String firstName, String lastName, String email, String password,
			double registrationAmount, String date, String sType) throws ErrorMain {
		
		Serviceplan type = Validatetype(sType);
		ValidateBalance(type, registrationAmount);
		
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
	
}
