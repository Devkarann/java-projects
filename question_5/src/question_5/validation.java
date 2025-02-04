package question_5;

import java.util.Map;

public class validation {
	public static Pet validateAll(int petId, String name, String categoryType, double unitPrice, int stock) throws ErrorMain {
		
	Category cType = validateType(categoryType);	
		return new Pet(petId, name , cType, unitPrice, stock);
	}
	
	public static Category validateType(String type) {
		return Category.valueOf(type.toUpperCase());
	}
	public void validateStock(int stock)throws ErrorMain {
		if(stock < 0) {
		throw new ErrorMain("stock is over"); 
		}
	}

	public static Order validateOrderALL(int nextInt, int quantity, String type, Map<Integer, Pet> petList) throws ErrorMain{
		Status sType = validateOrderType(type);
		
		stockAvail( quantity, nextInt, petList );
		return new Order(nextInt, quantity, sType);
	}
	
	public static Status validateOrderType(String type)throws ErrorMain {
		return Status.valueOf(type.toUpperCase());
	}
	
	public static void stockAvail(int quantity, int nextInt, Map<Integer, Pet> petL) throws ErrorMain{
		Pet findMypetId = findMyAccount.findPetId(nextInt, petL);
		if(findMypetId.getStock() - quantity < 0) {
			throw new ErrorMain("Stock over");
		}
		
		else {
			findMypetId.setStock(findMypetId.getStock() - quantity);
		}
		
	}
}
