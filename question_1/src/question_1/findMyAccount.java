package question_1;

import java.util.Map;

public class findMyAccount {
	public static PenAccount findPen(int id, Map<Integer, PenAccount> stockList)throws ErrorMain {
		PenAccount a = stockList.get(id);
		if(a==null) {
			 throw new ErrorMain("invalid name");
		}
		else {
			return a;
		}
	}
}
