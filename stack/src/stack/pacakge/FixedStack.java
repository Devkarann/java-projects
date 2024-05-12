package stack.pacakge;


public class FixedStack implements Stack {
	public int top=-1;
    Customer[] custom = new Customer[Max_size];

    public void push(Customer c) throws overFlowException {
        if(top > custom.length-1){
           throw new  overFlowException("Stack over flow");

        }
        else{
            custom[++top] = c;
        }
    }
    
	public void pop() throws overFlowException{
        if(top<0){
            throw new overFlowException("Stack is empty");
        }
        else{
            System.out.println(custom[top--]);
        }
    }
	
	
	
	

}
