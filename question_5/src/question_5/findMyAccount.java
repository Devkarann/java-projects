package question_5;

import java.util.Map;

public class findMyAccount {
	public static AdminLogin findEmail(String email , Map<String, AdminLogin> adminList)throws ErrorMain {
		
		AdminLogin admin1 = adminList.get(email);
		if(admin1 == null) {
			 throw new ErrorMain("Email is invalid");
		}
		
		return admin1;
	}
	
	//public static AdminLogin findPass(String pass , Map<String, AdminLogin> adminList)throws ErrorMain {
		
		
		
//		AdminLogin admin2 = adminList.get(pass);
//		if(admin2 == null) {
//			 throw new ErrorMain("password is invalid");
//		}
//		
//		return admin2;
	//}
	
	public static Pet findPetId(int petId , Map<Integer, Pet> petList)throws ErrorMain {
		
		Pet pet2 = petList.get(petId);
		if(pet2 == null) {
			 throw new ErrorMain("Pet id invalid is invalid");
		}
		
		return pet2;
	}
	
	
	
	
}
