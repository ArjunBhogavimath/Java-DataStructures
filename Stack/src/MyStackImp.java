

public class MyStackImp{
	private int stack[];
	private int top;
		
	
	
	
	public MyStackImp(int size) {
		
		stack=new int[size];
	}
	
	public void push(int data) throws Exception {
		if(top==stack.length) {
			throw new Exception("The Stack is full");
			
		}
		stack[top++]=data;
		
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("The stack is Empty");
		}
		int a = stack[--top];
		return a;
		
	}
	
	public boolean isEmpty(){
		return top==0;	
	}
	
	
	

}
