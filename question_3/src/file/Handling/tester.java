package file.Handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class tester {
	public static void main(String[] args) {
		String fileName = "dev.txt";
		try {
			BufferedReader br  = new BufferedReader(new FileReader(fileName));
			String Line = br.readLine();
			double sumDeposite= 0;
			double maxDeposite = 0;
			double maxWithdrawl = 0;
			double shoppingExpense = 0;
			String mxWithdrawlDate = "";
			
			while((Line = br.readLine())!= null ) {
				String[] fields = Line.split(",");
				double deposite = Double.parseDouble(fields[3]);
				double withdrawl = Double.parseDouble(fields[2]);
				
				if(deposite > 0) {
					if(deposite > maxDeposite) {
						maxDeposite = deposite;		
					}
					sumDeposite+= deposite;
				}
				
				if(withdrawl > 0 && fields[1].contains("Shopping")) {
					shoppingExpense+= withdrawl;
				}
				
				if(deposite > maxDeposite) {
					maxDeposite  = deposite;
					mxWithdrawlDate = fields[0];
				}
				
				
				
			}
			
			System.out.println("Sum of deposite is "+ sumDeposite);
			System.out.println("Sum of shopping expense "+ shoppingExpense);
			System.out.println("max withdrawl date "+ mxWithdrawlDate);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
