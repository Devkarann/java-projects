package stack.pacakge;

public interface Stack {
	public static int Max_size = 3;

    public void push(Customer c) throws  overFlowException;
    public void pop() throws overFlowException;
}
