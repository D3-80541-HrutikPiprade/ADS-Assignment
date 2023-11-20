package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.addSorted(30);
		ll.addSorted(40);
		ll.addSorted(10);
		ll.addSorted(70);
		ll.addSorted(5);
		ll.addSorted(50);
		ll.addSorted(60);
		ll.addSorted(20);
		
		ll.display();
	}

}
