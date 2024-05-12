package question_6;

import java.time.LocalDate;
import java.util.Map;

public class validation {
// name, date,  phone,  aadhaar,  monthSalary, hourSalary in case permanent 
	
	public static Employee validationAll(String name, String date, String phone, String aadhar, double perma, double temp, Map<Integer, Employee>empList)throws ErrorMain {
		Employee e = findMyAccount.findAadhar(aadhar, empList);
		return new Employee(name, LocalDate.parse(date), phone, aadhar, perma, temp);
	}

}
