package question_8;

import java.time.LocalDate;
import java.util.Map;

public class findMyAccount {

	public static void findId(String id, Map<String, Stock> stockList)throws ErrorMain {
		Stock find = stockList.get(id);
		if(find != null) {
			throw new ErrorMain("duplicate id");
		}
		
	}

	public static void findDate(LocalDate date, Map<String, Stock> stockList)throws ErrorMain {
		String d = "2024-04-28";
		if(date.isBefore(LocalDate.parse(d))) {
			throw new ErrorMain("IT is not a future date");
		}
	}

	public static Stock findIdStock(String sId, Map<String, Stock> stockList)throws ErrorMain {
		Stock stockId = stockList.get(sId);
		if(stockId == null) {
			throw new ErrorMain("Invalid stock id");
		}
		return stockId;
	}
}
