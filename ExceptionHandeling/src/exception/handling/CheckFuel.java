package exception.handling;
import java.util.Date;

import exception.handling.*;

public class CheckFuel extends Exception{
	
	public static Date DATE;
	static {
		DATE = new Date ("31/03/2023");
	}
	
	public static void lisenceCheck(Date d ) throws ErrorSend{
		if(DATE.before(d)) {
			throw new ErrorSend("Expired");
		}
		else {
			System.out.println("lisence not expired");
		}
	}

	public static void checking(String s) throws ErrorSend{
//		for(Validate v: Validate.values()) {
//			if(v.name().equalsIgnoreCase(s)) {
//				System.out.println("Yes it is of fuel type");
//				return;
//			}
//			else {
//				throw new ErrorSend("nOT A FUEL TYPE");
//			}
//		}
//		
//		// TODO Auto-generated method stub
//		
  }

	
	
}
