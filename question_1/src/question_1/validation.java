package question_1;

import java.time.LocalDate;

public class validation {
	public static PenAccount validateAll(String brand,String color, String inkcolor, String materialType, int availStock, 
			 String ListingDate, double price, double discount) throws ErrorMain {
		
		Material material = validateMaterial( materialType);
		return new PenAccount(brand, color, inkcolor, material, availStock, LocalDate.parse(ListingDate), price, discount) ; 
		
	}
	
	public static Material validateMaterial(String materialType) throws ErrorMain {
		return Material.valueOf(materialType.toUpperCase());
	
	}

}
