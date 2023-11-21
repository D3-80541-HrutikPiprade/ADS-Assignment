package com.sunbeam;

public class ProgramMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println("Using linkedList as Stack : ");
		st.push(10);
		st.push(20);
		st.push(30);
		st.peek();
		System.out.println("Peeked ele : "+st.peek());
		System.out.println("Popped ele : "+ st.pop());
		System.out.println("Popped ele : "+ st.pop());
		
		Queue qu = new Queue();
		System.out.println("Using linkedList as Queue : ");
		qu.push(10);
		qu.push(20);
		qu.push(30);
		
		System.out.println("Peeked ele : "+ qu.peek());
		System.out.println("Popped ele : "+ qu.pop());
		System.out.println("Popped ele : "+ qu.pop());

	}

}
