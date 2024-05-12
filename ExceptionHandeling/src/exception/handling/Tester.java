package exception.handling;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
//		try {
//			System.out.println("Enter the fuel type you want to check");
//			Scanner sc = new Scanner(System.in);
//			String str = sc.next();
//			CheckFuel.checking(str);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		finally{System.out.println("in finally");
//		}

	
	try {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		Date newDate = formatter.parse("31/05/2045");
		CheckFuel.lisenceCheck(newDate);
	}catch(Exception e){
		System.out.println(e);
	}
	}
}
