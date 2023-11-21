package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		DCLinkedList dcl = new DCLinkedList();
		dcl.addPosition(100, 90);
		dcl.addPosition(70, 1);
		dcl.addPosition(20, 2);
		dcl.addPosition(30, 3);
		dcl.addPosition(71, 6);
		dcl.deletePosition(2);
		
		dcl.display();

	}

}
