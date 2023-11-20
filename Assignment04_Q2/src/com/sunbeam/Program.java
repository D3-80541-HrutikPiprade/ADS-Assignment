package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		SCLinkedList cl = new SCLinkedList();
		
		cl.addFirst(10);
	    cl.addFirst(20);
		cl.addFirst(30);
		cl.addFirst(40);
		cl.addFirst(50);
		cl.addLast(100);
		cl.addLast(200);
		cl.deleteFirst();
		cl.deleteLast();
		
		//cl.display();
		cl.addPosition(300, 4);
		
		cl.display();
		cl.deletePosition(3);
		System.out.println();
		cl.display();

	}

}
