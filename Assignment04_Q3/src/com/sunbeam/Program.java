package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.display();
		System.out.println();
		ll.addAfter(100, 20);
		ll.display();
		System.out.println();
	
		ll.addBefore(5000, 20);
		ll.display();
		
		
	}

}
