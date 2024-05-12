package question_6;

import java.util.Map;

public class findMyAccount {

	public static Employee findAadhar(String aadhar, Map<Integer, Employee> empList)throws ErrorMain {
		
		Employee e = empList.get(aadhar);
		if(e != null) {
			 throw new ErrorMain("Duplicate entry");	
		}
		return e;
		
	}
	public static Employee findId(int id, Map<Integer, Employee> empList)throws ErrorMain {
		
		Employee e = empList.get(id);
		if(e == null) {
			 throw new ErrorMain("invalid id");	
		}
		return e;
		
	}

}
