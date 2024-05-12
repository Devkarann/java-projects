package lab;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class validation {
	public static Phone validateAll(List<String>phone , String name, String date , String email,String key , Map<String, Phone>mapList ) {
		//findMyAccount.validateNumber(phone, mapList );
		
		return new Phone(phone, name, LocalDate.parse(date),email, key);
	}
}
