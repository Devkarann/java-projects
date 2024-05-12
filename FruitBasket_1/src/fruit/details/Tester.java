package fruit.details;
import java.util.*;

public class Tester {


	

	public static void main(String[] args) {
		System.out.println("Enter how many fruit you want to take as size ?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Fruit[] FruitBasket = new Fruit[n];
		boolean exit = false;
		int counter = 0;
		int index = 0;
		
		while(!exit) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Enter 1 for add mango");
			System.out.println("Enter 2 for add Orange");
			System.out.println("Enter 3 for add Apple");
			System.out.println("Enter 4 for get name of the Fruits in the basket");
			System.out.println("Enter 5 for getting name, color, weight of the fruit presnt in basket");
			System.out.println("Enter 6 for chekking whether fruit is stale or not by their taste");
			System.out.println("Enter 7 for changing the freshness of the Fruit");
			System.out.println("Enter 8 for for diplaying the perticular functionality of the fruits");
			System.out.println("Enter 0 for exit");
			System.out.println("-------------------------------------------------------------------------");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				
				
				if(counter < FruitBasket.length) {
				System.out.println("Enter the details color, weight, name , true/false");
				FruitBasket[counter] = new Mango(sc.next(), sc.nextInt(), sc.next(), sc.nextBoolean());
				counter++;
				break;
				}
				
			case 2:
			
				if(counter < FruitBasket.length) {
					System.out.println("Enter the details color, weight, name , true/false");
					FruitBasket[counter] = new Orange(sc.next(), sc.nextInt(), sc.next(), sc.nextBoolean());
					counter++;
					break;
		        }
				
			case 3:
				if(counter < FruitBasket.length) {
					System.out.println("Enter the details color, weight, name , true/false");
					FruitBasket[counter] = new Apple(sc.next(), sc.nextInt(), sc.next(), sc.nextBoolean());
					counter++;	
					break;
		        }
			case 4:
				for(int i =0; i<counter; i++) {
					System.out.println(FruitBasket[i].getName());
				}
				break;
				
				
			case 5:
					for(int i=0; i<counter; i++) {
					
						Fruit f = FruitBasket[i];
						if( f instanceof Mango) {
							System.out.print(FruitBasket[i].getName()+" ");
							System.out.print(FruitBasket[i].getColor()+" ");
							System.out.print(FruitBasket[i].getWeight()+" ");
							//System.out.print(FruitBasket[index].displayPerticular() + " ");
							System.out.println(((Mango)f).taste());
							
						}
						else if(f instanceof Apple) {
							System.out.print(FruitBasket[i].getName()+" ");
							System.out.print(FruitBasket[i].getColor()+" ");
							System.out.print(FruitBasket[i].getWeight()+" ");
							//System.out.print(FruitBasket[index].displayPerticular()+" ");
							System.out.println(((Apple)f).taste());
							
						}
						else if(f instanceof Orange) {
							System.out.print(FruitBasket[i].getName()+" ");
							System.out.print(FruitBasket[i].getColor()+" ");
							System.out.print(FruitBasket[i].getWeight()+" ");
							//System.out.print(FruitBasket[index].displayPerticular()+" ");
							System.out.println(((Orange)f).taste());
							
						}
				
					
					}
					break;
			
			case 6:
				boolean check = false;
				
				while(!check){
					
					System.out.println("Write index you want to check whether it is stale or not");
					int indexAt = sc.nextInt();
					
					
					if(indexAt < counter) {
						boolean b = FruitBasket[indexAt].getFresh();
						
					if(b == true){
						System.out.println(FruitBasket[indexAt].getName()+"It is fresh");
						check = true;
					    break;
					 }
					else if(b == false){
						System.out.println(FruitBasket[indexAt].getName()+" "+ "is stale");
						check = true;
						break;
					 }
					}
					else {
						System.out.println("invalid index please enter valid one");
					}
				}
				 
			case 7:
				for(int i=0; i<counter; i++) {
					
					Fruit f = FruitBasket[index];
					if(f instanceof Mango) {
						if(((Mango)f).taste() == "sour") {
							
							FruitBasket[i].setFresh(false);
						}
					}	
					
					else if(f instanceof Orange) {
						if(((Orange)f).taste() == "sour") {						
							FruitBasket[i].setFresh(false);
						}
					}
					else if(f instanceof Apple) {
						if(((Apple)f).taste() == "sour") {						
							FruitBasket[i].setFresh(false);
						}
					}
					
				}
				break;
				 
				 
			case 8: 
				boolean isFalse = false;
				
				while(!isFalse) {
					System.out.println("Enter the index you want to display specific functionality of fruit");
					int indexAtFruit = sc.nextInt();
					
					if(indexAtFruit < counter) {
						Fruit f = FruitBasket[indexAtFruit]; 
						
						if(f instanceof Mango) {
							System.out.println(((Mango)f).pulp());
							isFalse = true;
							break;
						}
						else if(f instanceof Orange) {
							System.out.println(((Orange)f).pulp());
							isFalse = true;
							break;
						}
						else if(f instanceof Orange) {
							System.out.println(((Apple)f).pulp());
							isFalse = true;
							break;
						}
					}
					else {
						System.out.println("Enter valid index");
					}
				}
				
				break;
				
				
				
			case 0:
				exit = true;
				break;
				
				
			}
			
			
		
	}

  }
}
