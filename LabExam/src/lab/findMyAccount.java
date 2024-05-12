package lab;

import java.util.List;
import java.util.Map;

public class findMyAccount {

	public static Phone findKey(String key, Map<String, Phone> phoneList) {
		Phone p = phoneList.get(key);
		if(p == null) {
			System.out.println("Invalid user");
		}
		else {
			return p;
		}
		
	}

//	public static void validateNumber(List<String> phone, Map<String, Phone> mapList) {
//	
//		for(Phone p : mapList.values()) {
//			for(String s : phone) {
//				if(s.equals(p.getMobileNumber())) {
//					
//				} 
//			}
//		}
//		
//		
//	}
//	
	
	
}
