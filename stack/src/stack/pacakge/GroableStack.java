package stack.pacakge;

public class GroableStack extends FixedStack{
	public void push(Customer c){
        if(top < custom.length-1){
            custom[++top] = c;
        }
        else{
            Customer[] temp = new Customer[Max_size*2];
            for(int i=0; i<temp.length; i++){
                temp[i] = custom[i];
            }
            custom = temp;
        }
    }
    public void pop()throws overFlowException{
        if(top>= 0){
            System.out.println(custom[top--]);
        }
        else{
           throw new overFlowException("Stack underflow");
        }
    }
}
