package question_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Map<String, Stock> stockList = new HashMap<>();
		
		Stock s1 = new Stock("xyz", "rpower", "reliance" , 200, LocalDate.parse("2025-05-06"), 1000);
		stockList.put(s1.getId(), s1);
		s1.setOriginalQuant(s1.getQuan());
		Stock s2 = new Stock("abc", "rinfra", "reliance" , 400, LocalDate.parse("2025-07-06"), 7000);
		s2.setOriginalQuant(s2.getQuan());
		stockList.put(s2.getId(), s2);
		Stock s3 = new Stock("aaa", "tatasteel", "tata" , 215, LocalDate.parse("2024-05-06"), 1800);
		stockList.put(s3.getId(), s3);
		s3.setOriginalQuant(s3.getQuan());
		Stock s4 = new Stock("xxx", "tatapower", "tata" , 200, LocalDate.parse("2026-01-09"), 9000);
		stockList.put(s4.getId(), s4);
		s4.setOriginalQuant(s4.getQuan());
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = false;
		while(!check) {
			try {
				System.out.println("Enter 1 for adding the stock");
				System.out.println("Enter 2 for displaying stocks by the Company name");
				System.out.println("Enter 3 for purchases stocks");
				System.out.println("Enter 4 for sell stocks");
				System.out.println("Enter 5 for displaying the stocks");
				System.out.println("Enter 6 for serialization the stocks");
				System.out.println("Enter 0 for exit");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter stock id, name, company name, price, date, quantity");
					Stock  s = validation.validateAll(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.nextDouble(), stockList);
					stockList.put(s.getId(), s);
					s.setOriginalQuant(s.getQuan());
					System.out.println("Stock added succesfully");
					break;
					
				case 2:
					System.out.println("Enter company name");
					String cName = sc.next();
					for(Stock st : stockList.values()) {
						if(st.getCompanyName().equals(cName)) {
							System.out.println(st.toString());
						}
					}
					break;
					
				case 3:
					System.out.println("Enter stock id ");
					String sId= sc.next();
					Stock stId = findMyAccount.findIdStock(sId, stockList);
					System.out.println("Enter quantity ");
					double quant =  sc.nextDouble();
					validation.validateQuantity(quant, stId);
					System.out.println("stock purchased succesfully");
					break;
					
				case 4:
					System.out.println("Enter stock id ");
					String sId2= sc.next();
					Stock stId2 = findMyAccount.findIdStock(sId2, stockList);
					System.out.println("Enter quantity ");
					double quant2 = sc.nextDouble();
					validation.validateQuantitySell(quant2, stId2);
					System.out.println("stock sell succesfully ");
					break;					
					
				case 5:
					for(Stock s5: stockList.values()) {
						System.out.println(s5);
					}
					break;
					
				case 6:
					FileOutputStream fileOut = new FileOutputStream("stock.txt");
					ObjectOutputStream out = new ObjectOutputStream(fileOut);
					out.writeObject(stockList);
					fileOut.close();
					out.close();
					System.out.println("File added suucesfully");
					break;
					
				case 0:
					check = true;
					break;
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		

	}

}
