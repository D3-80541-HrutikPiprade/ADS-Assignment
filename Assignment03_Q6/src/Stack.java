

public class Stack {
	private String arr[];
	private final int SIZE;
	private int top;
	
	public Stack(int size) {
		SIZE = size;
		arr = new String[SIZE];
		top =-1;
	}
	
	public void push(String ele) {
		arr[++top]= ele;
	}
	
	public String pop() {
		return arr[top--];
	}
	
	public String peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==SIZE-1;
	}
}
