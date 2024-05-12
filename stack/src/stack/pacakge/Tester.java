package stack.pacakge;
import java.util.*;

public class Tester {

	

	public static void main(String[] args) {
		 Stack stack = null;
		
		boolean check =false;
		while(!check) {
			System.out.println("Choose 1 for pusshing in fixed stack ");
			System.out.println("Choose 2 for pusshing in groable stack ");
			System.out.println("Choose 3 for popping from fixed stack ");
			//System.out.println("Choose 4 for popping from groable stack ");
			System.out.println("Choose 0 for exit ");
			Scanner sc = new Scanner(System.in);
			switch(sc.nextInt()) {
				case 1: 
					if(stack==null) {
						stack = new FixedStack();
					}
					else {
						try {
						System.out.println("Enter id, name, address for fixed");
						Customer c1 = new Customer(sc.nextInt(), sc.next(), sc.next());
						stack.push(c1);
						}
						catch(Exception e) {
							System.out.println(e);
						}
					}
					break;
					
				case 2:
					if(stack == null) {
						stack = new GroableStack();
					}
					else {
						try {
							System.out.println("Enter id, name, address for fixed");
							Customer c1 = new Customer(sc.nextInt(), sc.next(), sc.next());
							stack.push(c1);
							}
							catch(Exception e) {
								System.out.println(e);
							}
					}
					break;
					
				case 3:
					try {
						stack.pop();
						System.out.println("Successfully Deleted last customer");
					}catch(Exception e) {
						System.out.println(e);
					}
					
					break;
				case 4:
					check = true;
					break;
					
					
			}
			
		}
		
	}

}
