package question_8;

import java.time.LocalDate;
import java.util.Map;

public class validation {

	public static Stock validateAll(String id, String name, String companyName, double price, String date,	double quantity, Map<String, Stock>stockList)throws ErrorMain {
		
		findMyAccount.findId(id, stockList);
		findMyAccount.findDate(LocalDate.parse(date), stockList);
		
		return new Stock(id, name, companyName, price, LocalDate.parse(date), quantity);
	}

	public static void validateQuantity(double quant, Stock stId)throws ErrorMain {
		if((stId.getQuan()-quant)< 0) {
			throw new ErrorMain("this much quantity is not available");
		}
		else {
			stId.setQuan(stId.getQuan()-quant);
		}
		
	}

	public static void validateQuantitySell(double quant2, Stock stId2)throws ErrorMain {
		if((stId2.getQuan() + quant2 )  > stId2.getOriginalQuant() ) {
			throw new ErrorMain("Quantity is more than the original stock listed quantity");
		}
		else {
			stId2.setQuan( stId2.getQuan() +quant2);
		}

  }
}